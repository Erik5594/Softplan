package com.softplan.cadastropessoasapi.services.impl;

import com.softplan.cadastropessoasapi.adapter.EnderecoAdapter;
import com.softplan.cadastropessoasapi.adapter.PessoaAdapter;
import com.softplan.cadastropessoasapi.adapter.PessoaDtoAdapter;
import com.softplan.cadastropessoasapi.domain.PessoaDto;
import com.softplan.cadastropessoasapi.entity.Endereco;
import com.softplan.cadastropessoasapi.entity.Pessoa;
import com.softplan.cadastropessoasapi.repository.EnderecoRepository;
import com.softplan.cadastropessoasapi.repository.PessoaRepository;
import com.softplan.cadastropessoasapi.services.PessoaServices;
import com.softplan.cadastropessoasapi.services.exceptions.CpfException;
import com.softplan.cadastropessoasapi.services.exceptions.PessoaException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author erik_
 * Data Criacao: 21/01/2021 - 23:40
 */

@Service
public class PessoaServicesImpl implements PessoaServices {

    @Autowired
    private PessoaRepository pessoaRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    public String cadastrar(PessoaDto pessoaDto) {
        if(!existeCadastro(pessoaDto.getCpf())){
            Pessoa pessoa = PessoaAdapter.getPessoa(pessoaDto, null);
            pessoaRepository.save(pessoa);
            Endereco endereco = EnderecoAdapter.getEndereco(pessoaDto.getEndereco(), null);
            endereco.setPessoa(pessoa);
            enderecoRepository.save(endereco);
            return pessoa.getCpf();
        }else{
            throw new PessoaException(String.format("Pessoa [%s] já está cadastrada.", pessoaDto.getCpf()), HttpStatus.BAD_REQUEST.value());
        }
    }

    @Override
    public String alterar(PessoaDto pessoaDto) {
        if(existeCadastro(pessoaDto.getCpf())){
            Pessoa pessoaExistente = pessoaRepository.findById(pessoaDto.getCpf().replaceAll("\\D", "")).orElse(null);
            pessoaRepository.save(PessoaAdapter.getPessoa(pessoaDto, pessoaExistente));
        }else{
            throw new PessoaException("A pessoa não pôde ser encontrada.", HttpStatus.NOT_FOUND.value());
        }
        return pessoaDto.getCpf();
    }

    @Override
    public List<PessoaDto> listar() {
        List<Pessoa> pessoas = pessoaRepository.findAll();
        List<PessoaDto> pessoaDtoList = new ArrayList<>();
        if(pessoas != null){
            for(Pessoa pessoa : pessoas){
                pessoaDtoList.add(PessoaDtoAdapter.getPessoaDto(pessoa));
            }
        }
        return pessoaDtoList;
    }

    private boolean existeCadastro(String cpf){
        try {
            buscar(cpf);
            return true;
        } catch (PessoaException e){
            return false;
        }
    }

    @Override
    public PessoaDto buscar(String cpf) {
        if(StringUtils.isNotBlank(cpf)){
            Pessoa pessoa = pessoaRepository.findById(cpf.replaceAll("\\D","")).orElse(null);
            if(pessoa == null){
                throw new PessoaException("A pessoa não pôde ser encontrada.", HttpStatus.NOT_FOUND.value());
            }
            return PessoaDtoAdapter.getPessoaDto(pessoa);
        }
        throw new CpfException("CPF não informado.", HttpStatus.BAD_REQUEST.value());
    }

    @Override
    public void deletar(String cpf) {
        try{
            pessoaRepository.deleteById(cpf.replaceAll("\\D",""));
        }catch (EmptyResultDataAccessException e){
            throw new PessoaException("A pessoa não pôde ser encontrada", HttpStatus.NOT_FOUND.value());
        }
    }
}

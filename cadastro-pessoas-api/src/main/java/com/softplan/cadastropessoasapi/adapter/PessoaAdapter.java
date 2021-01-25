package com.softplan.cadastropessoasapi.adapter;

import com.softplan.cadastropessoasapi.domain.PessoaDto;
import com.softplan.cadastropessoasapi.entity.Endereco;
import com.softplan.cadastropessoasapi.entity.Pessoa;
import com.softplan.cadastropessoasapi.entity.Sexo;

import java.util.Date;

/**
 * @author erik_
 * Data Criacao: 21/01/2021 - 23:45
 */
public class PessoaAdapter {

    public static Pessoa getPessoa(final PessoaDto pessoaDto, Pessoa pessoaExistente){
        boolean cadastro = true;
        if(pessoaDto == null){
            return null;
        }
        Pessoa pessoa;

        if(pessoaExistente != null){
            pessoa = pessoaExistente;
            pessoa.setUltimaAlteracao(new Date());
            cadastro = false;
        }else{
            pessoa = new Pessoa();
            pessoa.setDataCriacao(new Date());
        }

        pessoa.setCpf(pessoaDto.getCpf().replaceAll("\\D",""));
        pessoa.setNome(pessoaDto.getNome());
        pessoa.setDataNascimento(pessoaDto.getDataNascimento());
        pessoa.setEmail(pessoaDto.getEmail());
        pessoa.setNacionalidade(pessoaDto.getNacionalidade());
        pessoa.setNaturalidade(pessoaDto.getNaturalidade());
        pessoa.setSexo(Sexo.FEMININO.getDescricao().equalsIgnoreCase(pessoaDto.getSexo()) ? Sexo.FEMININO:Sexo.MASCULINO);
        if(pessoaDto.getEndereco() != null){
            Endereco endereco = EnderecoAdapter.getEndereco(pessoaDto.getEndereco(), cadastro ? null:pessoaExistente.getEndereco());
            endereco.setPessoa(pessoa);
        }

        return pessoa;
    }
}

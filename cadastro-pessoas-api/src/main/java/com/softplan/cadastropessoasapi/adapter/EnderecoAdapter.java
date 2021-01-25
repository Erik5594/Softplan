package com.softplan.cadastropessoasapi.adapter;

import com.softplan.cadastropessoasapi.domain.EnderecoDto;
import com.softplan.cadastropessoasapi.domain.PessoaDto;
import com.softplan.cadastropessoasapi.entity.Endereco;
import com.softplan.cadastropessoasapi.entity.Pessoa;
import com.softplan.cadastropessoasapi.entity.Sexo;

import java.util.Date;

/**
 * @author erik_
 * Data Criacao: 21/01/2021 - 23:45
 */
public class EnderecoAdapter {

    public static Endereco getEndereco(final EnderecoDto enderecoDto, Endereco enderecoExistente){
        if(enderecoDto == null){
            return null;
        }
        Endereco endereco;
        if(enderecoExistente != null){
            endereco = enderecoExistente;
            endereco.setUltimaAlteracao(new Date());
        }else{
            endereco = new Endereco();
            endereco.setDataCriacao(new Date());
        }
        endereco.setBairro(enderecoDto.getBairro());
        endereco.setCep(enderecoDto.getCep());
        endereco.setCidade(enderecoDto.getCidade());
        endereco.setComplemento(enderecoDto.getComplemento());
        endereco.setLogradouro(enderecoDto.getLogradouro());
        endereco.setNumero(enderecoDto.getNumero());
        endereco.setPais(enderecoDto.getPais());
        endereco.setUf(enderecoDto.getUf());

        return endereco;
    }
}

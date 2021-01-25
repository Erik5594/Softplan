package com.softplan.cadastropessoasapi.adapter;

import com.softplan.cadastropessoasapi.domain.EnderecoDto;
import com.softplan.cadastropessoasapi.entity.Endereco;

/**
 * @author erik_
 * Data Criacao: 21/01/2021 - 23:45
 */
public class EnderecoDtoAdapter {

    public static EnderecoDto getEnderecoDto(final Endereco endereco){
        if(endereco == null){
            return null;
        }
        EnderecoDto enderecoDto = new EnderecoDto();
        enderecoDto.setBairro(endereco.getBairro());
        enderecoDto.setCep(endereco.getCep());
        enderecoDto.setCidade(endereco.getCidade());
        enderecoDto.setComplemento(endereco.getComplemento());
        enderecoDto.setLogradouro(endereco.getLogradouro());
        enderecoDto.setNumero(endereco.getNumero());
        enderecoDto.setPais(endereco.getPais());
        enderecoDto.setUf(endereco.getUf());

        return enderecoDto;
    }
}

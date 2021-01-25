package com.softplan.cadastropessoasapi.util;

import com.softplan.cadastropessoasapi.domain.EnderecoDto;
import com.softplan.cadastropessoasapi.services.exceptions.EnderecoException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;

/**
 * @author erik_
 * Data Criacao: 23/01/2021 - 13:38
 */
public class EnderecoDtoValidator {
    public static void executarValidacao(EnderecoDto enderecoDto){
        if(enderecoDto == null){
            throw new EnderecoException(String.format(Constantes.PARAMETRO_OBRIGATORIO,"Endereço"), HttpStatus.BAD_REQUEST.value());
        }
        if(StringUtils.isBlank(enderecoDto.getCep())){
            throw new EnderecoException(String.format(Constantes.PARAMETRO_OBRIGATORIO,"CEP"), HttpStatus.BAD_REQUEST.value());
        }
        if(StringUtils.isBlank(enderecoDto.getBairro())){
            throw new EnderecoException(String.format(Constantes.PARAMETRO_OBRIGATORIO,"Bairro"), HttpStatus.BAD_REQUEST.value());
        }
        if(StringUtils.isBlank(enderecoDto.getLogradouro())){
            throw new EnderecoException(String.format(Constantes.PARAMETRO_OBRIGATORIO,"Logradouro"), HttpStatus.BAD_REQUEST.value());
        }
        if(StringUtils.isBlank(enderecoDto.getCidade())){
            throw new EnderecoException(String.format(Constantes.PARAMETRO_OBRIGATORIO,"Cidade"), HttpStatus.BAD_REQUEST.value());
        }
        if(StringUtils.isBlank(enderecoDto.getUf())){
            throw new EnderecoException(String.format(Constantes.PARAMETRO_OBRIGATORIO,"UF"), HttpStatus.BAD_REQUEST.value());
        }
        if(StringUtils.isBlank(enderecoDto.getPais())){
            throw new EnderecoException(String.format(Constantes.PARAMETRO_OBRIGATORIO,"País"), HttpStatus.BAD_REQUEST.value());
        }
    }
}

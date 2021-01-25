package com.softplan.cadastropessoasapi.util;

import com.softplan.cadastropessoasapi.domain.PessoaDto;
import com.softplan.cadastropessoasapi.services.exceptions.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;

/**
 * @author erik_
 * Data Criacao: 23/01/2021 - 11:30
 */
public class PessoaDtoValidator {
    public static void executarValidacao(PessoaDto pessoaDto){
        if(pessoaDto == null){
            throw new ParametroException("É obrigatório os dados de uma pessoa. Nenhum dados foi recebido na requisição.", HttpStatus.BAD_REQUEST.value());
        }
        if(StringUtils.isBlank(pessoaDto.getNome())){
            throw new NomeException(String.format(Constantes.PARAMETRO_OBRIGATORIO, "Nome"), HttpStatus.BAD_REQUEST.value());
        }
        if(pessoaDto.getDataNascimento() == null){
            throw new DataException(String.format(Constantes.PARAMETRO_OBRIGATORIO, "Data de Nascimento"), HttpStatus.BAD_REQUEST.value());
        }
        if(StringUtils.isBlank(pessoaDto.getCpf())){
            throw new CpfException(String.format(Constantes.PARAMETRO_OBRIGATORIO, "CPF"), HttpStatus.BAD_REQUEST.value());
        }
        if(StringUtils.isNotBlank(pessoaDto.getEmail()) && !pessoaDto.getEmail().contains("@")){
            throw new EmailException(String.format(Constantes.PARAMETRO_INVALIDO, "E-mail"), HttpStatus.BAD_REQUEST.value());
        }
        if(!CpfValidator.isValido(pessoaDto.getCpf())){
            throw new CpfException(String.format(Constantes.PARAMETRO_INVALIDO, "CPF"), HttpStatus.BAD_REQUEST.value());
        }
        if(!CpfValidator.isFormatoValido(pessoaDto.getCpf())){
            throw new CpfException(String.format(Constantes.FORMATO_INVALIDO, "CPF"), HttpStatus.BAD_REQUEST.value());
        }
    }

}

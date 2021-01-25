package com.softplan.cadastropessoasapi.services.exceptions;

/**
 * @author erik_
 * Data Criacao: 23/01/2021 - 11:22
 */
public class EnderecoException extends GenericException {

    public EnderecoException(String message, int status) {
        super(message, status);
    }

    public EnderecoException(String message, Throwable cause, int status) {
        super(message, cause, status);
    }
}

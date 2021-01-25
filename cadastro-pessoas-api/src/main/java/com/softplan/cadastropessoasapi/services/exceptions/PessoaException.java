package com.softplan.cadastropessoasapi.services.exceptions;

/**
 * @author erik_
 * Data Criacao: 23/01/2021 - 14:54
 */
public class PessoaException extends GenericException {
    public PessoaException(String message, int status) {
        super(message, status);
    }

    public PessoaException(String message, int status, Throwable cause) {
        super(message, cause, status);
    }
}

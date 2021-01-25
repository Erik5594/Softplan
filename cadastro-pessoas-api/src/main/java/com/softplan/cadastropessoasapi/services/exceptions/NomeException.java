package com.softplan.cadastropessoasapi.services.exceptions;

/**
 * @author erik_
 * Data Criacao: 23/01/2021 - 11:24
 */
public class NomeException extends GenericException {
    public NomeException(String message, int status) {
        super(message, status);
    }

    public NomeException(String message, int status, Throwable cause) {
        super(message, cause, status);
    }
}

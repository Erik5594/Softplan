package com.softplan.cadastropessoasapi.services.exceptions;

/**
 * @author erik_
 * Data Criacao: 23/01/2021 - 11:23
 */
public class EmailException extends GenericException {
    public EmailException(String message, int status) {
        super(message, status);
    }

    public EmailException(String message, Throwable cause, int status) {
        super(message, cause, status);
    }
}

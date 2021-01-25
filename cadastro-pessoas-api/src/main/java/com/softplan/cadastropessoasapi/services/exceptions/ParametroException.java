package com.softplan.cadastropessoasapi.services.exceptions;

/**
 * @author erik_
 * Data Criacao: 23/01/2021 - 11:33
 */
public class ParametroException extends GenericException {
    public ParametroException(String message, int status) {
        super(message, status);
    }

    public ParametroException(String message, Throwable cause, int status) {
        super(message, cause, status);
    }
}

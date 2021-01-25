package com.softplan.cadastropessoasapi.services.exceptions;

/**
 * @author erik_
 * Data Criacao: 23/01/2021 - 11:24
 */
public class DataException extends GenericException {

    public DataException(String message, int status) {
        super(message, status);
    }

    public DataException(String message, Throwable cause, int status) {
        super(message, cause, status);
    }
}

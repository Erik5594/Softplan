package com.softplan.cadastropessoasapi.services.exceptions;

/**
 * @author erik_
 * Data Criacao: 23/01/2021 - 11:25
 */
public class CpfException extends GenericException {
    public CpfException(String message, int status) {
        super(message, status);
    }

    public CpfException(String message, Throwable cause, int status) {
        super(message, cause, status);
    }
}

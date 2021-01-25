package com.softplan.cadastropessoasapi.services.exceptions;

import lombok.Data;

/**
 * @author erik_
 * Data Criacao: 24/01/2021 - 11:23
 */
public @Data class GenericException extends RuntimeException {

    private int status;

    public GenericException(String message, int status) {
        super(message);
        this.status = status;
    }

    public GenericException(String message, Throwable cause, int status) {
        super(message, cause);
        this.status = status;
    }
}

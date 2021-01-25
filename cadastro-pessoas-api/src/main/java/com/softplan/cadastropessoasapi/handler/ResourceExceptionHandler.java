package com.softplan.cadastropessoasapi.handler;

import com.softplan.cadastropessoasapi.domain.DetalhesErro;
import com.softplan.cadastropessoasapi.services.exceptions.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * @author erik_
 * Data Criacao: 23/01/2021 - 15:00
 */

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(GenericException.class)
    public ResponseEntity<DetalhesErro> handleException
            (GenericException e, HttpServletRequest request) {

        DetalhesErro erro = new DetalhesErro();
        erro.setStatus(e.getStatus());
        erro.setDescricao(e.getMessage());
        erro.setTimestamp(System.currentTimeMillis());

        return ResponseEntity.status(erro.getStatus()).body(erro);
    }
}

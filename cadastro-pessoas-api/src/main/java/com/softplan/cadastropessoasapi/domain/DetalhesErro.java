package com.softplan.cadastropessoasapi.domain;

import lombok.Data;

/**
 * @author erik_
 * Data Criacao: 24/01/2021 - 11:19
 */
public @Data class DetalhesErro {

    private int status;
    private String descricao;
    private Long timestamp;

}
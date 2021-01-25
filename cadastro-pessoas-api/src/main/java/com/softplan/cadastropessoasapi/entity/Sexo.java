package com.softplan.cadastropessoasapi.entity;

/**
 * @author erik_
 * Data Criacao: 21/01/2021 - 23:21
 */
public enum Sexo {
    MASCULINO("Masculino"), FEMININO("Feminino");

    private String descricao;

    Sexo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

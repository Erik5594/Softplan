package com.softplan.cadastropessoasapi.domain;

import lombok.Data;

/**
 *
 * @author erik_
 * Data Criacao: 21/01/2021 - 21:45
 */
public @Data class EnderecoDto {

    private String cep;
    private String logradouro;
    private String complemento;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;
    private String pais;

}

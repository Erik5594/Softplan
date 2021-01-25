package com.softplan.cadastropessoasapi.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author erik_
 * Data Criacao: 21/01/2021 - 21:45
 */
@Entity
public @Data class Endereco extends AuditoriaGenerica{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 10)
    private String cep;
    private String logradouro;
    private String complemento;
    private String numero;
    private String bairro;
    @Column(nullable = false)
    private String cidade;
    @Column(nullable = false, length = 2)
    private String uf;
    @Column(nullable = false)
    private String pais;

    @OneToOne
    private Pessoa pessoa;

}

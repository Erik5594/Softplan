package com.softplan.cadastropessoasapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @author erik_
 * Data Criacao: 21/01/2021 - 21:42
 */

@AllArgsConstructor
@NoArgsConstructor

@Entity
public @Data class Pessoa extends AuditoriaGenerica {

    @Id
    @Column(length = 11)
    private String cpf;

    @Column(nullable = false)
    private String nome;

    @Enumerated
    private Sexo sexo;

    private String email;

    @Column(nullable = false)
    private Date dataNascimento;

    private String naturalidade;

    private String nacionalidade;

    @OneToOne(mappedBy = "pessoa", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Endereco endereco;

    @Override
    public Object getId() {
        return this.cpf;
    }
}

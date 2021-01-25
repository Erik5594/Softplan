package com.softplan.cadastropessoasapi.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.Persistable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import java.util.Date;

/**
 * @author erik_
 * Data Criacao: 22/01/2021 - 17:43
 */
@Data

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AuditoriaGenerica implements Persistable {

    @CreatedDate
    @Column(name = "data_criacao", nullable = false, updatable = false)
    private Date dataCriacao;

    @LastModifiedDate
    @Column(name = "data_ultima_alteracao")
    private Date ultimaAlteracao;

    @Transient
    @Override
    public boolean isNew() {
        return null == dataCriacao;
    }
}

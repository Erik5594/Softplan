package com.softplan.cadastropessoasapi.repository;

import com.softplan.cadastropessoasapi.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author erik_
 * Data Criacao: 21/01/2021 - 23:36
 */
public interface PessoaRepository extends JpaRepository<Pessoa, String> {
}

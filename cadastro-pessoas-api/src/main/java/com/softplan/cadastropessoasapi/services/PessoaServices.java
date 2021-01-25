package com.softplan.cadastropessoasapi.services;

import com.softplan.cadastropessoasapi.domain.PessoaDto;

import java.util.List;

/**
 * @author erik_
 * Data Criacao: 21/01/2021 - 23:39
 */
public interface PessoaServices {

    String cadastrar(PessoaDto pessoaDto);
    String alterar(PessoaDto pessoaDto);
    List<PessoaDto> listar();
    PessoaDto buscar(String cpf);
    void deletar(String cpf);

}

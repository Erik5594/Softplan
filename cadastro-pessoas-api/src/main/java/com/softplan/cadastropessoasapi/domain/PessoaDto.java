package com.softplan.cadastropessoasapi.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.Date;

/**
 * @author erik_
 * Data Criacao: 21/01/2021 - 21:42
 */
public @Data class PessoaDto {

    private String cpf;

    private String nome;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sexo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String email;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataNascimento;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String naturalidade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String nacionalidade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private EnderecoDto endereco;

}

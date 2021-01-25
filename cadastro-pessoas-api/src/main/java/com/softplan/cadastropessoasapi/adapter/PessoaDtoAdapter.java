package com.softplan.cadastropessoasapi.adapter;

import com.softplan.cadastropessoasapi.domain.PessoaDto;
import com.softplan.cadastropessoasapi.entity.Pessoa;
import org.apache.commons.lang3.StringUtils;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

/**
 * @author erik_
 * Data Criacao: 21/01/2021 - 23:45
 */
public class PessoaDtoAdapter {

    public static PessoaDto getPessoaDto(final Pessoa pessoa){
        if(pessoa == null){
            return null;
        }
        PessoaDto pessoaDto = new PessoaDto();

        pessoaDto.setCpf(formatarCpf(pessoa.getCpf()));
        pessoaDto.setNome(pessoa.getNome());
        pessoaDto.setDataNascimento(pessoa.getDataNascimento());
        pessoaDto.setEmail(pessoa.getEmail());
        pessoaDto.setNacionalidade(pessoa.getNacionalidade());
        pessoaDto.setNaturalidade(pessoa.getNaturalidade());
        pessoaDto.setSexo(pessoa.getSexo().getDescricao());
        if(pessoa.getEndereco() != null){
            pessoaDto.setEndereco(EnderecoDtoAdapter.getEnderecoDto(pessoa.getEndereco()));
        }

        return pessoaDto;
    }

    private static String formatarCpf(String cpf){
        if(StringUtils.isNotBlank(cpf) && cpf.length() == 11) {
            try {
                MaskFormatter formatter = new MaskFormatter("###.###.###-##");
                formatter.setValueContainsLiteralCharacters(false);
                return formatter.valueToString(cpf);
            } catch (ParseException e) {
                return null;
            }
        }
        return null;
    }
}

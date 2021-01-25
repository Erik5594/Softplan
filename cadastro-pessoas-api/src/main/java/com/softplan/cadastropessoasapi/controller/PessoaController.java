package com.softplan.cadastropessoasapi.controller;

import com.softplan.cadastropessoasapi.domain.PessoaDto;
import com.softplan.cadastropessoasapi.services.PessoaServices;
import com.softplan.cadastropessoasapi.util.EnderecoDtoValidator;
import com.softplan.cadastropessoasapi.util.PessoaDtoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Calendar;
import java.util.List;

/**
 * @author erik_
 * Data Criacao: 21/01/2021 - 21:26
 */

@RestController
@RequestMapping("/rest")
public class PessoaController {

    @Autowired
    private PessoaServices pessoaServices;

    @RequestMapping(value = "/v1/pessoas", method = RequestMethod.GET)
    public ResponseEntity<List<PessoaDto>> listar(){
        return ResponseEntity.ok(pessoaServices.listar());
    }

    @RequestMapping(value = "/v1/pessoas/{cpf}", method = RequestMethod.GET)
    public ResponseEntity<?> buscar(@PathVariable("cpf") String cpf){
        PessoaDto pessoaDto = pessoaServices.buscar(cpf);
        return ResponseEntity.ok(pessoaDto);
    }

    @RequestMapping(value = "/v1/pessoas", method = RequestMethod.POST)
    public ResponseEntity<?> salvar(@RequestBody PessoaDto pessoaDto){
        PessoaDtoValidator.executarValidacao(pessoaDto);
        pessoaServices.cadastrar(pessoaDto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{cpf}").buildAndExpand(pessoaDto.getCpf()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value = "/v1/pessoas/{cpf}", method = RequestMethod.PUT)
    public ResponseEntity<Void> atualizar(@PathVariable String cpf, @RequestBody PessoaDto pessoaDto){
        pessoaDto.setCpf(cpf);
        PessoaDtoValidator.executarValidacao(pessoaDto);
        pessoaServices.alterar(pessoaDto);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/v2/pessoas", method = RequestMethod.POST)
    public ResponseEntity<?> salvarComEndereco(@RequestBody PessoaDto pessoaDto){
        PessoaDtoValidator.executarValidacao(pessoaDto);
        EnderecoDtoValidator.executarValidacao(pessoaDto.getEndereco());
        pessoaServices.cadastrar(pessoaDto);
        URI uri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/rest/v1/pessoas/{cpf}").buildAndExpand(pessoaDto.getCpf()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value = "/v2/pessoas/{cpf}", method = RequestMethod.PUT)
    public ResponseEntity<Void> atualizarComEndereco(@PathVariable String cpf, @RequestBody PessoaDto pessoaDto){
        pessoaDto.setCpf(cpf);
        PessoaDtoValidator.executarValidacao(pessoaDto);
        EnderecoDtoValidator.executarValidacao(pessoaDto.getEndereco());
        pessoaServices.alterar(pessoaDto);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/v1/pessoas/{cpf}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> remover(@PathVariable String cpf){
        pessoaServices.deletar(cpf);
        return ResponseEntity.noContent().build();
    }

    private void mock(){
        PessoaDto pessoaDto = new PessoaDto();
        pessoaDto.setCpf("03554424188");
        pessoaDto.setNome("Erik Queiroz de Oliveira");
        pessoaDto.setEmail("erik.derick74@gmail.com");
        Calendar nascimento = Calendar.getInstance();
        nascimento.set(1994,Calendar.MAY,5);
        pessoaDto.setDataNascimento(nascimento.getTime());
        pessoaDto.setEndereco(null);
        pessoaDto.setNacionalidade("Brasil");
        pessoaDto.setNaturalidade("Goiânia/GO");
        pessoaDto.setSexo("Masculino");

        PessoaDto pessoaDto1 = new PessoaDto();
        pessoaDto1.setCpf("70110040171");
        pessoaDto1.setNome("Laizorrane R. P. Teixeira de Oliveira");
        pessoaDto1.setEmail("laizorrane@gmail.com");
        Calendar nascimentoLaiz = Calendar.getInstance();
        nascimentoLaiz.set(1995,Calendar.MARCH,21);
        pessoaDto1.setDataNascimento(nascimentoLaiz.getTime());
        pessoaDto1.setEndereco(null);
        pessoaDto1.setNacionalidade("Brasil");
        pessoaDto1.setNaturalidade("Goiânia/GO");
        pessoaDto1.setSexo("Feminino");
    }
}
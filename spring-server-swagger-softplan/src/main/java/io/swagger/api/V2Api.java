/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.PessoaV2;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-01-24T20:18:35.558Z")

@Api(value = "v2", description = "the v2 API")
@RequestMapping(value = "/rest")
public interface V2Api {

    @ApiOperation(value = "Alterar pessoa *Endereço obrigatório", nickname = "alterarPessoaV2", notes = "Realizar alteração no cadastro de uma pessoa.", tags={ "Pessoas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Pessoa cadastrada com sucesso"),
        @ApiResponse(code = 400, message = "Parâmetro obrigatório não informado ou inválido"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    @RequestMapping(value = "/v2/pessoas/{cpf}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> alterarPessoaV2(@ApiParam(value = "CPF da pessoa a ser alterada no sistema.",required=true) @PathVariable("cpf") String cpf,@ApiParam(value = "" ,required=true )  @Valid @RequestBody PessoaV2 pessoa);


    @ApiOperation(value = "Cadastrar pessoa *Endereço obrigatório", nickname = "cadastroPessoaV2", notes = "Realizar o cadastro de uma pessoa no sistema", tags={ "Pessoas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Pessoa cadastrada com sucesso"),
        @ApiResponse(code = 400, message = "Parâmetro obrigatório não informado ou inválido"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    @RequestMapping(value = "/v2/pessoas",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> cadastroPessoaV2(@ApiParam(value = "" ,required=true )  @Valid @RequestBody PessoaV2 pessoa);

}
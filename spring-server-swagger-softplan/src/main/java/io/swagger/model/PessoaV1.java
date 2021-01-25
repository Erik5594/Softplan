package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Endereco;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PessoaV1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-01-24T20:18:35.558Z")




public class PessoaV1   {
  @JsonProperty("cpf")
  private String cpf = null;

  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("sexo")
  private String sexo = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("dataNascimento")
  private String dataNascimento = null;

  @JsonProperty("naturalidade")
  private String naturalidade = null;

  @JsonProperty("nacionalidade")
  private String nacionalidade = null;

  @JsonProperty("endereco")
  private Endereco endereco = null;

  public PessoaV1 cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

  /**
   * Get cpf
   * @return cpf
  **/
  @ApiModelProperty(example = "999.999.999-99", required = true, value = "")
  @NotNull


  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public PessoaV1 nome(String nome) {
    this.nome = nome;
    return this;
  }

  /**
   * Get nome
   * @return nome
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public PessoaV1 sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }

  /**
   * Get sexo
   * @return sexo
  **/
  @ApiModelProperty(value = "")


  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public PessoaV1 email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PessoaV1 dataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }

  /**
   * Get dataNascimento
   * @return dataNascimento
  **/
  @ApiModelProperty(example = "dd/mm/aaaa", required = true, value = "")
  @NotNull


  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public PessoaV1 naturalidade(String naturalidade) {
    this.naturalidade = naturalidade;
    return this;
  }

  /**
   * Get naturalidade
   * @return naturalidade
  **/
  @ApiModelProperty(value = "")


  public String getNaturalidade() {
    return naturalidade;
  }

  public void setNaturalidade(String naturalidade) {
    this.naturalidade = naturalidade;
  }

  public PessoaV1 nacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
    return this;
  }

  /**
   * Get nacionalidade
   * @return nacionalidade
  **/
  @ApiModelProperty(value = "")


  public String getNacionalidade() {
    return nacionalidade;
  }

  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  public PessoaV1 endereco(Endereco endereco) {
    this.endereco = endereco;
    return this;
  }

  /**
   * Get endereco
   * @return endereco
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PessoaV1 pessoaV1 = (PessoaV1) o;
    return Objects.equals(this.cpf, pessoaV1.cpf) &&
        Objects.equals(this.nome, pessoaV1.nome) &&
        Objects.equals(this.sexo, pessoaV1.sexo) &&
        Objects.equals(this.email, pessoaV1.email) &&
        Objects.equals(this.dataNascimento, pessoaV1.dataNascimento) &&
        Objects.equals(this.naturalidade, pessoaV1.naturalidade) &&
        Objects.equals(this.nacionalidade, pessoaV1.nacionalidade) &&
        Objects.equals(this.endereco, pessoaV1.endereco);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpf, nome, sexo, email, dataNascimento, naturalidade, nacionalidade, endereco);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaV1 {\n");
    
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
    sb.append("    naturalidade: ").append(toIndentedString(naturalidade)).append("\n");
    sb.append("    nacionalidade: ").append(toIndentedString(nacionalidade)).append("\n");
    sb.append("    endereco: ").append(toIndentedString(endereco)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


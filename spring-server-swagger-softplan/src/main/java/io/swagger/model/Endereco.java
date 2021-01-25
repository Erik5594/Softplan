package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Endereco
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-01-24T20:18:35.558Z")




public class Endereco   {
  @JsonProperty("cep")
  private String cep = null;

  @JsonProperty("logradouro")
  private String logradouro = null;

  @JsonProperty("complemento")
  private String complemento = null;

  @JsonProperty("numero")
  private String numero = null;

  @JsonProperty("bairro")
  private String bairro = null;

  @JsonProperty("cidade")
  private String cidade = null;

  @JsonProperty("uf")
  private String uf = null;

  @JsonProperty("pais")
  private String pais = null;

  public Endereco cep(String cep) {
    this.cep = cep;
    return this;
  }

  /**
   * Get cep
   * @return cep
  **/
  @ApiModelProperty(value = "")


  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public Endereco logradouro(String logradouro) {
    this.logradouro = logradouro;
    return this;
  }

  /**
   * Get logradouro
   * @return logradouro
  **/
  @ApiModelProperty(value = "")


  public String getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  public Endereco complemento(String complemento) {
    this.complemento = complemento;
    return this;
  }

  /**
   * Get complemento
   * @return complemento
  **/
  @ApiModelProperty(value = "")


  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public Endereco numero(String numero) {
    this.numero = numero;
    return this;
  }

  /**
   * Get numero
   * @return numero
  **/
  @ApiModelProperty(value = "")


  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public Endereco bairro(String bairro) {
    this.bairro = bairro;
    return this;
  }

  /**
   * Get bairro
   * @return bairro
  **/
  @ApiModelProperty(value = "")


  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public Endereco cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }

  /**
   * Get cidade
   * @return cidade
  **/
  @ApiModelProperty(value = "")


  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public Endereco uf(String uf) {
    this.uf = uf;
    return this;
  }

  /**
   * Get uf
   * @return uf
  **/
  @ApiModelProperty(value = "")


  public String getUf() {
    return uf;
  }

  public void setUf(String uf) {
    this.uf = uf;
  }

  public Endereco pais(String pais) {
    this.pais = pais;
    return this;
  }

  /**
   * Get pais
   * @return pais
  **/
  @ApiModelProperty(value = "")


  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Endereco endereco = (Endereco) o;
    return Objects.equals(this.cep, endereco.cep) &&
        Objects.equals(this.logradouro, endereco.logradouro) &&
        Objects.equals(this.complemento, endereco.complemento) &&
        Objects.equals(this.numero, endereco.numero) &&
        Objects.equals(this.bairro, endereco.bairro) &&
        Objects.equals(this.cidade, endereco.cidade) &&
        Objects.equals(this.uf, endereco.uf) &&
        Objects.equals(this.pais, endereco.pais);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cep, logradouro, complemento, numero, bairro, cidade, uf, pais);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Endereco {\n");
    
    sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
    sb.append("    logradouro: ").append(toIndentedString(logradouro)).append("\n");
    sb.append("    complemento: ").append(toIndentedString(complemento)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    bairro: ").append(toIndentedString(bairro)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("    pais: ").append(toIndentedString(pais)).append("\n");
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


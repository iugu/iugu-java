package com.iugu.model;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class Customer implements Serializable {

	private static final long serialVersionUID = 3266886175287194L;

	public Customer() {}

	public Customer(String name) {
		this.name = name;
	}

	/**
	 * Email do cliente
	 * OBRIGATÓRIO
	 */
	private String email;

	/**
	 * Nome do cliente
	 * OBRIGATÓRIO
	 */
	private String name;

	/**
	 * Anotações gerais do cliente
	 */
	private String notes;

	/**
	 * cnpj/cpf do cliente
	 */
	@JsonProperty("cpf_cnpj")
	private String cpfCnpj;

	/**
	 * lista de emails que receberão cópias, em formato string separadas por vírgula
	 */
	@JsonProperty("cc_emails")
	private String ccEmails;

	/**
	 * CEP
	 * OBRIGATÓRIO para emissão de boletos registrados
	 */
	@JsonProperty("zip_code")
	private String zipCode;

	/**
	 * Número do endereço
	 * OBRIGATÓRIO caso "zip_code" seja enviado.
	 */
	private Integer number;

	/**
	 * Rua.
	 * OBRIGATÓRIO caso CEP seja incompleto.
	 */
	private String street;

	/**
	 * Cidade
	 */
	private String city;

	/**
	 * Estado
	 */
	private String state;

	/**
	 * Bairro
	 * OBRIGATÓRIO caso CEP seja incompleto.
	 */
	private String district;

	/**
	 * Complemento de endereço. Ponto de referência.
	 */
	private String complement;

	/**
	 * Variáveis personalizadas
	 */
	@JsonProperty("custom_variables")
	private List<CustomVariable> customVariables;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getCcEmails() {
		return ccEmails;
	}

	public void setCcEmails(String ccEmails) {
		this.ccEmails = ccEmails;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public List<CustomVariable> getCustomVariables() {
		return customVariables;
	}

	public void setCustomVariables(List<CustomVariable> customVariables) {
		this.customVariables = customVariables;
	}

	/************************************************
	 * antigos
	 ************************************************/
	public Customer withEmail(String email) {
		this.email = email;
		return this;
	}

	public Customer withCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
		return this;
	}

	public Customer withCcEmails(String ccEmails) {
		this.ccEmails = ccEmails;
		return this;
	}

	public Customer withNotes(String notes) {
		this.notes = notes;
		return this;
	}

	public Customer withCustomVariables(List<CustomVariable> customVariables) {
		this.customVariables = customVariables;
		return this;
	}
}

package com.iugu.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Payer implements Serializable {

	private static final long serialVersionUID = 3266886175287194L;

	public Payer(String name, String email, String cpfcnpj, String phonePrefix, String phone, Address address) {
		this.name = name;
		this.email = email;
		this.cpfCnpj = cpfcnpj;
		this.phonePrefix = phonePrefix;
		this.phone = phone;
		this.address = address;
	}
	
	/**
	 * cnpj/cpf do cliente
	 */
	@JsonProperty("cpf_cnpj")
	private String cpfCnpj;

	/**
	 * Nome do cliente
	 */
	private String name;
	
	/**
	 * Prefixo do Telefone do Cliente
	 */
	@JsonProperty("phone_prefix")
	private String phonePrefix;
	
	/**
	 * Telefone do cliente
	 */
	private String phone;

	/**
	 * E-Mail do cliente
	 */
	private String email;
	
	/**
	 * Endereço do cliente
	 */
	private Address address;

	
	public String getName() {
		return name;
	}
	
	public String getPhonePrefix() {
		return this.phonePrefix;
	}
	
	public String getPhone() {
		return this.phone;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}
	
	public String getEmail() {
		return email;
	}
	
	public Address getAddress() {
		return this.address;
	}
}

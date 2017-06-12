package com.iugu.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Address implements Serializable {

	private static final long serialVersionUID = 3266886175287194L;

	public Address(String street, String number, String city, String state, String country, String zipcode) {
		this.street = street;
		this.number = number;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipcode;
	}
	
	/**
	 * Rua do cliente
	 */
	private String street;
	
	/**
	 * Número da Rua do Cliente
	 */
	private String number;
	
	/**
	 * Cidade do cliente
	 */
	private String city;

	/**
	 * Estado do cliente
	 */
	private String state;
	
	/**
	 * País do cliente
	 */
	private String country;
	
	/**
	 * CEP do cliente
	 */
	@JsonProperty("zip_code")
	private String zipCode;

	
	public String getStreet() {
		return this.street;
	}
	
	public String getNumber() {
		return this.number;
	}
	
	public String getCity() {
		return this.city;
	}

	public String getState() {
		return this.state;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public String getZipCode() {
		return this.zipCode;
	}
}

package com.iugu.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class Customer {

	public Customer(String name) {
		this.name = name;
	}

	private String email;

	private String name;

	@JsonProperty("cpf_cnpj")
	private String cpfCnpj;

	@JsonProperty("cc_emails")
	private String ccEmails;

	private String notes;

	@JsonProperty("custom_variables")
	private List<CustomVariable> customVariables;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public String getCcEmails() {
		return ccEmails;
	}

	public String getNotes() {
		return notes;
	}

	public List<CustomVariable> getCustomVariables() {
		return customVariables;
	}

}

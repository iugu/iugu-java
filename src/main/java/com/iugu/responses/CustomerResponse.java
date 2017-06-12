package com.iugu.responses;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerResponse {
	
	private String id;
	
	private String email;
	
	private String name;
	
	private String notes;
	
	@JsonProperty("custom_variables")
	private List<CustomVariableResponse> customVariables;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public List<CustomVariableResponse> getCustomVariables() {
		return customVariables;
	}

	public void setCustomVariables(List<CustomVariableResponse> customVariables) {
		this.customVariables = customVariables;
	}

}
package com.iugu.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class Logs {

	public Logs(String description, String notes) {
		this.description = description;
		this.notes = notes;
	}

	private String description;

	private String notes;

	@JsonProperty("_destroy")
	private Boolean destroy;

	public Boolean getDestroy() {
		return destroy;
	}

	public void setDestroy(Boolean destroy) {
		this.destroy = destroy;
	}

	public String getDescription() {
		return description;
	}

	public String getNotes() {
		return notes;
	}

}

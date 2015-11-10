package com.iugu.model;

public class CustomVariable {

	public CustomVariable(String name, String value) {
		this.name = name;
		this.value = value;
	}

	private String name;

	private String value;

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

}

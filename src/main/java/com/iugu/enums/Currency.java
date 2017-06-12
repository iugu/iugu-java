package com.iugu.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Currency {

	BRL("BRL");

	private String value;

	private Currency(String value) {
		this.value = value;
	}

	@JsonValue
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}

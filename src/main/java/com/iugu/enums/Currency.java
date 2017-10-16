package com.iugu.enums;

public enum Currency {

	BRL("BRL");

	private String value;

	private Currency(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}

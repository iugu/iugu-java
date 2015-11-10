package com.iugu.model;

import org.codehaus.jackson.annotate.JsonValue;

public enum PayableWith {

	CREDIT_CARD("credit_card"), ALL("all"), BANK_SLIP("bank_slip");

	private String value;

	private PayableWith(String value) {
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

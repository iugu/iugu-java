package com.iugu.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum IntervalType {

	WEEKS("weeks"), MONTHS("months");

	private String value;

	private IntervalType(String value) {
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

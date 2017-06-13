package com.iugu.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.iugu.enums.Currency;

public class Price {

	private Currency currency;

	@JsonProperty("value_cents")
	private int valueCents;

	public Price(Currency currency, int valueCents) {
		this.currency = currency;
		this.valueCents = valueCents;
	}

	public Currency getCurrency() {
		return currency;
	}

	public int getValueCents() {
		return valueCents;
	}

}

package com.iugu.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.iugu.enums.Currency;
import com.iugu.enums.IntervalType;
import com.iugu.enums.PayableWith;

public class Plan {

	private String name;

	private String identifier;

	private String interval;

	@JsonProperty("interval_type")
	private IntervalType intervalType;

	private Currency currency;

	@JsonProperty("value_cents")
	private int valueCents;

	@JsonProperty("payable_with")
	private PayableWith payableWith;

	private List<Price> prices;

	private List<Feature> features;

	public Plan(String name, String identifier, String interval, IntervalType intervalType, Currency currency,
			int valueCents) {
		this.name = name;
		this.identifier = identifier;
		this.interval = interval;
		this.intervalType = intervalType;
		this.currency = currency;
		this.valueCents = valueCents;
	}

	public String getName() {
		return name;
	}

	public String getIdentifier() {
		return identifier;
	}

	public String getInterval() {
		return interval;
	}

	public IntervalType getIntervalType() {
		return intervalType;
	}

	public Currency getCurrency() {
		return currency;
	}

	public int getValueCents() {
		return valueCents;
	}

	public PayableWith getPayableWith() {
		return payableWith;
	}

	public void setPayableWith(PayableWith payableWith) {
		this.payableWith = payableWith;
	}

	public List<Price> getPrices() {
		return prices;
	}

	public void setPrices(List<Price> prices) {
		this.prices = prices;
	}

	public List<Feature> getFeatures() {
		return features;
	}

	public void setFeatures(List<Feature> features) {
		this.features = features;
	}

}

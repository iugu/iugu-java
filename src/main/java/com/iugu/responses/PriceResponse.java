package com.iugu.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceResponse {

	private String id;
	
	private String currency;
	
	@JsonProperty("plan_id")
	private String planId;
	
	@JsonProperty("value_cents")
	private Integer valueCents;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public Integer getValueCents() {
		return valueCents;
	}

	public void setValueCents(Integer valueCents) {
		this.valueCents = valueCents;
	}
	
}
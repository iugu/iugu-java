package com.iugu.responses;

public class PriceResponse {

	private String id;
	
	private String currency;
	
	private String planId;
	
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
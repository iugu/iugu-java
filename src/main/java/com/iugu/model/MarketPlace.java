package com.iugu.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class MarketPlace {

	private String name;

	@JsonProperty("comission_percent")
	private double commissionPercent;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCommissionPercent() {
		return commissionPercent;
	}

	public void setCommissionPercent(double commissionPercent) {
		this.commissionPercent = commissionPercent;
	}

}

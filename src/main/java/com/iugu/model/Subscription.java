package com.iugu.model;

import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class Subscription {

	public Subscription(String customerId) {
		this.customerId = customerId;

	}

	@JsonProperty("customer_id")
	private String customerId;

	public String getCustomerId() {
		return customerId;
	}

	@JsonProperty("plan_identifier")
	public String planIdentifier;

	public Date expiresAt;

	@JsonProperty("only_on_charge_sucess")
	public String onlyOnChargeSucess;

	@JsonProperty("payable_with")
	public PayableWith payableWith;

	@JsonProperty("credits_based")
	public boolean creditsBased;

	@JsonProperty("price_cents")
	public int priceCents;

	@JsonProperty("credits_cycle")
	public int creditsCycle;

	@JsonProperty("credits_min")
	public int creditsMin;

	@JsonProperty("custom_variables")
	public List<CustomVariable> customVariables;

	@JsonProperty("subitems")
	public List<SubItem> subItems;
}

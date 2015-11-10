package com.iugu.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class PaymentMethod {

	public PaymentMethod(String customerId, String description, List<Data> data) {
		this.customerId = customerId;
		this.description = description;
		this.data = data;
	}

	@JsonProperty("customer_id")
	private String customerId;

	private String description;

	private List<Data> data;

	@JsonProperty("item_type")
	private ItemType itemType;

	private String token;

	@JsonProperty("set_as_default")
	private String setAsDefault;

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getSetAsDefault() {
		return setAsDefault;
	}

	public void setSetAsDefault(String setAsDefault) {
		this.setAsDefault = setAsDefault;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getDescription() {
		return description;
	}

	public List<Data> getData() {
		return data;
	}

}

package com.iugu.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import com.iugu.enums.ItemType;

public class PaymentMethod {

	public PaymentMethod(String description, String token, Boolean isDefault) {
		this.description = description;
		this.token = token;
		this.isDefault=isDefault;
	}

	public PaymentMethod(String description, Data data, Boolean isDefault) {
		this.description = description;
		this.data = data;
		this.isDefault = isDefault;
	}

	private String description;

	private Data data;

	@JsonProperty("item_type")
	private ItemType itemType;

	private String token;

	@JsonProperty("set_as_default")
	private Boolean isDefault;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

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

	public Boolean getDefault() {
		return isDefault;
	}

	public void setDefault(Boolean aDefault) {
		isDefault = aDefault;
	}

	@Override
	public String toString() {
		return "PaymentMethod{" +
				"description='" + description + '\'' +
				", data=" + data +
				", itemType=" + itemType +
				", token='" + token + '\'' +
				", isDefault=" + isDefault +
				'}';
	}
}

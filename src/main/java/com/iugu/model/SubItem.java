package com.iugu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SubItem {

	private String description;

	private Integer quantity;

	@JsonProperty("price_cents")
	private Integer priceCents;

	private boolean recurrent;

	public SubItem(String description, Integer quantity, Integer priceCents) {
		this.description = description;
		this.quantity = quantity;
		this.priceCents = priceCents;
	}

	public String getDescription() {
		return description;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Integer getPriceCents() {
		return priceCents;
	}

	public boolean isRecurrent() {
		return recurrent;
	}

	public void setRecurrent(boolean recurrent) {
		this.recurrent = recurrent;
	}

	@Override
	public String toString() {
		return "SubItem{" +
				"description='" + description + '\'' +
				", quantity=" + quantity +
				", priceCents=" + priceCents +
				", recurrent=" + recurrent +
				'}';
	}
}

package com.iugu.model;


public class Item {

	private String description;
	
	private Integer quantity;
	
	private Integer priceCents;
	
	public Item(String description, Integer quantity, Integer priceCents) {
		this.description = description;
		this.quantity = quantity;
		this.priceCents = priceCents;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getPriceCents() {
		return priceCents;
	}

	public void setPrice_cents(Integer priceCents) {
		this.priceCents = priceCents;
	}
	
}

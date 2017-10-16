package com.iugu.model;

public class Transfer {

	private String receiverId;

	private int amountCents;

	public Transfer(String receiverId, int amountCents) {
		this.receiverId = receiverId;
		this.amountCents = amountCents;
	}

	public String getReceiverId() {
		return receiverId;
	}

	public int getAmountCents() {
		return amountCents;
	}

}

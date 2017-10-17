package com.iugu.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.iugu.enums.PayableWith;

public class PaymentToken {

	@JsonProperty("account_id")
	private String accountId;

	@JsonProperty("method")
	private PayableWith payableWith;

	@JsonProperty("test")
	private Boolean isTest;

	@JsonProperty("data")
	private Data data;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public PayableWith getPayableWith() {
		return payableWith;
	}

	public void setPayableWith(PayableWith payableWith) {
		this.payableWith = payableWith;
	}

	public Boolean getTest() {
		return isTest;
	}

	public void setTest(Boolean test) {
		isTest = test;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "PaymentToken{" +
				"accountId='" + accountId + '\'' +
				", payableWith=" + payableWith +
				", isTest=" + isTest +
				", data=" + data +
				'}';
	}
}

package com.iugu.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Charge implements Serializable {

	private static final long serialVersionUID = -2317300062593072534L;

	@JsonProperty("token")
	private String token;

	@JsonProperty("customer_id")
	private String customerId;

	@JsonProperty("invoice_id")
	private String invoiceId;

	@JsonProperty("email")
	private String email;

	@JsonProperty("months")
	private Integer months;

	@JsonProperty("discount_cents")
	private Integer discount_cents;

	@JsonProperty("bank_slip_extra_days")
	private Integer bankSlipExtraDays;

	@JsonProperty("keep_dunning")
	private Boolean keepDunning;

	@JsonProperty("items")
	private List<Item> items;

	@JsonProperty("payer")
	private Payer payer;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getDiscount_cents() {
		return discount_cents;
	}

	public void setDiscount_cents(Integer discount_cents) {
		this.discount_cents = discount_cents;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Integer getMonths() {
		return months;
	}

	public void setMonths(Integer months) {
		this.months = months;
	}

	public Integer getBankSlipExtraDays() {
		return bankSlipExtraDays;
	}

	public void setBankSlipExtraDays(Integer bankSlipExtraDays) {
		this.bankSlipExtraDays = bankSlipExtraDays;
	}

	public Boolean getKeepDunning() {
		return keepDunning;
	}

	public void setKeepDunning(Boolean keepDunning) {
		this.keepDunning = keepDunning;
	}

	public Payer getPayer() {
		return payer;
	}

	public void setPayer(Payer payer) {
		this.payer = payer;
	}

	public Charge(String token, String email, List<Item> items) {
		this.token = token;
		this.email = email;
		this.items = items;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Charge{");
		sb.append("token='").append(token).append('\'');
		sb.append(", customerId='").append(customerId).append('\'');
		sb.append(", invoiceId='").append(invoiceId).append('\'');
		sb.append(", email='").append(email).append('\'');
		sb.append(", months=").append(months);
		sb.append(", discount_cents=").append(discount_cents);
		sb.append(", bankSlipExtraDays=").append(bankSlipExtraDays);
		sb.append(", keepDunning=").append(keepDunning);
		sb.append(", items=").append(items);
		sb.append(", payer=").append(payer);
		sb.append('}');
		return sb.toString();
	}
}

package com.iugu.responses;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import com.iugu.serializers.DateSerializer;
import com.iugu.serializers.JsonFormat;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceResponse implements Serializable {

	private static final long serialVersionUID = -4229186497940178039L;

	private String id;

	@JsonProperty("due_date")
	@JsonFormat("yyyy-MM-dd")
	@JsonSerialize(using = DateSerializer.class)
	private String dueDate;

	private String currency;

	@JsonProperty("discount_cents")
	private Integer discountCents;

	private String email;

	@JsonProperty("items_total_cents")
	private Integer itemsTotalCents;

	@JsonProperty("notification_url")
	private String notificationUrl;

	@JsonProperty("return_url")
	private String returnUrl;

	private String status;

	@JsonProperty("tax_cents")
	private Integer taxCents;

	@JsonProperty("updated_at")
	@JsonFormat("yyyy-MM-dd'T'HH:mm:ssZ")
	@JsonSerialize(using = DateSerializer.class)
	private Date updatedAt;

	@JsonProperty("total_cents")
	private Integer totalCents;

	@JsonProperty("paid_at")
	private Date paidAt;

	@JsonProperty("secure_id")
	private String secureId;

	@JsonProperty("secure_url")
	private String secureUrl;

	@JsonProperty("customer_id")
	private String customerId;

	@JsonProperty("user_id")
	private Long userId;

	@JsonProperty("total")
	private String total;

	@JsonProperty("total_paid")
	private String totalPaid;

	@JsonProperty("total_on_occurrence_day")
	private String totalOnOccurrenceDay;

	@JsonProperty("taxes_paid")
	private String taxesPaid;

	private String interest;

	private String discount;

	private Boolean refundable;

	private String installments;

	@JsonProperty("bank_slip")
	private BankSlipResponse bankSlip;

	private List<ItemResponse> items;

	private List<VariableResponse> variables;

	private List<LogResponse> logs;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getDiscountCents() {
		return discountCents;
	}

	public void setDiscountCents(Integer discountCents) {
		this.discountCents = discountCents;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getItemsTotalCents() {
		return itemsTotalCents;
	}

	public void setItemsTotalCents(Integer itemsTotalCents) {
		this.itemsTotalCents = itemsTotalCents;
	}

	public String getNotificationUrl() {
		return notificationUrl;
	}

	public void setNotificationUrl(String notificationUrl) {
		this.notificationUrl = notificationUrl;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getTaxCents() {
		return taxCents;
	}

	public void setTaxCents(Integer taxCents) {
		this.taxCents = taxCents;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Integer getTotalCents() {
		return totalCents;
	}

	public void setTotalCents(Integer totalCents) {
		this.totalCents = totalCents;
	}

	public Date getPaidAt() {
		return paidAt;
	}

	public void setPaidAt(Date paidAt) {
		this.paidAt = paidAt;
	}

	public String getSecureId() {
		return secureId;
	}

	public void setSecureId(String secureId) {
		this.secureId = secureId;
	}

	public String getSecureUrl() {
		return secureUrl;
	}

	public void setSecureUrl(String secureUrl) {
		this.secureUrl = secureUrl;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getTaxesPaid() {
		return taxesPaid;
	}

	public void setTaxesPaid(String taxesPaid) {
		this.taxesPaid = taxesPaid;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public Boolean getRefundable() {
		return refundable;
	}

	public void setRefundable(Boolean refundable) {
		this.refundable = refundable;
	}

	public String getInstallments() {
		return installments;
	}

	public void setInstallments(String installments) {
		this.installments = installments;
	}

	public BankSlipResponse getBankSlip() {
		return bankSlip;
	}

	public void setBankSlip(BankSlipResponse bankSlip) {
		this.bankSlip = bankSlip;
	}

	public List<ItemResponse> getItems() {
		return items;
	}

	public void setItems(List<ItemResponse> items) {
		this.items = items;
	}

	public List<VariableResponse> getVariables() {
		return variables;
	}

	public void setVariables(List<VariableResponse> variables) {
		this.variables = variables;
	}

	public List<LogResponse> getLogs() {
		return logs;
	}

	public void setLogs(List<LogResponse> logs) {
		this.logs = logs;
	}

	public String getTotalPaid() {
		return totalPaid;
	}

	public void setTotalPaid(String totalPaid) {
		this.totalPaid = totalPaid;
	}

	public String getTotalOnOccurrenceDay() {
		return totalOnOccurrenceDay;
	}

	public void setTotalOnOccurrenceDay(String totalOnOccurrenceDay) {
		this.totalOnOccurrenceDay = totalOnOccurrenceDay;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

}
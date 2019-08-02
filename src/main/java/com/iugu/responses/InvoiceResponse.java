package com.iugu.responses;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class InvoiceResponse implements Serializable {

    private static final long serialVersionUID = -4229186497940178039L;

    private String id;

    private String dueDate;

    private String currency;

    private Integer discountCents;

    private String email;

    private Integer itemsTotalCents;

    private String notificationUrl;

    private String returnUrl;

    private String status;

    private Integer taxCents;

    private Integer commissionCents;

    private LocalDateTime updatedAt;

    private Integer totalCents;

    private LocalDateTime paidAt;

    private String secureId;

    private String secureUrl;

    private String customerId;

    private Long userId;

    private String total;

    private String totalPaid;

    private String totalOnOccurrenceDay;

    private String taxesPaid;

    private String interest;

    private String discount;

    private Boolean refundable;

    private String installments;

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

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getTotalCents() {
        return totalCents;
    }

    public void setTotalCents(Integer totalCents) {
        this.totalCents = totalCents;
    }

    public LocalDateTime getPaidAt() {
        return paidAt;
    }

    public void setPaidAt(LocalDateTime paidAt) {
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

    public Integer getCommissionCents() {
        return commissionCents;
    }

    public void setCommissionCents(Integer commissionCents) {
        this.commissionCents = commissionCents;
    }
}
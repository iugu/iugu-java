package com.iugu.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.iugu.enums.PayableWith;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Invoice implements Serializable {

    private static final long serialVersionUID = 1719931730355279382L;

    public Invoice() {
    }

    public Invoice(String email, Date dueDate, Item... items) {
        this.email = email;
        this.dueDate = dueDate;
        this.items.addAll(Arrays.asList(items)); // FIXME Tratar null pointer
    }

    private String email;

    @JsonProperty("cc_emails")
    private String ccEmails;

    @JsonProperty("due_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dueDate;

    private List<Item> items = new ArrayList<>();

    @JsonProperty("return_url")
    private String returnUrl;

    @JsonProperty("expired_url")
    private String expiredUrl;

    @JsonProperty("notification_url")
    private String notificationUrl;

    private Boolean fines;

    @JsonProperty("late_payment_fine")
    private Double latePaymentFine;

    @JsonProperty("per_day_interest")
    private Double perDayInterest;

    @JsonProperty("discount_cents")
    private Integer discountCents;

    @JsonProperty("customer_id")
    private String customerId;

    @JsonProperty("ignore_due_email")
    private Boolean ignoreDueEmail;

    @JsonProperty("subscription_id")
    private String subscriptionId;

    @JsonProperty("payable_with")
    private PayableWith payableWith;

    @JsonProperty("credits")
    private Integer credits;

    private List<Logs> logs;

    @JsonProperty("custom_variables")
    private List<CustomVariable> customVariables;

    private Payer payer;

    @JsonProperty("early_payment_discount")
    private Boolean earlyPaymentDiscount;

    @JsonProperty("early_payment_discount_days")
    private Integer earlyPaymentDiscountDays;

    @JsonProperty("early_payment_discount_percent")
    private Integer earlyPaymentDiscountPercent;

    @JsonProperty("payment_method")
    private Integer paymentMethod;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCcEmails() {
        return ccEmails;
    }

    public void setCcEmails(String ccEmails) {
        this.ccEmails = ccEmails;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getExpiredUrl() {
        return expiredUrl;
    }

    public void setExpiredUrl(String expiredUrl) {
        this.expiredUrl = expiredUrl;
    }

    public String getNotificationUrl() {
        return notificationUrl;
    }

    public void setNotificationUrl(String notificationUrl) {
        this.notificationUrl = notificationUrl;
    }

    public Boolean getFines() {
        return fines;
    }

    public void setFines(Boolean fines) {
        this.fines = fines;
    }

    public Double getLatePaymentFine() {
        return latePaymentFine;
    }

    public void setLatePaymentFine(Double latePaymentFine) {
        this.latePaymentFine = latePaymentFine;
    }

    public Double getPerDayInterest() {
        return perDayInterest;
    }

    public void setPerDayInterest(Double perDayInterest) {
        this.perDayInterest = perDayInterest;
    }

    public Integer getDiscountCents() {
        return discountCents;
    }

    public void setDiscountCents(Integer discountCents) {
        this.discountCents = discountCents;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Boolean getIgnoreDueEmail() {
        return ignoreDueEmail;
    }

    public void setIgnoreDueEmail(Boolean ignoreDueEmail) {
        this.ignoreDueEmail = ignoreDueEmail;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public PayableWith getPayableWith() {
        return payableWith;
    }

    public void setPayableWith(PayableWith payableWith) {
        this.payableWith = payableWith;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public List<Logs> getLogs() {
        return logs;
    }

    public void setLogs(List<Logs> logs) {
        this.logs = logs;
    }

    public List<CustomVariable> getCustomVariables() {
        return customVariables;
    }

    public void setCustomVariables(List<CustomVariable> customVariables) {
        this.customVariables = customVariables;
    }

    public Payer getPayer() {
        return payer;
    }

    public void setPayer(Payer payer) {
        this.payer = payer;
    }

    public Boolean getEarlyPaymentDiscount() {
        return earlyPaymentDiscount;
    }

    public void setEarlyPaymentDiscount(Boolean earlyPaymentDiscount) {
        this.earlyPaymentDiscount = earlyPaymentDiscount;
    }

    public Integer getEarlyPaymentDiscountDays() {
        return earlyPaymentDiscountDays;
    }

    public void setEarlyPaymentDiscountDays(Integer earlyPaymentDiscountDays) {
        this.earlyPaymentDiscountDays = earlyPaymentDiscountDays;
    }

    public Integer getEarlyPaymentDiscountPercent() {
        return earlyPaymentDiscountPercent;
    }

    public void setEarlyPaymentDiscountPercent(Integer earlyPaymentDiscountPercent) {
        this.earlyPaymentDiscountPercent = earlyPaymentDiscountPercent;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Integer getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

}
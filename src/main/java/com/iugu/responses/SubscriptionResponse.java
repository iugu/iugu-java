package com.iugu.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class SubscriptionResponse {

    private String id;

    private Boolean suspended;

    private String planIdentifier;

    private Integer priceCents;

    private String currency;

    //TODO Features
    private Date expiresAt;

    private String customerName;

    private String customerEmail;

    private Date cycledAt;

    private Integer creditsMin;

    //TODO Credits Cycle

    private String customerId;

    private String planName;

    private String customerRef;

    private String planRef;

    private Boolean active;

    private Boolean inTrial;

    private Integer credits;

    private Boolean creditsBased;

    private String errors;
    @SerializedName("LR")
    private String lr;

    //TODO Recent Invoices

    private List<SubItemResponse> subitems;

    private List<LogResponse> logs;

    private List<CustomVariableResponse> customVariables;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getSuspended() {
        return suspended;
    }

    public void setSuspended(Boolean suspended) {
        this.suspended = suspended;
    }

    public String getPlanIdentifier() {
        return planIdentifier;
    }

    public void setPlanIdentifier(String planIdentifier) {
        this.planIdentifier = planIdentifier;
    }

    public Integer getPriceCents() {
        return priceCents;
    }

    public void setPriceCents(Integer priceCents) {
        this.priceCents = priceCents;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Date getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Date getCycledAt() {
        return cycledAt;
    }

    public void setCycledAt(Date cycledAt) {
        this.cycledAt = cycledAt;
    }

    public Integer getCreditsMin() {
        return creditsMin;
    }

    public void setCreditsMin(Integer creditsMin) {
        this.creditsMin = creditsMin;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getCustomerRef() {
        return customerRef;
    }

    public void setCustomerRef(String customerRef) {
        this.customerRef = customerRef;
    }

    public String getPlanRef() {
        return planRef;
    }

    public void setPlanRef(String planRef) {
        this.planRef = planRef;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getInTrial() {
        return inTrial;
    }

    public void setInTrial(Boolean inTrial) {
        this.inTrial = inTrial;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Boolean getCreditsBased() {
        return creditsBased;
    }

    public void setCreditsBased(Boolean creditsBased) {
        this.creditsBased = creditsBased;
    }

    public List<SubItemResponse> getSubitems() {
        return subitems;
    }

    public void setSubitems(List<SubItemResponse> subitems) {
        this.subitems = subitems;
    }

    public List<LogResponse> getLogs() {
        return logs;
    }

    public void setLogs(List<LogResponse> logs) {
        this.logs = logs;
    }

    public List<CustomVariableResponse> getCustomVariables() {
        return customVariables;
    }

    public void setCustomVariables(List<CustomVariableResponse> customVariables) {
        this.customVariables = customVariables;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }

    public String getLr() {
        return lr;
    }

    public void setLr(String lr) {
        this.lr = lr;
    }

    @Override
    public String toString() {
        return "SubscriptionResponse{" +
                "id='" + id + '\'' +
                ", suspended=" + suspended +
                ", planIdentifier='" + planIdentifier + '\'' +
                ", priceCents=" + priceCents +
                ", currency='" + currency + '\'' +
                ", expiresAt=" + expiresAt +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", cycledAt=" + cycledAt +
                ", creditsMin=" + creditsMin +
                ", customerId='" + customerId + '\'' +
                ", planName='" + planName + '\'' +
                ", customerRef='" + customerRef + '\'' +
                ", planRef='" + planRef + '\'' +
                ", active=" + active +
                ", inTrial=" + inTrial +
                ", credits=" + credits +
                ", creditsBased=" + creditsBased +
                ", subitems=" + subitems +
                ", logs=" + logs +
                ", customVariables=" + customVariables +
                '}';
    }
}
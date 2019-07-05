package com.iugu.model;

import com.google.gson.annotations.SerializedName;
import com.iugu.enums.PayableWith;

import java.time.LocalDate;
import java.util.List;

public class Subscription {

    public Subscription(String customerId) {
        this.customerId = customerId;
        setCreditsBased(false);
        setOnlyOnChargeSuccess(true);
    }

    private String customerId;

    public String getCustomerId() {
        return customerId;
    }

    private String planIdentifier;

    private LocalDate expiresAt;

    private String onlyOnChargeSuccess;

    private PayableWith payableWith;

    private String creditsBased;

    private Integer priceCents;

    private Integer creditsCycle;

    private Integer creditsMin;

    private String skipCharge;

    private List<CustomVariable> customVariables;

    @SerializedName("subitems")
    private List<SubItem> subItems;

    public String getPlanIdentifier() {
        return planIdentifier;
    }

    public void setPlanIdentifier(String planIdentifier) {
        this.planIdentifier = planIdentifier;
    }

    public LocalDate getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(LocalDate expiresAt) {
        this.expiresAt = expiresAt;
    }

    public boolean isOnlyOnChargeSuccess() {
        return onlyOnChargeSuccess.equalsIgnoreCase("true");
    }

    public void setOnlyOnChargeSuccess(boolean onlyOnChargeSuccess) {
        this.onlyOnChargeSuccess = (onlyOnChargeSuccess ? "true" : "false");
    }

    public boolean isSkipCharge() {
        return skipCharge != null && skipCharge.equalsIgnoreCase("true");
    }

    public void isSkipCharge(boolean skipCharge) {
        this.skipCharge = (skipCharge ? "true" : "false");
    }

    public PayableWith getPayableWith() {
        return payableWith;
    }

    public void setPayableWith(PayableWith payableWith) {
        this.payableWith = payableWith;
    }

    public boolean isCreditsBased() {
        return creditsBased.equalsIgnoreCase("true");
    }

    public void setCreditsBased(boolean creditsBased) {
        this.creditsBased = (creditsBased ? "true" : "false");
    }

    public Integer getPriceCents() {
        return priceCents;
    }

    public void setPriceCents(Integer priceCents) {
        this.priceCents = priceCents;
    }

    public Integer getCreditsCycle() {
        return creditsCycle;
    }

    public void setCreditsCycle(Integer creditsCycle) {
        this.creditsCycle = creditsCycle;
    }

    public Integer getCreditsMin() {
        return creditsMin;
    }

    public void setCreditsMin(Integer creditsMin) {
        this.creditsMin = creditsMin;
    }

    public List<CustomVariable> getCustomVariables() {
        return customVariables;
    }

    public void setCustomVariables(List<CustomVariable> customVariables) {
        this.customVariables = customVariables;
    }

    public List<SubItem> getSubItems() {
        return subItems;
    }

    public void setSubItems(List<SubItem> subItems) {
        this.subItems = subItems;
    }
}

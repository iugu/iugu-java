package com.iugu.model;

import com.google.gson.annotations.SerializedName;
import com.iugu.enums.PayableWith;

import java.util.Date;
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

    public String planIdentifier;

    public Date expiresAt;

    public String onlyOnChargeSuccess;

    public PayableWith payableWith;

    public String creditsBased;

    public Integer priceCents;

    public Integer creditsCycle;

    public Integer creditsMin;

    public List<CustomVariable> customVariables;

    @SerializedName("subitems")
    public List<SubItem> subItems;

    public String getPlanIdentifier() {
        return planIdentifier;
    }

    public void setPlanIdentifier(String planIdentifier) {
        this.planIdentifier = planIdentifier;
    }

    public Date getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    public boolean isOnlyOnChargeSuccess() {
        return onlyOnChargeSuccess.equalsIgnoreCase("true");
    }

    public void setOnlyOnChargeSuccess(boolean onlyOnChargeSuccess) {
        this.onlyOnChargeSuccess = (onlyOnChargeSuccess ? "true" : "false");
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

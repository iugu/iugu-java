package com.iugu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RequestWithdraw {

    private Float amount;
    @JsonProperty("custom_variables")
    private List<CustomVariable> customVariables;

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public List<CustomVariable> getCustomVariables() {
        return customVariables;
    }

    public void setCustomVariables(List<CustomVariable> customVariables) {
        this.customVariables = customVariables;
    }

    @Override
    public String toString() {
        return "RequestWithdraw{" +
                "amount=" + amount +
                ", customVariables=" + customVariables +
                '}';
    }
}

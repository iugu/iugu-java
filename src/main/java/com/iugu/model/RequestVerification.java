package com.iugu.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestVerification {

    @JsonProperty("account_id")
    private String accountId;
    @JsonProperty("automatic_validation")
    private Boolean automaticValidation;
    private DataRequestVerification data;

    public RequestVerification() {
    }

    public RequestVerification(String accountId, DataRequestVerification data) {
        this.accountId = accountId;
        this.data = data;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Boolean getAutomaticValidation() {
        return automaticValidation;
    }

    public void setAutomaticValidation(Boolean automaticValidation) {
        this.automaticValidation = automaticValidation;
    }

    public DataRequestVerification getData() {
        return data;
    }

    public void setData(DataRequestVerification data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RequestVerification{" +
                "accountId='" + accountId + '\'' +
                ", automaticValidation=" + automaticValidation +
                ", data=" + data +
                '}';
    }
}
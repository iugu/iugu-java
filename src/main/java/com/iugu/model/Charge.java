package com.iugu.model;


import org.codehaus.jackson.annotate.JsonProperty;

public class Charge {

    @JsonProperty("token")
    private String token;

    @JsonProperty("customer_id")
    private String customerId;

    @JsonProperty("invoice_id")
    private String invoiceId;


    public Charge(String token, String customerId, String invoiceId) {
        this.token = token;
        this.customerId = customerId;
        this.invoiceId = invoiceId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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

    @Override
    public String toString() {
        return "Charge{" +
                "token='" + token + '\'' +
                ", customerId='" + customerId + '\'' +
                ", invoiceId='" + invoiceId + '\'' +
                '}';
    }
}

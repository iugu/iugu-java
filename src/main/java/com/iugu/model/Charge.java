package com.iugu.model;


import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Charge {

    @JsonProperty("token")
    private String token;

    @JsonProperty("invoice_id")
    private String invoiceId;

    @JsonProperty("customer_id")
    private String customerId;

    @JsonProperty("email")
    private String email;

    private List<Item> items = new ArrayList<>();

    @JsonProperty("payer")
    private Payer payer;

    public Charge() {
    }

    public Charge(String token, String invoiceId) {
        this.token = token;
        this.invoiceId = invoiceId;
    }

    public Charge(String token, String invoiceId, String customerId) {
        this.token = token;
        this.invoiceId = invoiceId;
        this.customerId = customerId;
    }

    public Charge(String token, String email, List<Item> items, Payer payer) {
        this.token = token;
        this.email = email;
        this.items = items;
        this.payer = payer;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Payer getPayer() {
        return payer;
    }

    public void setPayer(Payer payer) {
        this.payer = payer;
    }

    @Override
    public String toString() {
        return "Charge{" +
                "token='" + token + '\'' +
                ", invoiceId='" + invoiceId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", email='" + email + '\'' +
                ", items=" + items +
                ", payer=" + payer +
                '}';
    }
}

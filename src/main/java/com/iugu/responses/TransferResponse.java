package com.iugu.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.iugu.model.CustomVariable;
import com.iugu.model.Receiver;
import com.iugu.model.Sender;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TransferResponse {

    @JsonProperty("id")
    private String id;
    @JsonProperty("created_at")
    private Date createdAt;
    @JsonProperty("amount_cents")
    private String amountCents;
    @JsonProperty("amount_localized")
    private String amountLocalized;
    @JsonProperty("receiver")
    private Receiver receiver;
    @JsonProperty("sender")
    private Sender sender;
    @JsonProperty("custom_variables")
    private List<CustomVariable> customVariables;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getAmountCents() {
        return amountCents;
    }

    public void setAmountCents(String amountCents) {
        this.amountCents = amountCents;
    }

    public String getAmountLocalized() {
        return amountLocalized;
    }

    public void setAmountLocalized(String amountLocalized) {
        this.amountLocalized = amountLocalized;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public List<CustomVariable> getCustomVariables() {
        return customVariables;
    }

    public void setCustomVariables(List<CustomVariable> customVariables) {
        this.customVariables = customVariables;
    }

    @Override
    public String toString() {
        return "TransferResponse{" +
                "id='" + id + '\'' +
                ", createdAt=" + createdAt +
                ", amountCents='" + amountCents + '\'' +
                ", amountLocalized='" + amountLocalized + '\'' +
                ", receiver=" + receiver +
                ", sender=" + sender +
                ", customVariables=" + customVariables +
                '}';
    }
}

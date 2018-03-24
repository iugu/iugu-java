package com.iugu.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Transfer implements Serializable {

    @JsonProperty("receiver_id")
    private String receiverId;

    @JsonProperty("amount_cents")
    private int amountCents;

    public Transfer() {
    }

    public Transfer(String receiverId, int amountCents) {
        this.receiverId = receiverId;
        this.amountCents = amountCents;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public int getAmountCents() {
        return amountCents;
    }

    public void setAmountCents(int amountCents) {
        this.amountCents = amountCents;
    }

}

package com.iugu.responses;

public class RequestWithdrawResponse {

    private String id;
    private String amount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "RequestWithdrawResponse{" +
                "id='" + id + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}

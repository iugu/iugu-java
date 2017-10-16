package com.iugu.model;

import com.google.gson.annotations.SerializedName;
import com.iugu.enums.PayableWith;

public class PaymentToken {

    private String accountId;

    @SerializedName("method")
    private PayableWith payableWith;

    private Boolean test;

    private Data data;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public PayableWith getPayableWith() {
        return payableWith;
    }

    public void setPayableWith(PayableWith payableWith) {
        this.payableWith = payableWith;
    }

    public Boolean isTest() {
        return test;
    }

    public void setTest(Boolean test) {
        this.test = test;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PaymentToken{" +
                "accountId='" + accountId + '\'' +
                ", payableWith=" + payableWith +
                ", test=" + test +
                ", data=" + data +
                '}';
    }
}

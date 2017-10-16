package com.iugu.responses;

public class PaymentTokenResponse {

    private String id;

    private String method;

    private Boolean test;

    private ExtraInfoResponse extraInfo;

    public String getId() {
        return id;
    }

    public String getMethod() {
        return method;
    }

    public Boolean isTest() {
        return test;
    }

    public ExtraInfoResponse getExtraInfo() {
        return extraInfo;
    }

    @Override
    public String toString() {
        return "PaymentTokenResponse{" +
                "id='" + id + '\'' +
                ", method='" + method + '\'' +
                ", test=" + test +
                ", extraInfo=" + extraInfo +
                '}';
    }
}

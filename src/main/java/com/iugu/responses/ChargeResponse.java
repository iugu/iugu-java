package com.iugu.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChargeResponse {

    @JsonProperty("message")
    private String message;
    @JsonProperty("success")
    private Boolean success;
    @JsonProperty("url")
    private String url;
    @JsonProperty("pdf")
    private String pdf;
    @JsonProperty("invoice_id")
    private String invoiceId;
    @JsonProperty("LR")
    private String lr;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getLr() {
        return lr;
    }

    public void setLr(String lr) {
        this.lr = lr;
    }

    @Override
    public String toString() {
        return "ChargeResponse{" +
                "message='" + message + '\'' +
                ", success=" + success +
                ", url='" + url + '\'' +
                ", pdf='" + pdf + '\'' +
                ", invoiceId='" + invoiceId + '\'' +
                ", lr='" + lr + '\'' +
                '}';
    }
}

package com.iugu.responses;

import java.util.Objects;

/**
 * Created by daniel on 02/11/2018.
 */
public class ChargeResponse {
    private String message;
    private Boolean success;
    private String url;
    private String pdf;
    private String identification;
    private String invoiceId;
    private String LR;

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

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getLR() {
        return LR;
    }

    public void setLR(String LR) {
        this.LR = LR;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChargeResponse that = (ChargeResponse) o;
        return Objects.equals(message, that.message) &&
                Objects.equals(success, that.success) &&
                Objects.equals(url, that.url) &&
                Objects.equals(pdf, that.pdf) &&
                Objects.equals(identification, that.identification) &&
                Objects.equals(invoiceId, that.invoiceId) &&
                Objects.equals(LR, that.LR);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, success, url, pdf, identification, invoiceId, LR);
    }
}

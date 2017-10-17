package com.iugu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreditCard {

    private Boolean active;
    @JsonProperty("soft_descriptor")
    private String softDescriptor;
    private Boolean installments;
    @JsonProperty("max_installments")
    private Integer maxInstallments;
    @JsonProperty("max_installments_without_interest")
    private String maxInstallmentsWithoutInterest;
    @JsonProperty("two_step_transaction")
    private Boolean twoStepTransaction;
    @JsonProperty("installments_pass_interest")
    private Boolean installmentsPassInterest;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getSoftDescriptor() {
        return softDescriptor;
    }

    public void setSoftDescriptor(String softDescriptor) {
        this.softDescriptor = softDescriptor;
    }

    public Boolean getInstallments() {
        return installments;
    }

    public void setInstallments(Boolean installments) {
        this.installments = installments;
    }

    public Integer getMaxInstallments() {
        return maxInstallments;
    }

    public void setMaxInstallments(Integer maxInstallments) {
        this.maxInstallments = maxInstallments;
    }

    public String getMaxInstallmentsWithoutInterest() {
        return maxInstallmentsWithoutInterest;
    }

    public void setMaxInstallmentsWithoutInterest(String maxInstallmentsWithoutInterest) {
        this.maxInstallmentsWithoutInterest = maxInstallmentsWithoutInterest;
    }

    public Boolean getTwoStepTransaction() {
        return twoStepTransaction;
    }

    public void setTwoStepTransaction(Boolean twoStepTransaction) {
        this.twoStepTransaction = twoStepTransaction;
    }

    public Boolean getInstallmentsPassInterest() {
        return installmentsPassInterest;
    }

    public void setInstallmentsPassInterest(Boolean installmentsPassInterest) {
        this.installmentsPassInterest = installmentsPassInterest;
    }
}

package com.iugu.responses;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConfigurationCreditCard {

    private Boolean active;
    @JsonProperty("soft_descriptor")
    private String softDescriptor;
    private Boolean installments;
    @JsonProperty("installments_pass_interest")
    private Boolean installmentsPassInterest;
    @JsonProperty("max_installments")
    private String maxInstallments;
    @JsonProperty("max_installments_without_interest")
    private String maxInstallmentsWithoutInterest;
    @JsonProperty("two_step_transaction")
    private Boolean twoStepTransaction;

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

    public Boolean getInstallmentsPassInterest() {
        return installmentsPassInterest;
    }

    public void setInstallmentsPassInterest(Boolean installmentsPassInterest) {
        this.installmentsPassInterest = installmentsPassInterest;
    }

    public String getMaxInstallments() {
        return maxInstallments;
    }

    public void setMaxInstallments(String maxInstallments) {
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

    @Override
    public String toString() {
        return "ConfigurationCreditCard{" +
                "active=" + active +
                ", softDescriptor='" + softDescriptor + '\'' +
                ", installments=" + installments +
                ", installmentsPassInterest=" + installmentsPassInterest +
                ", maxInstallments='" + maxInstallments + '\'' +
                ", maxInstallmentsWithoutInterest='" + maxInstallmentsWithoutInterest + '\'' +
                ", twoStepTransaction=" + twoStepTransaction +
                '}';
    }
}

package com.iugu.responses;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConfigurationResponse {

    @JsonProperty("commission_percent")
    private Integer commissionPercent;
    @JsonProperty("bank_slip")
    private ConfigurationBankSlipResponse bankSlip;
    @JsonProperty("credit_card")
    private ConfigurationCreditCard creditCard;

    public Integer getCommissionPercent() {
        return commissionPercent;
    }

    public void setCommissionPercent(Integer commissionPercent) {
        this.commissionPercent = commissionPercent;
    }

    public ConfigurationBankSlipResponse getBankSlip() {
        return bankSlip;
    }

    public void setBankSlip(ConfigurationBankSlipResponse bankSlip) {
        this.bankSlip = bankSlip;
    }

    public ConfigurationCreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(ConfigurationCreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public String toString() {
        return "ConfigurationResponse{" +
                "commissionPercent=" + commissionPercent +
                ", bankSlip=" + bankSlip +
                ", creditCard=" + creditCard +
                '}';
    }
}

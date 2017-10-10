package com.iugu.responses;

import org.codehaus.jackson.annotate.JsonProperty;

public class BankAddressResponse {

    private String bank;
    @JsonProperty("bank_cc")
    private String bankCc;
    @JsonProperty("bank_ag")
    private String bankAg;
    @JsonProperty("account_type")
    private String accountType;

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBankCc() {
        return bankCc;
    }

    public void setBankCc(String bankCc) {
        this.bankCc = bankCc;
    }

    public String getBankAg() {
        return bankAg;
    }

    public void setBankAg(String bankAg) {
        this.bankAg = bankAg;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "BankAddressResponse{" +
                "bank='" + bank + '\'' +
                ", bankCc='" + bankCc + '\'' +
                ", bankAg='" + bankAg + '\'' +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}

package com.iugu.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.io.File;

public class BankAddress {

    private String agency;
    private String account;
    @JsonProperty("account_type")
    private String accountType;
    private String bank;
    @JsonProperty("automatic_validation")
    private Boolean automaticValidation;
    private File document;

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public Boolean getAutomaticValidation() {
        return automaticValidation;
    }

    public void setAutomaticValidation(Boolean automaticValidation) {
        this.automaticValidation = automaticValidation;
    }

    public File getDocument() {
        return document;
    }

    public void setDocument(File document) {
        this.document = document;
    }

    @Override
    public String toString() {
        return "BankAddress{" +
                "agency='" + agency + '\'' +
                ", account='" + account + '\'' +
                ", accountType='" + accountType + '\'' +
                ", bank='" + bank + '\'' +
                ", automaticValidation=" + automaticValidation +
                ", document=" + document +
                '}';
    }
}

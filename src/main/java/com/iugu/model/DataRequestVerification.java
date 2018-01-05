package com.iugu.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataRequestVerification {

    @JsonProperty("price_range")
    private String priceRange;
    @JsonProperty("physical_products")
    private Boolean physicalProducts;
    @JsonProperty("business_type")
    private String businessType;
    @JsonProperty("person_type")
    private String personType;
    @JsonProperty("automatic_transfer")
    private Boolean automaticTransfer;
    private String cpf;
    @JsonProperty("company_name")
    private String companyName;
    private String name;
    private String address;
    private String cep;
    private String city;
    private String state;
    private String telephone;
    @JsonProperty("resp_name")
    private String respName;
    @JsonProperty("resp_cpf")
    private String respCpf;
    private String bank;
    @JsonProperty("bank_ag")
    private String bankAg;
    @JsonProperty("account_type")
    private String accountType;
    @JsonProperty("bank_cc")
    private String bankCc;

    public String getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    public Boolean getPhysicalProducts() {
        return physicalProducts;
    }

    public void setPhysicalProducts(Boolean physicalProducts) {
        this.physicalProducts = physicalProducts;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    public Boolean getAutomaticTransfer() {
        return automaticTransfer;
    }

    public void setAutomaticTransfer(Boolean automaticTransfer) {
        this.automaticTransfer = automaticTransfer;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getRespName() {
        return respName;
    }

    public void setRespName(String respName) {
        this.respName = respName;
    }

    public String getRespCpf() {
        return respCpf;
    }

    public void setRespCpf(String respCpf) {
        this.respCpf = respCpf;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
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

    public String getBankCc() {
        return bankCc;
    }

    public void setBankCc(String bankCc) {
        this.bankCc = bankCc;
    }

    @Override
    public String toString() {
        return "DataRequestVerification{" +
                "priceRange='" + priceRange + '\'' +
                ", physicalProducts='" + physicalProducts + '\'' +
                ", businessType='" + businessType + '\'' +
                ", personType='" + personType + '\'' +
                ", automaticTransfer='" + automaticTransfer + '\'' +
                ", cpf='" + cpf + '\'' +
                ", companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cep='" + cep + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", telephone='" + telephone + '\'' +
                ", respName='" + respName + '\'' +
                ", respCpf='" + respCpf + '\'' +
                ", bank='" + bank + '\'' +
                ", bankAg='" + bankAg + '\'' +
                ", accountType='" + accountType + '\'' +
                ", bankCc='" + bankCc + '\'' +
                '}';
    }
}

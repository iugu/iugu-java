package com.iugu.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

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
    private String address;
    private String cep;
    private String city;
    private String state;
    private String telphone;
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

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
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
                ", address='" + address + '\'' +
                ", cep='" + cep + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", telphone='" + telphone + '\'' +
                ", respName='" + respName + '\'' +
                ", respCpf='" + respCpf + '\'' +
                ", bank='" + bank + '\'' +
                ", bankAg='" + bankAg + '\'' +
                ", accountType='" + accountType + '\'' +
                ", bankCc='" + bankCc + '\'' +
                '}';
    }
}

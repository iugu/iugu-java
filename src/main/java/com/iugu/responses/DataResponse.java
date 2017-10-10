package com.iugu.responses;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataResponse {

    @JsonProperty("price_range")
    private String priceRange;
    @JsonProperty("physical_products")
    private String physicalProducts;
    @JsonProperty("business_type")
    private String business_type;
    @JsonProperty("person_type")
    private String person_type;
    @JsonProperty("automatic_transfer")
    private String automatic_transfer;
    @JsonProperty("cpf")
    private String cpf;
    private String name;
    private String address;
    private String cep;
    private String city;
    private String state;
    private String telephone;
    private String bank;
    @JsonProperty("bank_ag")
    private String bankAg;
    @JsonProperty("account_type")
    private String accountType;
    @JsonProperty("bank_cc")
    private String bankCc;
    @JsonProperty("document_id")
    private Integer documentId;
    @JsonProperty("document_cpf")
    private Integer documentCpf;
    @JsonProperty("document_activity")
    private Integer documentActivity;

    public String getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    public String getPhysicalProducts() {
        return physicalProducts;
    }

    public void setPhysicalProducts(String physicalProducts) {
        this.physicalProducts = physicalProducts;
    }

    public String getBusiness_type() {
        return business_type;
    }

    public void setBusiness_type(String business_type) {
        this.business_type = business_type;
    }

    public String getPerson_type() {
        return person_type;
    }

    public void setPerson_type(String person_type) {
        this.person_type = person_type;
    }

    public String getAutomatic_transfer() {
        return automatic_transfer;
    }

    public void setAutomatic_transfer(String automatic_transfer) {
        this.automatic_transfer = automatic_transfer;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    public Integer getDocumentCpf() {
        return documentCpf;
    }

    public void setDocumentCpf(Integer documentCpf) {
        this.documentCpf = documentCpf;
    }

    public Integer getDocumentActivity() {
        return documentActivity;
    }

    public void setDocumentActivity(Integer documentActivity) {
        this.documentActivity = documentActivity;
    }

    @Override
    public String toString() {
        return "DataResponse{" +
                "priceRange='" + priceRange + '\'' +
                ", physicalProducts='" + physicalProducts + '\'' +
                ", business_type='" + business_type + '\'' +
                ", person_type='" + person_type + '\'' +
                ", automatic_transfer='" + automatic_transfer + '\'' +
                ", cpf='" + cpf + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cep='" + cep + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", telephone='" + telephone + '\'' +
                ", bank='" + bank + '\'' +
                ", bankAg='" + bankAg + '\'' +
                ", accountType='" + accountType + '\'' +
                ", bankCc='" + bankCc + '\'' +
                ", documentId=" + documentId +
                ", documentCpf=" + documentCpf +
                ", documentActivity=" + documentActivity +
                '}';
    }
}

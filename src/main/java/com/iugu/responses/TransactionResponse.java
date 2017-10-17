package com.iugu.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionResponse {

    private String amount;
    private String type;
    private String description;
    @JsonProperty("entry_date")
    private Date entryDate;
    private String reference;
    @JsonProperty("reference_type")
    private String referenceType;
    @JsonProperty("account_id")
    private String accountId;
    @JsonProperty("transaction_type")
    private String transactionType;
    private String balance;
    @JsonProperty("customer_ref")
    private String customerRef;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getCustomerRef() {
        return customerRef;
    }

    public void setCustomerRef(String customerRef) {
        this.customerRef = customerRef;
    }

    @Override
    public String toString() {
        return "TransactionResponse{" +
                "amount='" + amount + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", entryDate=" + entryDate +
                ", reference='" + reference + '\'' +
                ", referenceType='" + referenceType + '\'' +
                ", accountId='" + accountId + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", balance='" + balance + '\'' +
                ", customerRef='" + customerRef + '\'' +
                '}';
    }
}

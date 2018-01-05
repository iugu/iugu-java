package com.iugu.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LastWithdrawResponse {

    @JsonProperty("account_id")
    private String accountId;
    @JsonProperty("account_type")
    private String accountType;
    private String amount;
    private String bank;
    @JsonProperty("bank_ag")
    private String bankAg;
    @JsonProperty("bank_cc")
    private String bankCc;
    @JsonProperty("created_at")
    private Date created_at;
    private String feedback;
    private String id;
    private String reference;
    private String status;
    @JsonProperty("updated_at")
    private Date updatedAt;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
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

    public String getBankCc() {
        return bankCc;
    }

    public void setBankCc(String bankCc) {
        this.bankCc = bankCc;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "LastWithdrawResponse{" + "accountId=" + accountId + ", accountType=" + accountType + ", amount=" + amount + ", bank=" + bank + ", bankAg=" + bankAg + ", bankCc=" + bankCc + ", created_at=" + created_at + ", feedback=" + feedback + ", id=" + id + ", reference=" + reference + ", status=" + status + ", updatedAt=" + updatedAt + '}';
    }

}

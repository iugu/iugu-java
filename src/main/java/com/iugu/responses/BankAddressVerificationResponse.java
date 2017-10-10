package com.iugu.responses;

import com.iugu.serializers.DateSerializer;
import com.iugu.serializers.JsonFormat;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.Date;

public class BankAddressVerificationResponse {

    private String id;
    private String status;
    @JsonProperty("created_at")
    @JsonFormat("yyyy-MM-dd'T'HH:mm:ssZ")
    @JsonSerialize(using = DateSerializer.class)
    private Date createdAt;
    @JsonProperty("updated_at")
    @JsonFormat("yyyy-MM-dd'T'HH:mm:ssZ")
    @JsonSerialize(using = DateSerializer.class)
    private Date updatedAt;
    private String account;
    private String agency;
    private String operation;
    private String feedback;
    private String bank;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "BankAddressVerificationResponse{" +
                "id='" + id + '\'' +
                ", status='" + status + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", account='" + account + '\'' +
                ", agency='" + agency + '\'' +
                ", operation='" + operation + '\'' +
                ", feedback='" + feedback + '\'' +
                ", bank='" + bank + '\'' +
                '}';
    }
}

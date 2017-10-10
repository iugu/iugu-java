package com.iugu.responses;

import com.iugu.serializers.DateSerializer;
import com.iugu.serializers.JsonFormat;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountVerificationResponse {

    private String id;
    private DataResponse data;
    @JsonProperty("account_id")
    private String accountId;
    @JsonProperty("created_at")
    @JsonFormat("yyyy-MM-dd'T'HH:mm:ssZ") @JsonSerialize(using = DateSerializer.class)
    private Date createdAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DataResponse getData() {
        return data;
    }

    public void setData(DataResponse data) {
        this.data = data;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "AccountVerificationResponse{" +
                "id='" + id + '\'' +
                ", data=" + data +
                ", accountId='" + accountId + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}

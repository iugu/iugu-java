package com.iugu.responses;

import com.iugu.serializers.DateSerializer;
import com.iugu.serializers.JsonFormat;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InitialBalanceResponse {

    private String amount;
    @JsonProperty("entry_date")
    @JsonFormat("yyyy-MM-dd") @JsonSerialize(using = DateSerializer.class)
    private Date entryDate;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    @Override
    public String toString() {
        return "InitialBalanceResponse{" +
                "amount='" + amount + '\'' +
                ", entryDate=" + entryDate +
                '}';
    }
}

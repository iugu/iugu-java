package com.iugu.responses;

import com.iugu.serializers.DateSerializer;
import com.iugu.serializers.JsonFormat;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionsResponse {

    private List<TransactionResponse> transactions;
    @JsonProperty("initial_balance")
    private InitialBalanceResponse initialBalance;
    @JsonProperty("initial_date")
    @JsonFormat("yyyy-MM-dd'T'HH:mm:ssZ") @JsonSerialize(using = DateSerializer.class)
    private Date initialDate;
    @JsonProperty("final_date")
    @JsonFormat("yyyy-MM-dd'T'HH:mm:ssZ") @JsonSerialize(using = DateSerializer.class)
    private Date finalDate;
    @JsonProperty("transactions_total")
    private Integer transactionsTotal;

    public List<TransactionResponse> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionResponse> transactions) {
        this.transactions = transactions;
    }

    public InitialBalanceResponse getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(InitialBalanceResponse initialBalance) {
        this.initialBalance = initialBalance;
    }

    public Date getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    public Integer getTransactionsTotal() {
        return transactionsTotal;
    }

    public void setTransactionsTotal(Integer transactionsTotal) {
        this.transactionsTotal = transactionsTotal;
    }

    @Override
    public String toString() {
        return "TransactionsResponse{" +
                "transactions=" + transactions +
                ", initialBalance=" + initialBalance +
                ", initialDate=" + initialDate +
                ", finalDate=" + finalDate +
                ", transactionsTotal=" + transactionsTotal +
                '}';
    }
}

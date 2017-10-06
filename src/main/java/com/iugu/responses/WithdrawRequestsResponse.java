package com.iugu.responses;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WithdrawRequestsResponse {
    
    private String totalItems;
    private List<WithdrawRequestsItemResponse> items;

    public String getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(String totalItems) {
        this.totalItems = totalItems;
    }

    public List<WithdrawRequestsItemResponse> getItems() {
        return items;
    }

    public void setItems(List<WithdrawRequestsItemResponse> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "WithdrawRequestsResponse{" +
                "totalItems='" + totalItems + '\'' +
                ", items=" + items +
                '}';
    }
}

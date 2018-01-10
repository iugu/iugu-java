package com.iugu.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SubscriptionsResponse {

    private Integer totalItems;
    private List<SubscriptionResponse> items;

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public List<SubscriptionResponse> getItems() {
        return items;
    }

    public void setItems(List<SubscriptionResponse> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "SubscriptionsResponse{" + "totalItems=" + totalItems + ", items=" + items + '}';
    }
}

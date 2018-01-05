package com.iugu.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomersResponse {
    
    private String totalItems;
    private List<CustomerResponse> items;

    public String getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(String totalItems) {
        this.totalItems = totalItems;
    }

    public List<CustomerResponse> getItems() {
        return items;
    }

    public void setItems(List<CustomerResponse> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "CustomersResponse{" + "totalItems=" + totalItems + ", items=" + items + '}';
    }
    
}

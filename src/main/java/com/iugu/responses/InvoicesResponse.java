package com.iugu.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoicesResponse {
    
    private String totalItems;
    private List<InvoiceResponse> items;

    public String getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(String totalItems) {
        this.totalItems = totalItems;
    }

    public List<InvoiceResponse> getItems() {
        return items;
    }

    public void setItems(List<InvoiceResponse> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "InvoicesResponse{" + "totalItems=" + totalItems + ", items=" + items + '}';
    }
    
}

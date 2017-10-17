package com.iugu.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExtractInvoicesResponse {

    private Integer totalItems;
    private List<ExtractInvoiceResponse> items;

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public List<ExtractInvoiceResponse> getItems() {
        return items;
    }

    public void setItems(List<ExtractInvoiceResponse> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ExtractInvoicesResponse{" +
                "totalItems=" + totalItems +
                ", items=" + items +
                '}';
    }
}

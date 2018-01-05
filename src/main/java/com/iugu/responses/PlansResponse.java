package com.iugu.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlansResponse {

    private Integer totalItems;
    private List<PlanResponse> items;

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public List<PlanResponse> getItems() {
        return items;
    }

    public void setItems(List<PlanResponse> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "PlansResponse{" + "totalItems=" + totalItems + ", items=" + items + '}';
    }

}

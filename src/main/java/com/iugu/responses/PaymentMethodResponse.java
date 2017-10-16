package com.iugu.responses;

public class PaymentMethodResponse {
    private String id;
    private String description;
    private String itemType;
    private String customerId;
    private DataResponse data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public DataResponse getData() {
        return data;
    }

    public void setData(DataResponse data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PaymentMethodResponse{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", itemType=" + itemType +
                ", customerId='" + customerId + '\'' +
                ", data=" + data +
                '}';
    }
}

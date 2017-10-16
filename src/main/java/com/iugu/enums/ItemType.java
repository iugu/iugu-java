package com.iugu.enums;

import com.google.gson.annotations.SerializedName;

public enum ItemType {

    @SerializedName("credit_card") CREDIT_CARD("credit_card");

    private String value;

    private ItemType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}

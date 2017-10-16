package com.iugu.enums;

import com.google.gson.annotations.SerializedName;

public enum IntervalType {

    @SerializedName("weeks") WEEKS("weeks"), @SerializedName("months") MONTHS("months");

    private String value;

    private IntervalType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}

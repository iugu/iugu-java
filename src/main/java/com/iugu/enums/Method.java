package com.iugu.enums;

import com.google.gson.annotations.SerializedName;

/**
 * Created by daniel on 02/11/2018.
 */
public enum Method {
    @SerializedName("bank_slip")
    BANK_SLIP("bank_slip");

    private String value;

    private Method(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}


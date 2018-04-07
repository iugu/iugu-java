package com.iugu.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PayableWith {

    CREDIT_CARD("credit_card"), ALL("all"), BANK_SLIP("bank_slip");

    private String value;

    private PayableWith(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static PayableWith getPayableWithByValue(String value) {
        PayableWith payableWith;
        switch (value) {
            case "credit_card":
                payableWith = PayableWith.CREDIT_CARD;
                break;
            case "all":
                payableWith = PayableWith.ALL;
                break;
            case "bank_slip":
                payableWith = PayableWith.BANK_SLIP;
                break;
            default:
                payableWith = null;
        }
        return payableWith;
    }

}

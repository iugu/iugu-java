package com.iugu.model;

import com.iugu.enums.Currency;

public class Price {

    private Currency currency;

    private int valueCents;

    public Price(Currency currency, int valueCents) {
        this.currency = currency;
        this.valueCents = valueCents;
    }

    public Currency getCurrency() {
        return currency;
    }

    public int getValueCents() {
        return valueCents;
    }

}

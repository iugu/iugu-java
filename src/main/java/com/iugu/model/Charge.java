package com.iugu.model;

import com.iugu.enums.Method;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by daniel on 02/11/2018.
 */
public class Charge {
    private Method method;
    private String token;
    private String customerPaymentMethodId;
    private Boolean restrictPaymentMethod;
    private String customerId;
    private String invoiceId;
    private String email;
    private Integer months;
    private Integer discountCents;
    private Integer bankSlipExtraDays;
    private Boolean keepDunning;
    private List<Item> items;
    private Payer payer;
    private String orderId;

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCustomerPaymentMethodId() {
        return customerPaymentMethodId;
    }

    public void setCustomerPaymentMethodId(String customerPaymentMethodId) {
        this.customerPaymentMethodId = customerPaymentMethodId;
    }

    public Boolean getRestrictPaymentMethod() {
        return restrictPaymentMethod;
    }

    public void setRestrictPaymentMethod(Boolean restrictPaymentMethod) {
        this.restrictPaymentMethod = restrictPaymentMethod;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMonths() {
        return months;
    }

    public void setMonths(Integer months) {
        this.months = months;
    }

    public Integer getDiscountCents() {
        return discountCents;
    }

    public void setDiscountCents(Integer discountCents) {
        this.discountCents = discountCents;
    }

    public Integer getBankSlipExtraDays() {
        return bankSlipExtraDays;
    }

    public void setBankSlipExtraDays(Integer bankSlipExtraDays) {
        this.bankSlipExtraDays = bankSlipExtraDays;
    }

    public Boolean getKeepDunning() {
        return keepDunning;
    }

    public void setKeepDunning(Boolean keepDunning) {
        this.keepDunning = keepDunning;
    }

    public List<Item> getItems() {
        if (items == null) {
            items = new ArrayList<>();
        }
        return items;
    }

    public Payer getPayer() {
        return payer;
    }

    public void setPayer(Payer payer) {
        this.payer = payer;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Charge charge = (Charge) o;
        return method == charge.method &&
                Objects.equals(token, charge.token) &&
                Objects.equals(customerPaymentMethodId, charge.customerPaymentMethodId) &&
                Objects.equals(restrictPaymentMethod, charge.restrictPaymentMethod) &&
                Objects.equals(customerId, charge.customerId) &&
                Objects.equals(invoiceId, charge.invoiceId) &&
                Objects.equals(email, charge.email) &&
                Objects.equals(months, charge.months) &&
                Objects.equals(discountCents, charge.discountCents) &&
                Objects.equals(bankSlipExtraDays, charge.bankSlipExtraDays) &&
                Objects.equals(keepDunning, charge.keepDunning) &&
                Objects.equals(items, charge.items) &&
                Objects.equals(payer, charge.payer) &&
                Objects.equals(orderId, charge.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(method, token, customerPaymentMethodId, restrictPaymentMethod, customerId, invoiceId, email, months, discountCents, bankSlipExtraDays, keepDunning, items, payer, orderId);
    }
}

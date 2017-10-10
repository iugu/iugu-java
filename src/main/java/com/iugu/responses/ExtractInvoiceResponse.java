package com.iugu.responses;

import com.iugu.serializers.DateSerializer;
import com.iugu.serializers.JsonFormat;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExtractInvoiceResponse {

    private String id;
    @JsonProperty("created_at")
    @JsonFormat("yyyy-MM-dd'T'HH:mm:ssZ")
    @JsonSerialize(using = DateSerializer.class)
    private Date createdAt;
    @JsonProperty("due_date")
    @JsonFormat("yyyy-MM-dd")
    @JsonSerialize(using = DateSerializer.class)
    private Date dueDate;
    @JsonProperty("paid_at")
    private Date paidAt;
    @JsonProperty("pending_value")
    private String pendingValue;
    @JsonProperty("paid_value")
    private String paidValue;
    @JsonProperty("taxes_paid")
    private String taxesPaid;
    @JsonProperty("payment_method")
    private String paymentMethod;
    private String installments;
    @JsonProperty("customer_id")
    private String customerId;
    @JsonProperty("customer_email")
    private String customerEmail;
    @JsonProperty("customer_name")
    private String customerName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getPaidAt() {
        return paidAt;
    }

    public void setPaidAt(Date paidAt) {
        this.paidAt = paidAt;
    }

    public String getPendingValue() {
        return pendingValue;
    }

    public void setPendingValue(String pendingValue) {
        this.pendingValue = pendingValue;
    }

    public String getPaidValue() {
        return paidValue;
    }

    public void setPaidValue(String paidValue) {
        this.paidValue = paidValue;
    }

    public String getTaxesPaid() {
        return taxesPaid;
    }

    public void setTaxesPaid(String taxesPaid) {
        this.taxesPaid = taxesPaid;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getInstallments() {
        return installments;
    }

    public void setInstallments(String installments) {
        this.installments = installments;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "ExtractInvoiceResponse{" +
                "id='" + id + '\'' +
                ", createdAt=" + createdAt +
                ", dueDate='" + dueDate + '\'' +
                ", paidAt=" + paidAt +
                ", pendingValue='" + pendingValue + '\'' +
                ", paidValue='" + paidValue + '\'' +
                ", taxesPaid='" + taxesPaid + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", installments='" + installments + '\'' +
                ", customerId='" + customerId + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}

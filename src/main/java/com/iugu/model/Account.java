package com.iugu.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class Account {

    @JsonProperty("commission_percent")
    private String commissionPercent;
    @JsonProperty("auto_withdraw")
    private Boolean auto_withdraw;
    private Boolean fines;
    @JsonProperty("per_day_interest")
    private Boolean perDayInterest;
    @JsonProperty("late_payment_fine")
    private Integer latePaymentFine;
    @JsonProperty("auto_advance")
    private Boolean autoAdvance;
    @JsonProperty("auto_advance_type")
    private String autoAdvanceType;
    @JsonProperty("auto_advance_option")
    private String autoAdvanceOption;
    @JsonProperty("bank_slip")
    private BankSlip bankSlip;
    @JsonProperty("credit_card")
    private CreditCard creditCard;
    @JsonProperty("payment_email_notification")
    private Boolean paymentEmailNotification;
    @JsonProperty("payment_email_notification_receiver")
    private String paymentEmailNotificationReceiver;
    @JsonProperty("early_payment_discount")
    private Boolean earlyPaymentDiscount;
    @JsonProperty("early_payment_discounts")
    private List<EarlyPaymentDiscount> earlyPaymentDiscounts;

    public String getCommissionPercent() {
        return commissionPercent;
    }

    public void setCommissionPercent(String commissionPercent) {
        this.commissionPercent = commissionPercent;
    }

    public Boolean getAuto_withdraw() {
        return auto_withdraw;
    }

    public void setAuto_withdraw(Boolean auto_withdraw) {
        this.auto_withdraw = auto_withdraw;
    }

    public Boolean getFines() {
        return fines;
    }

    public void setFines(Boolean fines) {
        this.fines = fines;
    }

    public Boolean getPerDayInterest() {
        return perDayInterest;
    }

    public void setPerDayInterest(Boolean perDayInterest) {
        this.perDayInterest = perDayInterest;
    }

    public Integer getLatePaymentFine() {
        return latePaymentFine;
    }

    public void setLatePaymentFine(Integer latePaymentFine) {
        this.latePaymentFine = latePaymentFine;
    }

    public Boolean getAutoAdvance() {
        return autoAdvance;
    }

    public void setAutoAdvance(Boolean autoAdvance) {
        this.autoAdvance = autoAdvance;
    }

    public String getAutoAdvanceType() {
        return autoAdvanceType;
    }

    public void setAutoAdvanceType(String autoAdvanceType) {
        this.autoAdvanceType = autoAdvanceType;
    }

    public String getAutoAdvanceOption() {
        return autoAdvanceOption;
    }

    public void setAutoAdvanceOption(String autoAdvanceOption) {
        this.autoAdvanceOption = autoAdvanceOption;
    }

    public BankSlip getBankSlip() {
        return bankSlip;
    }

    public void setBankSlip(BankSlip bankSlip) {
        this.bankSlip = bankSlip;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public Boolean getPaymentEmailNotification() {
        return paymentEmailNotification;
    }

    public void setPaymentEmailNotification(Boolean paymentEmailNotification) {
        this.paymentEmailNotification = paymentEmailNotification;
    }

    public String getPaymentEmailNotificationReceiver() {
        return paymentEmailNotificationReceiver;
    }

    public void setPaymentEmailNotificationReceiver(String paymentEmailNotificationReceiver) {
        this.paymentEmailNotificationReceiver = paymentEmailNotificationReceiver;
    }

    public Boolean getEarlyPaymentDiscount() {
        return earlyPaymentDiscount;
    }

    public void setEarlyPaymentDiscount(Boolean earlyPaymentDiscount) {
        this.earlyPaymentDiscount = earlyPaymentDiscount;
    }

    public List<EarlyPaymentDiscount> getEarlyPaymentDiscounts() {
        return earlyPaymentDiscounts;
    }

    public void setEarlyPaymentDiscounts(List<EarlyPaymentDiscount> earlyPaymentDiscounts) {
        this.earlyPaymentDiscounts = earlyPaymentDiscounts;
    }

    @Override
    public String toString() {
        return "Account{" +
                "commissionPercent='" + commissionPercent + '\'' +
                ", auto_withdraw=" + auto_withdraw +
                ", fines=" + fines +
                ", perDayInterest=" + perDayInterest +
                ", latePaymentFine=" + latePaymentFine +
                ", autoAdvance=" + autoAdvance +
                ", autoAdvanceType='" + autoAdvanceType + '\'' +
                ", autoAdvanceOption='" + autoAdvanceOption + '\'' +
                ", bankSlip=" + bankSlip +
                ", creditCard=" + creditCard +
                ", paymentEmailNotification=" + paymentEmailNotification +
                ", paymentEmailNotificationReceiver='" + paymentEmailNotificationReceiver + '\'' +
                ", earlyPaymentDiscount=" + earlyPaymentDiscount +
                ", earlyPaymentDiscounts=" + earlyPaymentDiscounts +
                '}';
    }
}

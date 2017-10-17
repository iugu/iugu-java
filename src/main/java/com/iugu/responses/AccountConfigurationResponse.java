package com.iugu.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountConfigurationResponse {

    private String id;
    private String name;
    @JsonProperty("created_at")
    private Date createdAt;
    @JsonProperty("updated_at")
    private Date updatedAt;
    @JsonProperty("can_receive")
    private Boolean canReceive;
    @JsonProperty("is_verified")
    private Boolean isVerified;
    @JsonProperty("last_verification_request_status")
    private String lastVerificationRequestStatus;
    @JsonProperty("change_plan_type")
    private Integer changePlanType;
    @JsonProperty("subscriptions_trial_period")
    private Integer subscriptionsTrialPeriod;
    @JsonProperty("disable_emails")
    private Boolean disableEmails;
    @JsonProperty("total_subscriptions")
    private Integer totalSubscriptions;
    @JsonProperty("webapp_on_test_mode")
    private Boolean webappOnTestMode;
    private Boolean marketplace;
    @JsonProperty("default_return_url")
    private String defaultReturnUrl;
    @JsonProperty("auto_withdraw")
    private Boolean autoWithdraw;
    private String balance;
    @JsonProperty("protected_balance")
    private String protectedBalance;
    @JsonProperty("payable_balance")
    private String payableBalance;
    @JsonProperty("receivable_balance")
    private String receivableBalance;
    @JsonProperty("commission_balance")
    private String commissionBalance;
    @JsonProperty("volume_last_month")
    private String volumeLastMonth;
    @JsonProperty("volume_this_month")
    private String volumeThisMonth;
    @JsonProperty("taxes_paid_last_month")
    private String taxesPaidLastMonth;
    @JsonProperty("taxes_paid_this_month")
    private String taxesPaidThisMonth;
    private List<InfoResponse> informations;
    private ConfigurationResponse configuration;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getCanReceive() {
        return canReceive;
    }

    public void setCanReceive(Boolean canReceive) {
        this.canReceive = canReceive;
    }

    public Boolean getVerified() {
        return isVerified;
    }

    public void setVerified(Boolean verified) {
        isVerified = verified;
    }

    public String getLastVerificationRequestStatus() {
        return lastVerificationRequestStatus;
    }

    public void setLastVerificationRequestStatus(String lastVerificationRequestStatus) {
        this.lastVerificationRequestStatus = lastVerificationRequestStatus;
    }

    public Integer getChangePlanType() {
        return changePlanType;
    }

    public void setChangePlanType(Integer changePlanType) {
        this.changePlanType = changePlanType;
    }

    public Integer getSubscriptionsTrialPeriod() {
        return subscriptionsTrialPeriod;
    }

    public void setSubscriptionsTrialPeriod(Integer subscriptionsTrialPeriod) {
        this.subscriptionsTrialPeriod = subscriptionsTrialPeriod;
    }

    public Boolean getDisableEmails() {
        return disableEmails;
    }

    public void setDisableEmails(Boolean disableEmails) {
        this.disableEmails = disableEmails;
    }

    public Integer getTotalSubscriptions() {
        return totalSubscriptions;
    }

    public void setTotalSubscriptions(Integer totalSubscriptions) {
        this.totalSubscriptions = totalSubscriptions;
    }

    public Boolean getWebappOnTestMode() {
        return webappOnTestMode;
    }

    public void setWebappOnTestMode(Boolean webappOnTestMode) {
        this.webappOnTestMode = webappOnTestMode;
    }

    public Boolean getMarketplace() {
        return marketplace;
    }

    public void setMarketplace(Boolean marketplace) {
        this.marketplace = marketplace;
    }

    public String getDefaultReturnUrl() {
        return defaultReturnUrl;
    }

    public void setDefaultReturnUrl(String defaultReturnUrl) {
        this.defaultReturnUrl = defaultReturnUrl;
    }

    public Boolean getAutoWithdraw() {
        return autoWithdraw;
    }

    public void setAutoWithdraw(Boolean autoWithdraw) {
        this.autoWithdraw = autoWithdraw;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getProtectedBalance() {
        return protectedBalance;
    }

    public void setProtectedBalance(String protectedBalance) {
        this.protectedBalance = protectedBalance;
    }

    public String getPayableBalance() {
        return payableBalance;
    }

    public void setPayableBalance(String payableBalance) {
        this.payableBalance = payableBalance;
    }

    public String getReceivableBalance() {
        return receivableBalance;
    }

    public void setReceivableBalance(String receivableBalance) {
        this.receivableBalance = receivableBalance;
    }

    public String getCommissionBalance() {
        return commissionBalance;
    }

    public void setCommissionBalance(String commissionBalance) {
        this.commissionBalance = commissionBalance;
    }

    public String getVolumeLastMonth() {
        return volumeLastMonth;
    }

    public void setVolumeLastMonth(String volumeLastMonth) {
        this.volumeLastMonth = volumeLastMonth;
    }

    public String getVolumeThisMonth() {
        return volumeThisMonth;
    }

    public void setVolumeThisMonth(String volumeThisMonth) {
        this.volumeThisMonth = volumeThisMonth;
    }

    public String getTaxesPaidLastMonth() {
        return taxesPaidLastMonth;
    }

    public void setTaxesPaidLastMonth(String taxesPaidLastMonth) {
        this.taxesPaidLastMonth = taxesPaidLastMonth;
    }

    public String getTaxesPaidThisMonth() {
        return taxesPaidThisMonth;
    }

    public void setTaxesPaidThisMonth(String taxesPaidThisMonth) {
        this.taxesPaidThisMonth = taxesPaidThisMonth;
    }

    public List<InfoResponse> getInformations() {
        return informations;
    }

    public void setInformations(List<InfoResponse> informations) {
        this.informations = informations;
    }

    public ConfigurationResponse getConfiguration() {
        return configuration;
    }

    public void setConfiguration(ConfigurationResponse configuration) {
        this.configuration = configuration;
    }

    @Override
    public String toString() {
        return "AccountConfigurationResponse{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", canReceive=" + canReceive +
                ", isVerified=" + isVerified +
                ", lastVerificationRequestStatus='" + lastVerificationRequestStatus + '\'' +
                ", changePlanType=" + changePlanType +
                ", subscriptionsTrialPeriod=" + subscriptionsTrialPeriod +
                ", disableEmails=" + disableEmails +
                ", totalSubscriptions=" + totalSubscriptions +
                ", webappOnTestMode=" + webappOnTestMode +
                ", marketplace=" + marketplace +
                ", defaultReturnUrl='" + defaultReturnUrl + '\'' +
                ", autoWithdraw=" + autoWithdraw +
                ", balance='" + balance + '\'' +
                ", protectedBalance='" + protectedBalance + '\'' +
                ", payableBalance='" + payableBalance + '\'' +
                ", receivableBalance='" + receivableBalance + '\'' +
                ", commissionBalance='" + commissionBalance + '\'' +
                ", volumeLastMonth='" + volumeLastMonth + '\'' +
                ", volumeThisMonth='" + volumeThisMonth + '\'' +
                ", taxesPaidLastMonth='" + taxesPaidLastMonth + '\'' +
                ", taxesPaidThisMonth='" + taxesPaidThisMonth + '\'' +
                ", informations=" + informations +
                ", configuration=" + configuration +
                '}';
    }
}

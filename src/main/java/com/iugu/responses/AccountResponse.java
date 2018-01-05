package com.iugu.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountResponse {

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
    @JsonProperty("last_verification_request_data")
    private AccountLastVerification accountLastVerification;
    @JsonProperty("last_verification_request_feedback")
    private String lastVerificationRequestFeedback;
    @JsonProperty("change_plan_type")
    private Integer changePlanType;
    @JsonProperty("subscriptions_trial_period")
    private Integer subscriptionsTrialPeriod;
    @JsonProperty("disable_emails")
    private Boolean disableEmails;
    @JsonProperty("last_withdraw")
    private LastWithdrawResponse lastWithdraw;
    @JsonProperty("total_subscriptions")
    private Integer totalSubscriptions;
    @JsonProperty("reply_to")
    private String replyTo;
    @JsonProperty("webapp_on_test_mode")
    private Boolean webappOnTestMode;
    private Boolean marketplace;
    @JsonProperty("auto_withdraw")
    private Boolean autoWithdraw;
    private String balance;
    @JsonProperty("balance_available_for_withdraw")
    private String balanceAvailableForWithdraw;
    @JsonProperty("balance_in_protest")
    private String balanceInProtest;
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
    @JsonProperty("custom_logo_url")
    private String customLogoUrl;
    @JsonProperty("custom_logo_small_url")
    private String customLogoSmallUrl;
    private List<InfoResponse> informations;

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

    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public String getLastVerificationRequestStatus() {
        return lastVerificationRequestStatus;
    }

    public void setLastVerificationRequestStatus(String lastVerificationRequestStatus) {
        this.lastVerificationRequestStatus = lastVerificationRequestStatus;
    }

    public AccountLastVerification getAccountLastVerification() {
        return accountLastVerification;
    }

    public void setAccountLastVerification(AccountLastVerification accountLastVerification) {
        this.accountLastVerification = accountLastVerification;
    }

    public String getLastVerificationRequestFeedback() {
        return lastVerificationRequestFeedback;
    }

    public void setLastVerificationRequestFeedback(String lastVerificationRequestFeedback) {
        this.lastVerificationRequestFeedback = lastVerificationRequestFeedback;
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

    public LastWithdrawResponse getLastWithdraw() {
        return lastWithdraw;
    }

    public void setLastWithdraw(LastWithdrawResponse lastWithdraw) {
        this.lastWithdraw = lastWithdraw;
    }

    public Integer getTotalSubscriptions() {
        return totalSubscriptions;
    }

    public void setTotalSubscriptions(Integer totalSubscriptions) {
        this.totalSubscriptions = totalSubscriptions;
    }

    public String getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
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

    public String getBalanceAvailableForWithdraw() {
        return balanceAvailableForWithdraw;
    }

    public void setBalanceAvailableForWithdraw(String balanceAvailableForWithdraw) {
        this.balanceAvailableForWithdraw = balanceAvailableForWithdraw;
    }

    public String getBalanceInProtest() {
        return balanceInProtest;
    }

    public void setBalanceInProtest(String balanceInProtest) {
        this.balanceInProtest = balanceInProtest;
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

    public String getCustomLogoUrl() {
        return customLogoUrl;
    }

    public void setCustomLogoUrl(String customLogoUrl) {
        this.customLogoUrl = customLogoUrl;
    }

    public String getCustomLogoSmallUrl() {
        return customLogoSmallUrl;
    }

    public void setCustomLogoSmallUrl(String customLogoSmallUrl) {
        this.customLogoSmallUrl = customLogoSmallUrl;
    }

    public List<InfoResponse> getInformations() {
        return informations;
    }

    public void setInformations(List<InfoResponse> informations) {
        this.informations = informations;
    }

    @Override
    public String toString() {
        return "AccountResponse{" + "id=" + id + ", name=" + name + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", canReceive=" + canReceive + ", isVerified=" + isVerified + ", lastVerificationRequestStatus=" + lastVerificationRequestStatus + ", accountLastVerification=" + accountLastVerification + ", lastVerificationRequestFeedback=" + lastVerificationRequestFeedback + ", changePlanType=" + changePlanType + ", subscriptionsTrialPeriod=" + subscriptionsTrialPeriod + ", disableEmails=" + disableEmails + ", lastWithdraw=" + lastWithdraw + ", totalSubscriptions=" + totalSubscriptions + ", replyTo=" + replyTo + ", webappOnTestMode=" + webappOnTestMode + ", marketplace=" + marketplace + ", autoWithdraw=" + autoWithdraw + ", balance=" + balance + ", balanceAvailableForWithdraw=" + balanceAvailableForWithdraw + ", balanceInProtest=" + balanceInProtest + ", protectedBalance=" + protectedBalance + ", payableBalance=" + payableBalance + ", receivableBalance=" + receivableBalance + ", commissionBalance=" + commissionBalance + ", volumeLastMonth=" + volumeLastMonth + ", volumeThisMonth=" + volumeThisMonth + ", taxesPaidLastMonth=" + taxesPaidLastMonth + ", taxesPaidThisMonth=" + taxesPaidThisMonth + ", customLogoUrl=" + customLogoUrl + ", customLogoSmallUrl=" + customLogoSmallUrl + ", informations=" + informations + '}';
    }

}

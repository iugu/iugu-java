package com.iugu.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.iugu.enums.PayableWith;
import com.iugu.serializers.DateSerializer;
import com.iugu.serializers.JsonFormat;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Invoice implements Serializable {

	private static final long serialVersionUID = 1719931730355279382L;

	/**
	 * E-Mail do cliente
	 */
	private String email;

	/**
	 * Data de Expiração (DD/MM/AAAA)
	 */
	@JsonProperty("due_date")
	@JsonFormat("dd/MM/yyyy")
	@JsonSerialize(using = DateSerializer.class)
	private Date dueDate;

	/**
	 * Itens da Fatura
	 */
	private List<Item> items = new ArrayList<>();

	/**
	 * Payer
	 */
	private Payer payer;
	
	/**
	 * Emails de cópia
	 */
	@JsonProperty("cc_emails")
	private String ccEmails;

	/**
	 * Cliente é redirecionado para essa URL após efetuar o pagamento da Fatura
	 * pela página de Fatura da Iugu
	 */
	@JsonProperty("return_url")
	private String returnUrl;

	/**
	 * Cliente é redirecionado para essa URL se a Fatura que estiver acessando
	 * estiver expirada
	 */
	@JsonProperty("expired_url")
	private String expiredUrl;

	/**
	 * ID do cliente
	 */
	@JsonProperty("customer_id")
	private String customerId;

	/**
	 * URL chamada para todas as notificações de Fatura, assim como os webhooks
	 * (Gatilhos) são chamados
	 */
	@JsonProperty("notification_url")
	private String notificationUrl;

	/**
	 * Valor dos Impostos em centavos
	 */
	@JsonProperty("tax_cents")
	private Integer taxCents;

	/**
	 * Booleano para Habilitar ou Desabilitar multa por atraso de pagamento
	 */
	private Boolean fines;

	/**
	 * Determine a multa a ser cobrada para pagamentos efetuados após a data de
	 * vencimento
	 */
	@JsonProperty("late_payment_fine")
	private Double latePaymentFine;

	/**
	 * Booleano que determina se cobra ou não juros por dia de atraso. 1% ao mês
	 * pro rata.
	 */
	@JsonProperty("per_day_interest")
	private Double perDayInterest;

	/**
	 * Valor dos Descontos em centavos
	 */
	@JsonProperty("discount_cents")
	private Integer discountCents;

	@JsonProperty("payable_with")
	private PayableWith payableWith;

	public Invoice(String email, Date dueDate, Item... items) {
		this.email = email;
		this.dueDate = dueDate;
		this.items.addAll(Arrays.asList(items)); // FIXME Tratar null pointer
	}
	public Invoice(String email, Date dueDate, Payer Payer, Item... items) {
		this.email = email;
		this.dueDate = dueDate;
		this.payer = Payer;
		this.items.addAll(Arrays.asList(items)); // FIXME Tratar null pointer
	}

	public String getEmail() {
		return email;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public List<Item> getItems() {
		return items;
	}

	public Payer getPayer() {
		return payer;
	}
	
	public void setPayer(Payer Payer) {
		this.payer = Payer;
	}
	
	public String getReturnUrl() {
		return returnUrl;
	}

	public Invoice withReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
		return this;
	}

	public String getExpiredUrl() {
		return expiredUrl;
	}

	public Invoice withExpiredUrl(String expiredUrl) {
		this.expiredUrl = expiredUrl;
		return this;
	}

	public String getCustomerId() {
		return customerId;
	}

	public Invoice withCustomerId(String customerId) {
		this.customerId = customerId;
		return this;
	}

	public String getNotificationUrl() {
		return notificationUrl;
	}

	public Invoice withNotificationUrl(String notificationUrl) {
		this.notificationUrl = notificationUrl;
		return this;
	}

	public Integer getTaxCents() {
		return taxCents;
	}

	public Invoice withTaxCents(Integer taxCents) {
		this.taxCents = taxCents;
		return this;
	}

	public Boolean getFines() {
		return fines;
	}

	public Invoice withFines(Boolean fines) {
		this.fines = fines;
		return this;
	}

	public Double getLatePaymentFine() {
		return latePaymentFine;
	}

	public void setLatePaymentFine(Double latePaymentFine) {
		this.latePaymentFine = latePaymentFine;
	}

	public Double getPerDayInterest() {
		return perDayInterest;
	}

	public void setPerDayInterest(Double perDayInterest) {
		this.perDayInterest = perDayInterest;
	}

	public Integer getDiscountCents() {
		return discountCents;
	}

	public void setDiscountCents(Integer discountCents) {
		this.discountCents = discountCents;
	}

	public PayableWith getPayableWith() {
		return payableWith;
	}

	public void setPayableWith(PayableWith payableWith) {
		this.payableWith = payableWith;
	}

	public String getCcEmails() {
		return ccEmails;
	}

	public Invoice withCcEmails(String ccEmails) {
		this.ccEmails = ccEmails;
		return this;
	}

}
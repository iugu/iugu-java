package com.iugu.responses;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChargeResponse {

	@JsonProperty("success")
	private Boolean success;

	@JsonProperty("message")
	private String message;

	@JsonProperty("url")
	private String url;

	@JsonProperty("invoice_id")
	private String invoiceId;

	@JsonProperty("errors")
	private Object errors;

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Object getErrors() {
		return errors;
	}

	public void setErrors(Object errors) {
		this.errors = errors;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("ChargeResponse{");
		sb.append("success=").append(success);
		sb.append(", message='").append(message).append('\'');
		sb.append(", url='").append(url).append('\'');
		sb.append(", invoiceId='").append(invoiceId).append('\'');
		sb.append(", errors=").append(errors);
		sb.append('}');
		return sb.toString();
	}
}

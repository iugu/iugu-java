package com.iugu.responses;

import com.iugu.enums.PayableWith;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentTokenResponse {

	@JsonProperty("id")
	private String id;

	@JsonProperty("method")
	private String method;

	@JsonProperty("test")
	private Boolean isTest;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Boolean getTest() {
		return isTest;
	}

	public void setTest(Boolean test) {
		isTest = test;
	}

	@Override
	public String toString() {
		return "PaymentTokenResponse{" +
				"id='" + id + '\'' +
				", method='" + method + '\'' +
				", isTest=" + isTest +
				'}';
	}
}

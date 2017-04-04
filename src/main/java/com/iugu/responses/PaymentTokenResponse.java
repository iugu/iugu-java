package com.iugu.responses;

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

	@JsonProperty("extra_info")
	private ExtraInfoResponse extraInfo;

	public String getId() {
		return id;
	}

	public String getMethod() {
		return method;
	}

	public Boolean getTest() {
		return isTest;
	}

	public ExtraInfoResponse getExtraInfo() {
		return extraInfo;
	}

	@Override
	public String toString() {
		return "PaymentTokenResponse{" +
				"id='" + id + '\'' +
				", method='" + method + '\'' +
				", isTest=" + isTest +
				", extraInfo=" + extraInfo +
				'}';
	}
}

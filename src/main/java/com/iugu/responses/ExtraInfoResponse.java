package com.iugu.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExtraInfoResponse {

	@JsonProperty("brand")
	private Object brand;

	@JsonProperty("holder_name")
	private Object holderName;

	@JsonProperty("display_number")
	private Object displayNumber;

	@JsonProperty("bin")
	private Object bin;

	@JsonProperty("month")
	private Integer month;

	@JsonProperty("year")
	private Integer year;

	public Object getBrand() {
		return brand;
	}

	public Object getHolderName() {
		return holderName;
	}

	public Object getDisplayNumber() {
		return displayNumber;
	}

	public Object getBin() {
		return bin;
	}

	public Integer getMonth() {
		return month;
	}

	public Integer getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "ExtraInfo{" +
				"brand=" + brand +
				", holderName=" + holderName +
				", displayNumber=" + displayNumber +
				", bin=" + bin +
				", month=" + month +
				", year=" + year +
				'}';
	}
}

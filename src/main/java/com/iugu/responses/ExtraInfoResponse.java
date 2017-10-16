package com.iugu.responses;

public class ExtraInfoResponse {

	private Object brand;

	private Object holderName;

	private Object displayNumber;

	private Object bin;

	private Integer month;

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

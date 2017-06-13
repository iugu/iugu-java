package com.iugu.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BankSlipResponse {

	@JsonProperty("digitable_line")
	private String digitableLine;
	
	@JsonProperty("barcode_data")
	private String barcodeData;
	
	private String barcode;

	public String getDigitableLine() {
		return digitableLine;
	}

	public void setDigitableLine(String digitableLine) {
		this.digitableLine = digitableLine;
	}

	public String getBarcodeData() {
		return barcodeData;
	}

	public void setBarcodeData(String barcodeData) {
		this.barcodeData = barcodeData;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
}
package com.iugu.responses;

public class BankSlipResponse {

	private String digitableLine;
	
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
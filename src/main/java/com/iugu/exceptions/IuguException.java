package com.iugu.exceptions;

public class IuguException extends Exception {
	private static final long serialVersionUID = 8701207870125630038L;
	
	public IuguException(String Message, int ResponseCode, String ResponseText) {
		super(Message + " - StatusCode: [" + ResponseCode + "] / ResponseText: [" + ResponseText + "]");
	}
}

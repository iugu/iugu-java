package com.iugu.exceptions;

public class IuguException extends Exception {
    private static final long serialVersionUID = 8701207870125630038L;
    private int responseCode;
    private String responseText;

    public IuguException(String message, int responseCode, String responseText) {
        super(message + " - StatusCode: [" + responseCode + "] / ResponseText: [" + responseText + "]");
        this.responseCode = responseCode;
        this.responseText = responseText;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public String getResponseText() {
        return responseText;
    }
}

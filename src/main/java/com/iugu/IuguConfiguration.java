package com.iugu;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class IuguConfiguration {

	private final static String URL = "https://api.iugu.com/v1";
	private final String tokenId;

	public IuguConfiguration(String token) {
		tokenId = token;
	}

	public Client getNewClient() {
		return ClientBuilder.newClient().register(new Authenticator(tokenId, ""));
	}

	public static String url(String endpoint) {
		return URL + endpoint;
	}

}
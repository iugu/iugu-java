package com.iugu;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class Iugu {

	private final static String URL = "https://api.iugu.com/v1";
	private static String tokenId = "";
	
	private static Client client; 
	
	private Iugu() {
		
	}
	
	public static void init(String t) {
		tokenId = t;
	}
	
	public static Client getClient() {
		if(client == null) {
			client = ClientBuilder.newClient()
	                .register(new Authenticator(tokenId, ""));
		}
		
		return client;
	}
	
	public static String url(String endpoint) {
		return URL + endpoint;
	}
	
}
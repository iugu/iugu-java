package com.iugu;

import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class IuguConfiguration {

	private final static String URL = "https://api.iugu.com/v1";
	private final String tokenId;

	public IuguConfiguration(String token) {
		tokenId = token;
	}

	public Client getNewClient() {
		return ClientBuilder.newBuilder().sslContext(getContext()).build().register(new Authenticator(tokenId, ""));
	}

	public Client getNewClientNotAuth() {
		return ClientBuilder.newBuilder().sslContext(getContext()).build();
	}

	public static String url(String endpoint) {
		return URL + endpoint;
	}

        public SSLContext getContext() {
            try {
                TrustManager[] noopTrustManager = new TrustManager[]{
                    new X509TrustManager() {

                        @Override
                        public X509Certificate[] getAcceptedIssuers() {
                            return null;
                        }

                        @Override
                        public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
                        }

                        @Override
                        public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
                        }
                    }
                };

                SSLContext sc = SSLContext.getInstance("SSL");
                sc.init(null, noopTrustManager, null);
                
                return sc;
            } catch (Exception e) {
                System.out.println(e.getCause());
                return null;
            }

        }
        
}
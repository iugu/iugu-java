package com.iugu;

import com.iugu.serializers.GsonJsonProvider;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;

public class IuguConfiguration {

    private final static String URL = "https://api.iugu.com/v1";
    private final String tokenId;
    private String proxyHost;
    private int proxyPort;

    public IuguConfiguration(String token, String proxyHost, int proxyPort) {
        tokenId = token;
        this.proxyHost = proxyHost;
        this.proxyPort = proxyPort;
    }

    public IuguConfiguration(String token) {
        tokenId = token;
    }

    public ResteasyClient getNewClient() {
        ResteasyClientBuilder builder = new ResteasyClientBuilder()
                .register(new GsonJsonProvider())
                .register(new Authenticator(tokenId, ""));
        if (proxyHost != null && proxyHost.trim().length() > 0) {
            builder.defaultProxy(proxyHost, proxyPort);
        }
        return builder.build();
    }

    public ResteasyClient getNewClientNotAuth() {
        ResteasyClientBuilder builder = new ResteasyClientBuilder()
                .register(new GsonJsonProvider());
        if (proxyHost != null && proxyHost.trim().length() > 0) {
            builder.defaultProxy(proxyHost, proxyPort);
        }
        return builder.build();
    }

    public static String url(String endpoint) {
        return URL + endpoint;
    }

}
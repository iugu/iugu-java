package com.iugu.services;

import com.iugu.IuguConfiguration;
import com.iugu.exceptions.IuguException;
import com.iugu.model.MarketPlace;
import com.iugu.responses.AccountResponse;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class MarketplaceService {

    private IuguConfiguration iugu;
    private final String CREATE_ACCOUNT_URL = IuguConfiguration.url("/marketplace/create_account");

    public MarketplaceService(IuguConfiguration iuguConfiguration) {
        this.iugu = iuguConfiguration;
    }

    public AccountResponse createAccount(MarketPlace marketPlace) throws IuguException {
        Response response = this.iugu.getNewClient().target(CREATE_ACCOUNT_URL).request().post(Entity.entity(marketPlace, MediaType.APPLICATION_JSON));

        int ResponseStatus = response.getStatus();
        String ResponseText = null;

        if (ResponseStatus == 200)
            return response.readEntity(AccountResponse.class);

        // Error Happened
        if (response.hasEntity())
            ResponseText = response.readEntity(String.class);

        response.close();

        throw new IuguException("Error creating account!", ResponseStatus, ResponseText);
    }
}

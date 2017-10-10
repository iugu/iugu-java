package com.iugu.services;

import com.iugu.IuguConfiguration;
import com.iugu.exceptions.IuguException;
import com.iugu.model.BankAddress;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class BankService {

    private IuguConfiguration iugu;
    private final String ADD_URL = IuguConfiguration.url("/bank_verification");

    public BankService(IuguConfiguration iuguConfiguration) {
        this.iugu = iuguConfiguration;
    }

    public Boolean add(BankAddress bankAddress) throws IuguException {
        Response response = this.iugu.getNewClient().target(ADD_URL).request().post(Entity.entity(bankAddress, MediaType.APPLICATION_JSON));
        int ResponseStatus = response.getStatus();
        String ResponseText = null;

        if (ResponseStatus == 200)
            return response.readEntity(Boolean.class);

        // Error Happened
        if (response.hasEntity())
            ResponseText = response.readEntity(String.class);

        response.close();

        throw new IuguException("Error add bank address!", ResponseStatus, ResponseText);
    }
}

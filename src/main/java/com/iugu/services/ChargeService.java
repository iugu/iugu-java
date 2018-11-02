package com.iugu.services;

import com.iugu.IuguConfiguration;
import com.iugu.exceptions.IuguException;
import com.iugu.model.Charge;
import com.iugu.responses.ChargeResponse;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by daniel on 02/11/2018.
 */
public class ChargeService {

    private IuguConfiguration iugu;
    private final String CHARGE_URL = IuguConfiguration.url("/charge");

    public ChargeService(IuguConfiguration iuguConfiguration) {
        this.iugu = iuguConfiguration;
    }

    public ChargeResponse charge(Charge charge) throws IuguException {
        Response response = this.iugu.getNewClient().target(CHARGE_URL).request().post(Entity.entity(charge, MediaType.APPLICATION_JSON));

        int ResponseStatus = response.getStatus();
        String ResponseText = null;

        if (ResponseStatus == 200)
            return response.readEntity(ChargeResponse.class);

        // Error Happened
        if (response.hasEntity())
            ResponseText = response.readEntity(String.class);

        response.close();

        throw new IuguException("Error creating invoice!", ResponseStatus, ResponseText);
    }

}

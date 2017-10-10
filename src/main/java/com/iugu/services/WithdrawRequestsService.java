package com.iugu.services;

import com.iugu.IuguConfiguration;
import com.iugu.exceptions.IuguException;
import com.iugu.responses.WithdrawRequestResponse;
import com.iugu.responses.WithdrawRequestsResponse;

import javax.ws.rs.core.Response;

public class WithdrawRequestsService {

    private IuguConfiguration iugu;
    private final String FIND_URL = IuguConfiguration.url("/withdraw_requests/%s");
    private final String FIND_ALL_URL = IuguConfiguration.url("/withdraw_requests");

    public WithdrawRequestsService(IuguConfiguration iuguConfiguration) {
        this.iugu = iuguConfiguration;
    }

    public WithdrawRequestResponse find(String id) throws IuguException {
        Response response = this.iugu.getNewClient().target(String.format(FIND_URL, id)).request().get();
        int ResponseStatus = response.getStatus();
        String ResponseText = null;

        if (ResponseStatus == 200)
            return response.readEntity(WithdrawRequestResponse.class);

        // Error Happened
        if (response.hasEntity())
            ResponseText = response.readEntity(String.class);

        response.close();

        throw new IuguException("Error finding withdraw request with id: " + id, ResponseStatus, ResponseText);
    }

    public WithdrawRequestsResponse findAll() throws IuguException {
        Response response = this.iugu.getNewClient().target(FIND_ALL_URL).request().get();
        int ResponseStatus = response.getStatus();
        String ResponseText = null;

        if (ResponseStatus == 200)
            return response.readEntity(WithdrawRequestsResponse.class);

        // Error Happened
        if (response.hasEntity())
            ResponseText = response.readEntity(String.class);

        response.close();

        throw new IuguException("Error finding withdraw requests!", ResponseStatus, ResponseText);
    }

}

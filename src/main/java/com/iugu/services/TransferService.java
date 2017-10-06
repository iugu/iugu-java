package com.iugu.services;

import com.iugu.IuguConfiguration;
import com.iugu.exceptions.IuguException;
import com.iugu.model.Transfer;
import com.iugu.responses.TransferResponse;
import com.iugu.responses.TransfersResponse;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class TransferService {

    private IuguConfiguration iugu;
    private final String TRANSFER_URL = IuguConfiguration.url("/transfers");
    private final String FIND_URL = IuguConfiguration.url("/transfers/%s");
    private final String FIND_ALL_URL = IuguConfiguration.url("/transfers");

    public TransferService(IuguConfiguration iuguConfiguration) {
        this.iugu = iuguConfiguration;
    }

    public TransferResponse transfer(Transfer transfer) throws IuguException {
        Response response = this.iugu.getNewClient().target(TRANSFER_URL).request().post(Entity.entity(transfer, MediaType.APPLICATION_JSON));

        int ResponseStatus = response.getStatus();
        String ResponseText = null;

        if (ResponseStatus == 200)
            return response.readEntity(TransferResponse.class);

        // Error Happened
        if (response.hasEntity())
            ResponseText = response.readEntity(String.class);

        response.close();

        throw new IuguException("Error transferring value!", ResponseStatus, ResponseText);
    }

    public TransferResponse find(String id) throws IuguException {
        Response response = this.iugu.getNewClient().target(String.format(FIND_URL, id)).request().get();
        int ResponseStatus = response.getStatus();
        String ResponseText = null;

        if (ResponseStatus == 200)
            return response.readEntity(TransferResponse.class);

        // Error Happened
        if (response.hasEntity())
            ResponseText = response.readEntity(String.class);

        response.close();

        throw new IuguException("Error finding transfer with id: " + id, ResponseStatus, ResponseText);
    }

    public TransfersResponse findAll() throws IuguException {
        Response response = this.iugu.getNewClient().target(FIND_ALL_URL).request().get();
        int ResponseStatus = response.getStatus();
        String ResponseText = null;

        if (ResponseStatus == 200)
            return response.readEntity(TransfersResponse.class);

        // Error Happened
        if (response.hasEntity())
            ResponseText = response.readEntity(String.class);

        response.close();

        throw new IuguException("Error finding transfers!", ResponseStatus, ResponseText);
    }

}

package com.iugu.services;

import com.iugu.IuguConfiguration;
import com.iugu.exceptions.IuguException;
import com.iugu.model.PaymentMethod;
import com.iugu.responses.PaymentMethodResponse;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


public class PaymentMethodService {

	private IuguConfiguration iugu;
	private final String DEFAULT_PAYMENT_URL = IuguConfiguration.url("/customers/%s/payment_methods");
	private final String FIND_URL = IuguConfiguration.url("/customers/%s/payment_methods/%s");
	private final String REMOVE_URL = IuguConfiguration.url("/customers/%s/payment_methods/%s");

	public PaymentMethodService(IuguConfiguration iuguConfiguration) {
		this.iugu = iuguConfiguration;
	}

	public String setDefault(String customerId, PaymentMethod paymentMethod) throws IuguException {
		Response response = this.iugu.getNewClient().target(String.format(DEFAULT_PAYMENT_URL, customerId)).request().post(Entity.entity(paymentMethod, MediaType.APPLICATION_JSON));

		int ResponseStatus = response.getStatus();
		String ResponseText = null;

		if (ResponseStatus == 200)
			return response.readEntity(String.class);

		// Error Happened
		if (response.hasEntity())
			ResponseText = response.readEntity(String.class);

		response.close();

		throw new IuguException("Error set default payment!", ResponseStatus, ResponseText);
	}

	public PaymentMethodResponse find(String customerId, String id) throws IuguException {
		Response response = this.iugu.getNewClient().target(String.format(FIND_URL, customerId, id)).request().get();

		int ResponseStatus = response.getStatus();
		String ResponseText = null;

		if (ResponseStatus == 200)
			return response.readEntity(PaymentMethodResponse.class);

		// Error Happened
		if (response.hasEntity())
			ResponseText = response.readEntity(String.class);

		response.close();

		throw new IuguException("Error finding payment with id: " + id, ResponseStatus, ResponseText);
	}

	public PaymentMethodResponse remove(String customerId, String id) throws IuguException {
		Response response = this.iugu.getNewClient().target(String.format(REMOVE_URL, customerId, id)).request().delete();

		int ResponseStatus = response.getStatus();
		String ResponseText = null;

		if (ResponseStatus == 200)
			return response.readEntity(PaymentMethodResponse.class);

		// Error Happened
		if (response.hasEntity())
			ResponseText = response.readEntity(String.class);

		response.close();

		throw new IuguException("Error removing payment with id: " + id, ResponseStatus, ResponseText);
	}

}

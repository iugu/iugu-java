package com.iugu.services;

import com.iugu.IuguConfiguration;
import com.iugu.exceptions.IuguException;
import com.iugu.model.PaymentMethod;
import com.iugu.model.PaymentToken;
import com.iugu.responses.PaymentTokenResponse;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


public class PaymentMethodService {

	private IuguConfiguration iugu;
	private final String DEFAULT_PAYMENT_URL = IuguConfiguration.url("/customers/%s/payment_methods");

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
}

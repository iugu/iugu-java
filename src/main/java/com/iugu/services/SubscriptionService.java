package com.iugu.services;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.iugu.IuguConfiguration;
import com.iugu.exceptions.IuguException;
import com.iugu.model.Credit;
import com.iugu.model.Subscription;
import com.iugu.responses.SubscriptionResponse;

public class SubscriptionService {

	private IuguConfiguration iugu;
	private final String CREATE_URL = IuguConfiguration.url("/subscriptions");
	private final String FIND_URL = IuguConfiguration.url("/subscriptions/%s");
	private final String CHANGE_URL = IuguConfiguration.url("/subscriptions/%s");
	private final String REMOVE_URL = IuguConfiguration.url("/subscriptions/%s");
	private final String SUSPEND_URL = IuguConfiguration.url("/subscriptions/%s/suspend");
	private final String ACTIVATE_URL = IuguConfiguration.url("/subscriptions/%s/activate");
	private final String CHANGE_SUBSCRIPTION_PLAN_URL = IuguConfiguration.url("/subscriptions/%s/change_plan/%s");
	private final String ADD_CREDITS_URL = IuguConfiguration.url("/subscriptions/%s/add_credits");
	private final String REMOVE_CREDITS_URL = IuguConfiguration.url("/subscriptions/%s/remove_credits");

	public SubscriptionService(IuguConfiguration iuguConfiguration) {
		this.iugu = iuguConfiguration;
	}

	public SubscriptionResponse create(Subscription subscription) throws IuguException {
		Response response = this.iugu.getNewClient().target(CREATE_URL).request().post(Entity.entity(subscription, MediaType.APPLICATION_JSON));

		int ResponseStatus = response.getStatus();
		String ResponseText = null;

		if (ResponseStatus == 200)
			return response.readEntity(SubscriptionResponse.class);

		// Error Happened
		if (response.hasEntity())
			ResponseText = response.readEntity(String.class);

		response.close();

		throw new IuguException("Error creating subscription!", ResponseStatus, ResponseText);
	}

	public SubscriptionResponse find(String id) throws IuguException {
		Response response = this.iugu.getNewClient().target(String.format(FIND_URL, id)).request().get();

		int ResponseStatus = response.getStatus();
		String ResponseText = null;

		if (ResponseStatus == 200)
			return response.readEntity(SubscriptionResponse.class);

		// Error Happened
		if (response.hasEntity())
			ResponseText = response.readEntity(String.class);

		response.close();

		throw new IuguException("Error finding subscription!", ResponseStatus, ResponseText);
	}

	public SubscriptionResponse change(String id, Subscription subscription) throws IuguException {
		Response response = this.iugu.getNewClient().target(String.format(CHANGE_URL, id)).request().put(Entity.entity(subscription, MediaType.APPLICATION_JSON));

		int ResponseStatus = response.getStatus();
		String ResponseText = null;

		if (ResponseStatus == 200)
			return response.readEntity(SubscriptionResponse.class);

		// Error Happened
		if (response.hasEntity())
			ResponseText = response.readEntity(String.class);

		response.close();

		throw new IuguException("Error changing subscription!", ResponseStatus, ResponseText);
	}

	public SubscriptionResponse remove(String id) throws IuguException {
		Response response = this.iugu.getNewClient().target(String.format(REMOVE_URL, id)).request().delete();

		int ResponseStatus = response.getStatus();
		String ResponseText = null;

		if (ResponseStatus == 200)
			return response.readEntity(SubscriptionResponse.class);

		// Error Happened
		if (response.hasEntity())
			ResponseText = response.readEntity(String.class);

		response.close();

		throw new IuguException("Error removing subscription!", ResponseStatus, ResponseText);
	}

	public SubscriptionResponse suspend(String id) throws IuguException {
		Response response = this.iugu.getNewClient().target(String.format(SUSPEND_URL, id)).request().post(null);

		int ResponseStatus = response.getStatus();
		String ResponseText = null;

		if (ResponseStatus == 200)
			return response.readEntity(SubscriptionResponse.class);

		// Error Happened
		if (response.hasEntity())
			ResponseText = response.readEntity(String.class);

		response.close();

		throw new IuguException("Error suspending subscription!", ResponseStatus, ResponseText);
	}

	public SubscriptionResponse activate(String id) throws IuguException {
		Response response = this.iugu.getNewClient().target(String.format(ACTIVATE_URL, id)).request().post(null);

		int ResponseStatus = response.getStatus();
		String ResponseText = null;

		if (ResponseStatus == 200)
			return response.readEntity(SubscriptionResponse.class);

		// Error Happened
		if (response.hasEntity())
			ResponseText = response.readEntity(String.class);

		response.close();

		throw new IuguException("Error activating subscription!", ResponseStatus, ResponseText);
	}

	public SubscriptionResponse changePlan(String id, String planIdentifier) throws IuguException {
		Response response = this.iugu.getNewClient().target(String.format(CHANGE_SUBSCRIPTION_PLAN_URL, id, planIdentifier)).request().post(null);

		int ResponseStatus = response.getStatus();
		String ResponseText = null;

		if (ResponseStatus == 200)
			return response.readEntity(SubscriptionResponse.class);

		// Error Happened
		if (response.hasEntity())
			ResponseText = response.readEntity(String.class);

		response.close();

		throw new IuguException("Error changing subscription plan!", ResponseStatus, ResponseText);
	}

	public SubscriptionResponse addCredits(String id, Credit credit) throws IuguException {
		Response response = this.iugu.getNewClient().target(String.format(ADD_CREDITS_URL, id)).request().post(Entity.entity(credit, MediaType.APPLICATION_JSON));

		int ResponseStatus = response.getStatus();
		String ResponseText = null;

		if (ResponseStatus == 200)
			return response.readEntity(SubscriptionResponse.class);

		// Error Happened
		if (response.hasEntity())
			ResponseText = response.readEntity(String.class);

		response.close();

		throw new IuguException("Error adding credits to subscription!", ResponseStatus, ResponseText);
	}

	public SubscriptionResponse removeCredits(String id, Credit credit) throws IuguException {
		Response response = this.iugu.getNewClient().target(String.format(REMOVE_CREDITS_URL, id)).request().post(Entity.entity(credit, MediaType.APPLICATION_JSON));

		int ResponseStatus = response.getStatus();
		String ResponseText = null;

		if (ResponseStatus == 200)
			return response.readEntity(SubscriptionResponse.class);

		// Error Happened
		if (response.hasEntity())
			ResponseText = response.readEntity(String.class);

		response.close();

		throw new IuguException("Error removing credits from subscription!", ResponseStatus, ResponseText);
	}

	// TODO Listar as assinaturas

}
package com.iugu.services;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.iugu.Iugu;
import com.iugu.model.Credit;
import com.iugu.model.Customer;
import com.iugu.model.Invoice;
import com.iugu.model.Plan;
import com.iugu.model.Subscription;
import com.iugu.responses.CustomerResponse;
import com.iugu.responses.InvoiceResponse;
import com.iugu.responses.SubscriptionResponse;

public class SubscriptionService {

	private final String CREATE_URL = Iugu.url("/subscriptions");
	private final String FIND_URL = Iugu.url("/subscriptions/%s");
	private final String CHANGE_URL = Iugu.url("/subscriptions/%s");
	private final String REMOVE_URL = Iugu.url("/subscriptions/%s");
	private final String SUSPEND_URL = Iugu.url("/subscriptions/%s/suspend");
	private final String ACTIVATE_URL = Iugu.url("/subscriptions/%s/activate");
	private final String CHANGE_SUBSCRIPTION_PLAN_URL = Iugu.url("/subscriptions/%s/change_plan/%s");
	private final String ADD_CREDITS_URL = Iugu.url("/subscriptions/%s/add_credits");
	private final String REMOVE_CREDITS_URL = Iugu.url("/subscriptions/%s/remove_credits");
	
	public SubscriptionResponse create(Subscription subscription) {
		Response response = Iugu.getClient()
				.target(CREATE_URL)
				.request()
				.post(Entity.entity(subscription, MediaType.APPLICATION_JSON));
		
		if(response.getStatus() == 200) {
			return response.readEntity(SubscriptionResponse.class);
		}

		return null; //FIXME Tratar retornos de erro
	}
	
	public SubscriptionResponse find(String id) {
		Response response = Iugu.getClient()
				.target(String.format(FIND_URL, id))
				.request()
				.get();
		
		if(response.getStatus() == 200) {
			return response.readEntity(SubscriptionResponse.class);
		}

		return null; //FIXME Tratar retornos de erro
	}
	
	public SubscriptionResponse change(String id, Subscription subscription) {
		Response response = Iugu.getClient()
				.target(String.format(CHANGE_URL, id))
				.request()
				.put(Entity.entity(subscription, MediaType.APPLICATION_JSON));
		
		if(response.getStatus() == 200) {
			return response.readEntity(SubscriptionResponse.class);
		}

		return null; //FIXME Tratar retornos de erro
	}
	
	public SubscriptionResponse remove(String id) {
		Response response = Iugu.getClient().target(String.format(REMOVE_URL, id))
		 .request()
		 .delete();
		
		if(response.getStatus() == 200) {
			return response.readEntity(SubscriptionResponse.class);
		}

		return null; //FIXME Tratar retornos de erro
	}
	
	public SubscriptionResponse suspend(String id) {
		Response response = Iugu.getClient().target(String.format(SUSPEND_URL, id))
		 .request()
		 .post(null);
		
		if(response.getStatus() == 200) {
			return response.readEntity(SubscriptionResponse.class);
		}

		return null; //FIXME Tratar retornos de erro
	}
	
	public SubscriptionResponse activate(String id) {
		Response response = Iugu.getClient().target(String.format(ACTIVATE_URL, id))
		 .request()
		 .post(null);
		
		if(response.getStatus() == 200) {
			return response.readEntity(SubscriptionResponse.class);
		}

		return null; //FIXME Tratar retornos de erro
	}
	
	public SubscriptionResponse changePlan(String id, String planIdentifier) {
		Response response = Iugu.getClient().target(String.format(CHANGE_SUBSCRIPTION_PLAN_URL, id, planIdentifier))
		 .request()
		 .post(null);
		
		if(response.getStatus() == 200) {
			return response.readEntity(SubscriptionResponse.class);
		}

		return null; //FIXME Tratar retornos de erro
	}
	
	public SubscriptionResponse addCredits(String id, Credit credit) {
		Response response = Iugu.getClient().target(String.format(ADD_CREDITS_URL, id))
		 .request()
		 .post(Entity.entity(credit, MediaType.APPLICATION_JSON));
		
		if(response.getStatus() == 200) {
			return response.readEntity(SubscriptionResponse.class);
		}

		return null; //FIXME Tratar retornos de erro
	}
	
	public SubscriptionResponse removeCredits(String id, Credit credit) {
		Response response = Iugu.getClient().target(String.format(REMOVE_CREDITS_URL, id))
		 .request()
		 .post(Entity.entity(credit, MediaType.APPLICATION_JSON));
		
		if(response.getStatus() == 200) {
			return response.readEntity(SubscriptionResponse.class);
		}

		return null; //FIXME Tratar retornos de erro
	}
	
	//TODO Listar as assinaturas

}
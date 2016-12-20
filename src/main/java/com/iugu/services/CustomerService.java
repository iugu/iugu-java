package com.iugu.services;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.iugu.Iugu;
import com.iugu.exceptions.IuguException;
import com.iugu.model.Customer;
import com.iugu.responses.CustomerResponse;

public class CustomerService {
	private final String CREATE_URL = Iugu.url("/customers");
	private final String FIND_URL = Iugu.url("/customers/%s");
	private final String CHANGE_URL = Iugu.url("/customers/%s");
	private final String REMOVE_URL = Iugu.url("/customers/%s");
	
	public CustomerResponse create(Customer customer) throws IuguException {
		Response response = Iugu.getClient()
								.target(CREATE_URL)
								.request()
								.post(Entity.entity(customer, MediaType.APPLICATION_JSON));
		
		int ResponseStatus = response.getStatus();
		String ResponseText = null;
		
		if(ResponseStatus == 200)
			return response.readEntity(CustomerResponse.class);
		
		// Error Happened
		if(response.hasEntity())
			ResponseText = response.readEntity(String.class);
			
		response.close();
		
		throw new IuguException("Error creating customer!", ResponseStatus, ResponseText);
	}
	
	public CustomerResponse find(String id) throws IuguException {
		Response response = Iugu.getClient()
								.target(String.format(FIND_URL, id))
								.request()
								.get();
		
		int ResponseStatus = response.getStatus();
		String ResponseText = null;
		
		if(ResponseStatus == 200)
			return response.readEntity(CustomerResponse.class);
		
		// Error Happened
		if(response.hasEntity())
			ResponseText = response.readEntity(String.class);
			
		response.close();
		
		throw new IuguException("Error finding customer!", ResponseStatus, ResponseText);
	}
	
	public CustomerResponse change(String id, Customer customer) throws IuguException {
		Response response = Iugu.getClient()
								.target(String.format(CHANGE_URL, id))
								.request()
								.put(Entity.entity(customer, MediaType.APPLICATION_JSON));
		
		int ResponseStatus = response.getStatus();
		String ResponseText = null;
		
		if(ResponseStatus == 200)
			return response.readEntity(CustomerResponse.class);

		// Error Happened
		if(response.hasEntity())
			ResponseText = response.readEntity(String.class);
			
		response.close();
		
		throw new IuguException("Error changing customer!", ResponseStatus, ResponseText);
	}
	
	public CustomerResponse remove(String id) throws IuguException {
		Response response = Iugu.getClient().target(String.format(REMOVE_URL, id))
										    .request()
										    .delete();
		
		int ResponseStatus = response.getStatus();
		String ResponseText = null;
		
		if(ResponseStatus == 200)
			return response.readEntity(CustomerResponse.class);

		// Error Happened
		if(response.hasEntity())
			ResponseText = response.readEntity(String.class);
			
		response.close();
		
		throw new IuguException("Error removing customer!", ResponseStatus, ResponseText);
	}
	
	//TODO Listar os clientes
}
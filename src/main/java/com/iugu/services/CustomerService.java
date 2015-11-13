package com.iugu.services;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.iugu.Iugu;
import com.iugu.model.Customer;
import com.iugu.model.Invoice;
import com.iugu.responses.CustomerResponse;
import com.iugu.responses.InvoiceResponse;

public class CustomerService {

	private final String CREATE_URL = Iugu.url("/customers");
	private final String FIND_URL = Iugu.url("/customers/%s");
	private final String CHANGE_URL = Iugu.url("/customers/%s");
	private final String REMOVE_URL = Iugu.url("/customers/%s");
	
	public CustomerResponse create(Customer customer) {
		Response response = Iugu.getClient()
				.target(CREATE_URL)
				.request()
				.post(Entity.entity(customer, MediaType.APPLICATION_JSON));
		
		if(response.getStatus() == 200) {
			return response.readEntity(CustomerResponse.class);
		}

		return null; //FIXME Tratar retornos de erro
	}
	
	public CustomerResponse find(String id) {
		Response response = Iugu.getClient()
				.target(String.format(FIND_URL, id))
				.request()
				.get();
		
		if(response.getStatus() == 200) {
			return response.readEntity(CustomerResponse.class);
		}

		return null; //FIXME Tratar retornos de erro
	}
	
	public CustomerResponse change(String id, Customer customer) {
		Response response = Iugu.getClient()
				.target(String.format(CHANGE_URL, id))
				.request()
				.put(Entity.entity(customer, MediaType.APPLICATION_JSON));
		
		if(response.getStatus() == 200) {
			return response.readEntity(CustomerResponse.class);
		}

		return null; //FIXME Tratar retornos de erro
	}
	
	public CustomerResponse remove(String id) {
		Response response = Iugu.getClient().target(String.format(REMOVE_URL, id))
		 .request()
		 .delete();
		
		if(response.getStatus() == 200) {
			return response.readEntity(CustomerResponse.class);
		}

		return null; //FIXME Tratar retornos de erro
	}
	
	//TODO Listar os clientes
}
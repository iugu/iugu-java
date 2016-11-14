package com.iugu.services;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.iugu.Iugu;
import com.iugu.exceptions.IuguException;
import com.iugu.model.Invoice;
import com.iugu.responses.InvoiceResponse;
import com.iugu.utils.ConvertionUtils;

public class InvoiceService {

	private final String CREATE_URL = Iugu.url("/invoices");
	private final String FIND_URL = Iugu.url("/invoices/%s");
	private final String DUPLICATE_URL = Iugu.url("/invoices/%s/duplicate");
	private final String REMOVE_URL = Iugu.url("/invoices/%s");
	private final String CANCEL_URL = Iugu.url("/invoices/%s/cancel");
	private final String REFUND_URL = Iugu.url("/invoices/%s/refund");

	public InvoiceResponse create(Invoice invoice) throws IuguException {
		Response response = Iugu.getClient().target(CREATE_URL).request()
				.post(Entity.entity(invoice, MediaType.APPLICATION_JSON));

		if (response.getStatus() == 200) {
			return response.readEntity(InvoiceResponse.class);
		}

		// Error Happened
		int ResponseStatus = response.getStatus();
		String ResponseText = null;
		
		if(response.hasEntity()) {
			ResponseText = response.readEntity(String.class);
		}
		
		response.close();
		
		throw new IuguException("Error creating invoice!", ResponseStatus, ResponseText);
	}

	public InvoiceResponse find(String id) throws IuguException {
		Response response = Iugu.getClient().target(String.format(FIND_URL, id)).request().get();

		if (response.getStatus() == 200) {
			return response.readEntity(InvoiceResponse.class);
		}

		// Error Happened
		int ResponseStatus = response.getStatus();
		String ResponseText = null;
		
		if(response.hasEntity()) {
			ResponseText = response.readEntity(String.class);
		}
		
		response.close();
		
		throw new IuguException("Error finding invoice with id: " + id, ResponseStatus, ResponseText);
	}

	public InvoiceResponse duplicate(String id, Date date) throws IuguException {
		SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
		Form form = new Form();

		form.param("due_date", sm.format(date));

		Response response = Iugu.getClient().target(String.format(DUPLICATE_URL, id)).request()
				.post(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED_TYPE));

		if (response.getStatus() == 200) {
			return response.readEntity(InvoiceResponse.class);
		}
		
		// Error Happened
		int ResponseStatus = response.getStatus();
		String ResponseText = null;
		
		if(response.hasEntity()) {
			ResponseText = response.readEntity(String.class);
		}
		
		response.close();
		
		throw new IuguException("Error duplicating invoice with id: " + id, ResponseStatus, ResponseText);
	}
	public InvoiceResponse duplicate(String id, Date date, boolean ignoreCanceledEmail, boolean currentFinesOption) throws IuguException {
		SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
		Form form = new Form();

		form.param("due_date", sm.format(date));
		form.param("ignore_canceled_email", ConvertionUtils.booleanToString(ignoreCanceledEmail));
		form.param("current_fines_option", ConvertionUtils.booleanToString(currentFinesOption));

		Response response = Iugu.getClient().target(String.format(DUPLICATE_URL, id)).request()
				.post(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED_TYPE));

		if (response.getStatus() == 200) {
			return response.readEntity(InvoiceResponse.class);
		}
		
		// Error Happened
		int ResponseStatus = response.getStatus();
		String ResponseText = null;
		
		if(response.hasEntity()) {
			ResponseText = response.readEntity(String.class);
		}
		
		response.close();
		
		throw new IuguException("Error duplicating invoice with id: " + id, ResponseStatus, ResponseText);
	}

	public InvoiceResponse remove(String id) throws IuguException {
		Response response = Iugu.getClient().target(String.format(REMOVE_URL, id)).request().delete();

		if (response.getStatus() == 200) {
			return response.readEntity(InvoiceResponse.class);
		}

		// Error Happened
		int ResponseStatus = response.getStatus();
		String ResponseText = null;
		
		if(response.hasEntity()) {
			ResponseText = response.readEntity(String.class);
		}
		
		response.close();
		
		throw new IuguException("Error removing invoice with id: " + id, ResponseStatus, ResponseText);
	}

	public InvoiceResponse cancel(String id) {
		Response response = Iugu.getClient().target(String.format(CANCEL_URL, id)).request().put(null);
		
		InvoiceResponse invoiceResponse = response.readEntity(InvoiceResponse.class);
		invoiceResponse.setResponse(response);
		response.close();
		return invoiceResponse;
	}

	public InvoiceResponse refund(String id) throws IuguException {
		Response response = Iugu.getClient().target(String.format(REFUND_URL, id)).request().post(null);

		if (response.getStatus() == 200) {
			return response.readEntity(InvoiceResponse.class);
		}
		
		// Error Happened
		int ResponseStatus = response.getStatus();
		String ResponseText = null;
		
		if(response.hasEntity()) {
			ResponseText = response.readEntity(String.class);
		}
		
		response.close();
		
		throw new IuguException("Error refunding invoice with id: " + id, ResponseStatus, ResponseText);
	}

	// TODO Listar as faturas
}
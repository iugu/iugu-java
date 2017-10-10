package com.iugu.services;

import com.iugu.IuguConfiguration;
import com.iugu.exceptions.IuguException;
import com.iugu.model.Account;
import com.iugu.model.RequestVerification;
import com.iugu.responses.AccountConfigurationResponse;
import com.iugu.responses.ExtractInvoiceResponse;
import com.iugu.responses.AccountVerificationResponse;
import com.iugu.responses.TransactionsResponse;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Objects;

public class AccountService {

    private IuguConfiguration iugu;
    private final String FIND_TRANSACTIONS_URL = IuguConfiguration.url("/accounts/financial");
    private final String FIND_INVOICES_URL = IuguConfiguration.url("/accounts/invoices");
    private final String REQUEST_VERIFICATION_URL = IuguConfiguration.url("/accounts/%s/request_verification");
    private final String ACCOUNT_CONFIGURATION_URL = IuguConfiguration.url("/accounts/configuration");

    public AccountService(IuguConfiguration iuguConfiguration) {
        this.iugu = iuguConfiguration;
    }

    public TransactionsResponse findTransactions(String year, String month, String day, Integer limit, Integer start) throws IuguException {
        String end_point = "";
        if(year != null && !Objects.equals(year, "")){
            end_point += "?year="+year;
            if(month != null && !Objects.equals(month, "")){
                end_point += "&month="+month;
                if(day != null && !Objects.equals(day, "")){
                    end_point += "&day="+day;
                }
            }
        }
        if(limit != null){
            if(Objects.equals(end_point, "")){
                end_point += "?limit="+limit;
            }else{
                end_point += "&limit="+limit;
            }
        }
        if(start != null){
            if(Objects.equals(end_point, "")){
                end_point += "?start="+start;
            }else{
                end_point += "&start="+start;
            }
        }
        end_point = FIND_TRANSACTIONS_URL + end_point;
        Response response = this.iugu.getNewClient().target(end_point).request().get();

        int ResponseStatus = response.getStatus();
        String ResponseText = null;

        if (ResponseStatus == 200)
            return response.readEntity(TransactionsResponse.class);

        // Error Happened
        if (response.hasEntity())
            ResponseText = response.readEntity(String.class);

        response.close();

        throw new IuguException("Error finding transactions! ", ResponseStatus, ResponseText);
    }

    public List<ExtractInvoiceResponse> findInvoices(String year, String month, String status, Integer limit) throws IuguException {
        String end_point = "";
        if(year != null && !Objects.equals(year, "")){
            end_point += "?year="+year;
            if(month != null && !Objects.equals(month, "")){
                end_point += "&month="+month;
            }
        }
        if(status != null && !Objects.equals(status, "")){
            if(Objects.equals(end_point, "")){
                end_point += "?status="+status;
            }else{
                end_point += "&status="+status;
            }
        }
        if(limit != null){
            if(Objects.equals(end_point, "")){
                end_point += "?limit="+limit;
            }else{
                end_point += "&limit="+limit;
            }
        }
        end_point = FIND_INVOICES_URL + end_point;
        Response response = this.iugu.getNewClient().target(end_point).request().get();

        int ResponseStatus = response.getStatus();
        String ResponseText = null;

        if (ResponseStatus == 200)
            return response.readEntity(new GenericType<List<ExtractInvoiceResponse>>(){});

        // Error Happened
        if (response.hasEntity())
            ResponseText = response.readEntity(String.class);

        response.close();

        throw new IuguException("Error finding invoices! ", ResponseStatus, ResponseText);
    }

    public AccountVerificationResponse requestVerification(RequestVerification requestVerification) throws IuguException {
        Response response = this.iugu.getNewClient().target(REQUEST_VERIFICATION_URL).request().post(Entity.entity(requestVerification, MediaType.APPLICATION_JSON));
        int ResponseStatus = response.getStatus();
        String ResponseText = null;

        if (ResponseStatus == 200)
            return response.readEntity(AccountVerificationResponse.class);

        // Error Happened
        if (response.hasEntity())
            ResponseText = response.readEntity(String.class);

        response.close();

        throw new IuguException("Error on request verification!", ResponseStatus, ResponseText);
    }

    public AccountConfigurationResponse configuration(Account account) throws IuguException {
        Response response = this.iugu.getNewClient().target(ACCOUNT_CONFIGURATION_URL).request().post(Entity.entity(account, MediaType.APPLICATION_JSON));
        int ResponseStatus = response.getStatus();
        String ResponseText = null;

        if (ResponseStatus == 200)
            return response.readEntity(AccountConfigurationResponse.class);

        // Error Happened
        if (response.hasEntity())
            ResponseText = response.readEntity(String.class);

        response.close();

        throw new IuguException("Error configuring account!", ResponseStatus, ResponseText);
    }

}

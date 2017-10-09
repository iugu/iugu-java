package com.iugu.services;

import com.iugu.IuguConfiguration;
import com.iugu.exceptions.IuguException;
import com.iugu.responses.TransactionsResponse;

import javax.ws.rs.core.Response;
import java.util.Objects;

public class FinancialService {

    private IuguConfiguration iugu;
    private final String FIND_URL = IuguConfiguration.url("/accounts/financial");

    public FinancialService(IuguConfiguration iuguConfiguration) {
        this.iugu = iuguConfiguration;
    }

    public TransactionsResponse find(String year, String month, String day, Integer limit, Integer start) throws IuguException {
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
        end_point = FIND_URL + end_point;
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
}

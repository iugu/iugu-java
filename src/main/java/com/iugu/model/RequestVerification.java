package com.iugu.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestVerification {

    private String id;
    @JsonProperty("automatic_validation")
    private Boolean automaticValidation;
    private DataRequestVerification data;

    public RequestVerification(String id, DataRequestVerification data) {
        this.id = id;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getAutomaticValidation() {
        return automaticValidation;
    }

    public void setAutomaticValidation(Boolean automaticValidation) {
        this.automaticValidation = automaticValidation;
    }

    public DataRequestVerification getData() {
        return data;
    }

    public void setData(DataRequestVerification data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RequestVerification{" +
                "id='" + id + '\'' +
                ", automaticValidation=" + automaticValidation +
                ", data=" + data +
                '}';
    }
}

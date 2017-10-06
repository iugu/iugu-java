package com.iugu.responses;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TransfersResponse {

    @JsonProperty("sent")
    private List<TransferResponse> sent;
    @JsonProperty("received")
    private List<TransferResponse> received;

    public List<TransferResponse> getSent() {
        return sent;
    }

    public void setSent(List<TransferResponse> sent) {
        this.sent = sent;
    }

    public List<TransferResponse> getReceived() {
        return received;
    }

    public void setReceived(List<TransferResponse> received) {
        this.received = received;
    }

    @Override
    public String toString() {
        return "TransfersResponse{" +
                "sent=" + sent +
                ", received=" + received +
                '}';
    }
}

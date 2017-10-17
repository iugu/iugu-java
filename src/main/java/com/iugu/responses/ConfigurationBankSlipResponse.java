package com.iugu.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConfigurationBankSlipResponse {

    private Boolean active;
    @JsonProperty("extra_due")
    private String extraDue;
    @JsonProperty("reprint_extra_due")
    private String reprintExtraDue;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getExtraDue() {
        return extraDue;
    }

    public void setExtraDue(String extraDue) {
        this.extraDue = extraDue;
    }

    public String getReprintExtraDue() {
        return reprintExtraDue;
    }

    public void setReprintExtraDue(String reprintExtraDue) {
        this.reprintExtraDue = reprintExtraDue;
    }

    @Override
    public String toString() {
        return "ConfigurationBankSlipResponse{" +
                "active=" + active +
                ", extraDue='" + extraDue + '\'' +
                ", reprintExtraDue='" + reprintExtraDue + '\'' +
                '}';
    }
}

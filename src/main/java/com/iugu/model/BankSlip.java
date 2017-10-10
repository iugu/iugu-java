package com.iugu.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class BankSlip {

    private Boolean active;
    @JsonProperty("extra_due")
    private Integer extraDue;
    @JsonProperty("reprint_extra_due")
    private Integer reprintExtraDue;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getExtraDue() {
        return extraDue;
    }

    public void setExtraDue(Integer extraDue) {
        this.extraDue = extraDue;
    }

    public Integer getReprintExtraDue() {
        return reprintExtraDue;
    }

    public void setReprintExtraDue(Integer reprintExtraDue) {
        this.reprintExtraDue = reprintExtraDue;
    }
}

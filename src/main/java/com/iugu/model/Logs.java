package com.iugu.model;

public class Logs {

    public Logs(String description, String notes) {
        this.description = description;
        this.notes = notes;
    }

    private String description;

    private String notes;

    private Boolean destroy;

    public Boolean getDestroy() {
        return destroy;
    }

    public void setDestroy(Boolean destroy) {
        this.destroy = destroy;
    }

    public String getDescription() {
        return description;
    }

    public String getNotes() {
        return notes;
    }

}

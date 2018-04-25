package com.iugu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Feature {

    private String name;
    private String identifier;
    private int value;
    @JsonProperty("_destroy")
    private boolean _destroy;

    public Feature() {
    }

    public Feature(String name, String identifier, int value) {
        this.name = name;
        this.identifier = identifier;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public int getValue() {
        return value;
    }

    public boolean isDestroy() {
        return _destroy;
    }

    public void setDestroy(boolean _destroy) {
        this._destroy = _destroy;
    }

}

package com.iugu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Receiver {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Receiver{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

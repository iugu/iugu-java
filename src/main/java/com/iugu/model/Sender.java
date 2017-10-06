package com.iugu.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class Sender {

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
        return "Sender{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

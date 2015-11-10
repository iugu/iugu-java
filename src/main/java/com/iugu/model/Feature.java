package com.iugu.model;

public class Feature {
	
	private String name;
	
	private String identifier;
	
	private int value;
	
	public Feature(String name, String identifier, int value){
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

}

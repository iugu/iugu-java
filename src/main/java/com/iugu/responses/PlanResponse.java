package com.iugu.responses;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlanResponse {

	private String id;
	
	private String name;
	
	private String identifier;
	
	private String interval;
	
	@JsonProperty("interval_type")
	private String intervalType;
	
	private List<PriceResponse> prices;
	
	private List<FeatureResponse> features;

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

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getInterval() {
		return interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
	}

	public String getIntervalType() {
		return intervalType;
	}

	public void setIntervalType(String intervalType) {
		this.intervalType = intervalType;
	}

	public List<PriceResponse> getPrices() {
		return prices;
	}

	public void setPrices(List<PriceResponse> prices) {
		this.prices = prices;
	}

	public List<FeatureResponse> getFeatures() {
		return features;
	}

	public void setFeatures(List<FeatureResponse> features) {
		this.features = features;
	}
	
}
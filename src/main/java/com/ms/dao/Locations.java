package com.ms.dao;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Embeddable
public class Locations {

	public Locations() {
	}

	private String primaryLocation;
	@ElementCollection
	private List<String> secondaryLocations;

	public List<String> getSecondaryLocations() {
		return secondaryLocations;
	}

	public void setSecondaryLocations(List<String> secondaryLocations) {
		this.secondaryLocations = secondaryLocations;
	}

	public String getPrimaryLocation() {
		return primaryLocation;
	}

	public void setPrimaryLocation(String primaryLocation) {
		this.primaryLocation = primaryLocation;
	}

}

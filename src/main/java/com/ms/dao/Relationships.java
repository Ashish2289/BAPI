package com.ms.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Embeddable
public class Relationships {

	public Relationships() {
	}

	@ElementCollection(targetClass=HashMap.class)
	List<Map<String, String>> relationships;

	public List<Map<String, String>> getRelationships() {
		return relationships;
	}

	public void setRelationships(List<Map<String, String>> relationships) {

		this.relationships = relationships;
	}
}

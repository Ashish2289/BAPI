package com.ms.dao;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Classification {

	public Classification() {
	}

	private String type;
	private String businessCriticality;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBusinessCriticality() {
		return businessCriticality;
	}

	public void setBusinessCriticality(String businessCriticality) {
		this.businessCriticality = businessCriticality;
	}

}

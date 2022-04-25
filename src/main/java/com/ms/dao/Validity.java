package com.ms.dao;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Embeddable
public class Validity {

	public Validity() {
	}

	@Embedded
	private Dates dates;

	public Dates getDates() {
		return dates;
	}

	public void setDates(Dates dates) {
		this.dates = dates;
	}
}

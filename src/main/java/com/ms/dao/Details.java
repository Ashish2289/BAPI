package com.ms.dao;

import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Embeddable
public class Details {

	public Details() {
	}

	private String approvalRequired;
	private String uploadType;
	private long id;
	// private Classification classification;
	@ElementCollection
	Map<String, String> classification;
	@ElementCollection
	Map<String, String> ipBasedHostAttributes;
	// private IpBasedHostAttributes ipBasedHostAttributes;
	@Embedded
	private Locations locations;
	@Embedded
	private Validity validity;

	public Map<String, String> getIpBasedHostAttributes() {
		return ipBasedHostAttributes;
	}

	public void setIpBasedHostAttributes(Map<String, String> ipBasedHostAttributes) {
		this.ipBasedHostAttributes = ipBasedHostAttributes;
	}

	public Map<String, String> getClassification() {
		return classification;
	}

	public void setClassification(Map<String, String> classification) {
		this.classification = classification;
	}

	public String getApprovalRequired() {
		return approvalRequired;
	}

	public void setApprovalRequired(String approvalRequired) {
		this.approvalRequired = approvalRequired;
	}

	public String getUploadType() {
		return uploadType;
	}

	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
	}

	public long getId() {
		return id;
	}

	/*
	 * public IpBasedHostAttributes getIpBasedHostAttributes() { return
	 * ipBasedHostAttributes; }
	 * 
	 * public void setIpBasedHostAttributes(IpBasedHostAttributes
	 * ipBasedHostAttributes) { this.ipBasedHostAttributes = ipBasedHostAttributes;
	 * }
	 * 
	 */ public Locations getLocations() {
		return locations;
	}

	public void setLocations(Locations locations) {
		this.locations = locations;
	}

	public Validity getValidity() {
		return validity;
	}

	public void setValidity(Validity validity) {
		this.validity = validity;
	}

	public void setId(long id) {
		this.id = id;
	}
	/*
	 * public Classification getClassification() { return classification; }
	 * 
	 * public void setClassification(Classification classification) {
	 * this.classification = classification; }
	 * 
	 */}

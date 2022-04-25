package com.ms.dao;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "asset")
public class AssetContainer {
	public AssetContainer(){
	}
	@EmbeddedId
	public Common common;
	@Embedded
	public Details details;
	@Embedded
	public Relationships relationships;
	
	public Common getCommon() {
		return common;
	}
	public void setCommon(Common common) {
		this.common = common;
	}
	public Details getDetails() {
		return details;
	}
	public void setDetails(Details details) {
		this.details = details;
	}
	public Relationships getRelationships() {
		return relationships;
	}
	public void setRelationships(Relationships relationships) {
		this.relationships = relationships;
	}
	
	
}
	
	

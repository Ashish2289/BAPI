
package com.ms.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.ms.dao.AssetContainer;
import com.ms.dao.Common;
import com.ms.dao.Dates;
import com.ms.dao.Details;
import com.ms.dao.Locations;
import com.ms.dao.Relationships;
import com.ms.dao.Validity;

public class AssetBuilder {

    private static final Logger logger = LogManager.getLogger(AssetBuilder.class);

	
	public static String build() {
		Common common = new Common();
		common.setAction("A");
		common.setSource("S");
		common.setTaskId(1);
		common.setTransactionId(1);
		
		//Map<String,Map<String, String>> classificationMap = new HashMap<>();
		
		Map<String,String> classification = new HashMap<>();
		
		classification.put("type","Information");
		classification.put("business_criticality","Medium");
		
		//classificationMap.put("classification", classificationAttrMap);
		
		/*Classification classification = new Classification();
		classification.setBusinessCriticality("Medium");
		classification.setType("Information");*/
		
		
		//Map<String,Map<String, String>> ipBasedHostMap = new HashMap<>();
		
		Map<String,String> ipBasedHostAttributes = new HashMap<>();
		
		ipBasedHostAttributes.put("serial_no","123");
		ipBasedHostAttributes.put("ipv6_address","111.111.111.111");
		
		//ipBasedHostMap.put("ip_based_host_attributes", ipBasedHostAttrMap);
		

		/*
		 * IpBasedHostAttributes ipBasedHostAttributes = new IpBasedHostAttributes();
		 * ipBasedHostAttributes.setSerialNo(1);
		 * ipBasedHostAttributes.setIpv6Address("111.111.111.111");
		 */ 
		List<String> secondaryLocations = new ArrayList<>();

		secondaryLocations.add("A");
		secondaryLocations.add("B");

		Locations locations = new Locations();
		locations.setPrimaryLocation("");

		locations.setSecondaryLocations(secondaryLocations);

		Dates dates = new Dates();
		dates.setValidFrom("23-4");
		dates.setValidUntil("23-4");

		Validity validity = new Validity();
		validity.setDates(dates);

		Details details = new Details();
		details.setApprovalRequired("yes");
		details.setUploadType("New");
		details.setId(1);
		details.setClassification(classification);
		details.setIpBasedHostAttributes(ipBasedHostAttributes);
		details.setLocations(locations);
		details.setValidity(validity);

		Map<String, String> relationshipMap = new HashMap<>();
		relationshipMap.put("relationship_instance_id", "A");
		relationshipMap.put("comments", "testcomments");

		List<Map<String, String>> relationshipList = new ArrayList<Map<String, String>>();
		relationshipList.add(relationshipMap);

		Relationships relationships = new Relationships();
		relationships.setRelationships(relationshipList);

		AssetContainer assetContainer = new AssetContainer();
		assetContainer.setCommon(common);
		assetContainer.setDetails(details);
		assetContainer.setRelationships(relationships);


		ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = null;
		try {
			json = objectWriter.writeValueAsString(assetContainer);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			// TODO use logger, there should be no printstacktrace and sysos in your code,
			// check dependency for log4j in springboot
		}

		//System.out.println(json);
		logger.info("comment {}", json);
		return json;

	}

}

package com.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ms.dao.AssetContainer;
import com.ms.service.AssetService;
import com.ms.test.AssetBuilder;

@RestController
public class AssetController {
	
	@Autowired
	AssetService assetService;
	

	
	@RequestMapping("/asset")
	public String getAssetContainer() {
		return AssetBuilder.build();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/asset")
	public String addAssetContainer(@RequestBody AssetContainer assetContainer) {
		assetService.save(assetContainer);  

		return "Asset created";
	}

}

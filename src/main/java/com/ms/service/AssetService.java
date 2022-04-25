package com.ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.dao.AssetContainer;
import com.ms.repository.AssetRepository;

@Service
public class AssetService {

	@Autowired  
	AssetRepository assetRepository;  
	
	public void save(AssetContainer assetContainer) {
		assetRepository.save(assetContainer);  
	}

}

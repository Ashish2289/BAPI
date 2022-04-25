package com.ms.repository;

import org.springframework.data.repository.CrudRepository;

import com.ms.dao.AssetContainer;
import com.ms.dao.Common;

public interface AssetRepository extends CrudRepository<AssetContainer, Common>{


}

package com.JavaBackEnd.MyProject.Repository.Custom;

import java.util.List;

import com.JavaBackEnd.MyProject.DTO.BuildingRequestDTO;
import com.JavaBackEnd.MyProject.Entity.BuildingEntity;

public interface BuildingRepositoryCustom {
	public List<BuildingEntity> getBuildingEntities(BuildingRequestDTO buildingRequestDTO);
}

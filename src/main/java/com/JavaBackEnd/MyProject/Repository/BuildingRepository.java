package com.JavaBackEnd.MyProject.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.JavaBackEnd.MyProject.DTO.BuildingRequestDTO;
import com.JavaBackEnd.MyProject.Entity.BuildingEntity;

public interface BuildingRepository {
	public List<BuildingEntity> getBuildingEntities(BuildingRequestDTO buildingRequestDTO);
}

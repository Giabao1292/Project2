package com.JavaBackEnd.MyProject.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JavaBackEnd.MyProject.DTO.BuildingRequestDTO;
import com.JavaBackEnd.MyProject.Entity.BuildingEntity;
import com.JavaBackEnd.MyProject.Repository.Custom.BuildingRepositoryCustom;

public interface BuildingRepository extends JpaRepository<BuildingEntity, Long>, BuildingRepositoryCustom {
	public List<BuildingEntity> getBuildingEntities(BuildingRequestDTO buildingRequestDTO);
}

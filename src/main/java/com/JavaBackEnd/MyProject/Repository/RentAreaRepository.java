package com.JavaBackEnd.MyProject.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JavaBackEnd.MyProject.DTO.BuildingRequestDTO;
import com.JavaBackEnd.MyProject.Entity.RentAreaEntity;
import com.JavaBackEnd.MyProject.Repository.Custom.RentAreaRepositoryCustom;

public interface RentAreaRepository extends JpaRepository<RentAreaEntity, Long>, RentAreaRepositoryCustom {
	public String filterAreaList(List<RentAreaEntity> areaList, BuildingRequestDTO buildingRequestDTO);
}

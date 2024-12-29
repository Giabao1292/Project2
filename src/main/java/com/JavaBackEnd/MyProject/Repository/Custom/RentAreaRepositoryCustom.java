package com.JavaBackEnd.MyProject.Repository.Custom;

import java.util.List;

import com.JavaBackEnd.MyProject.DTO.BuildingRequestDTO;
import com.JavaBackEnd.MyProject.Entity.RentAreaEntity;

public interface RentAreaRepositoryCustom {
	public String filterAreaList(List<RentAreaEntity> areaList, BuildingRequestDTO buildingRequestDTO);
}

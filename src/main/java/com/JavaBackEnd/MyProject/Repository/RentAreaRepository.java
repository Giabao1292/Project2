package com.JavaBackEnd.MyProject.Repository;

import java.util.List;

import com.JavaBackEnd.MyProject.DTO.BuildingRequestDTO;

public interface RentAreaRepository {
	public List<String> getAreaById(Long buildingId, BuildingRequestDTO buildingRequestDTO);
}

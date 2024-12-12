package com.JavaBackEnd.MyProject.Service;

import java.util.List;

import com.JavaBackEnd.MyProject.DTO.BuildingRequestDTO;
import com.JavaBackEnd.MyProject.DTO.BuildingResponseDTO;

public interface BuildingService {
	public List<BuildingResponseDTO> findBuilding(BuildingRequestDTO buildingRequestDTO);
}

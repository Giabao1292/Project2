package com.JavaBackEnd.MyProject.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JavaBackEnd.MyProject.DTO.BuildingRequestDTO;
import com.JavaBackEnd.MyProject.DTO.BuildingResponseDTO;
import com.JavaBackEnd.MyProject.Entity.BuildingEntity;
import com.JavaBackEnd.MyProject.Repository.BuildingRepository;
import com.JavaBackEnd.MyProject.Repository.RentAreaRepository;
import com.JavaBackEnd.MyProject.Service.BuildingService;
import com.JavaBackEnd.MyProject.Util.ModelMapperConvert;

@Service
public class BuildingServiceImpl implements BuildingService {
	@Autowired
	private BuildingRepository buildingRepository;

	@Autowired
	private RentAreaRepository rentAreaRepository;

	public List<BuildingResponseDTO> findBuilding(BuildingRequestDTO buildingRequestDTO) {
		List<BuildingResponseDTO> buildingResponseDTOs = new ArrayList<BuildingResponseDTO>();
		List<BuildingEntity> buildingEntities = buildingRepository.getBuildingEntities(buildingRequestDTO);
		for (BuildingEntity buildingEntity : buildingEntities) {
			BuildingResponseDTO buildingResponseDTO = ModelMapperConvert.toBuildingResponseDTO(buildingEntity);
			buildingResponseDTO.setRentArea(
					rentAreaRepository.filterAreaList(buildingEntity.getRentAreaEntities(), buildingRequestDTO));
			buildingResponseDTO.setAddress(buildingEntity.getStreet() + ", " + buildingEntity.getWard() + ", "
					+ buildingEntity.getDistrict().getName());
			buildingResponseDTOs.add(buildingResponseDTO);
		}
		return buildingResponseDTOs;
	}

}

package com.JavaBackEnd.MyProject.Util;

import java.util.Map;

import org.modelmapper.ModelMapper;

import com.JavaBackEnd.MyProject.DTO.BuildingResponseDTO;
import com.JavaBackEnd.MyProject.Entity.BuildingEntity;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ModelMapperConvert {
	@SuppressWarnings("unchecked")
	public static Map<String, Object> convertToMap(Object bean) {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.convertValue(bean, Map.class);
	}

	public static BuildingResponseDTO toBuildingResponseDTO(BuildingEntity buildingEntity) {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(buildingEntity, BuildingResponseDTO.class);
	}
}

package com.JavaBackEnd.MyProject.Repository.Custom.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.JavaBackEnd.MyProject.DTO.BuildingRequestDTO;
import com.JavaBackEnd.MyProject.Entity.RentAreaEntity;
import com.JavaBackEnd.MyProject.Repository.Custom.RentAreaRepositoryCustom;

@Repository
public class RentAreaRepositoryImpl implements RentAreaRepositoryCustom {
	@Override
	public String filterAreaList(List<RentAreaEntity> areaList, BuildingRequestDTO buildingRequestDTO) {
		List<String> filterAreaList = new ArrayList<String>();
		for (RentAreaEntity areaValue : areaList) {
			Long areaFrom = buildingRequestDTO.getAreaFrom() != null ? buildingRequestDTO.getAreaFrom() : 0,
					areaTo = buildingRequestDTO.getAreaTo() != null ? buildingRequestDTO.getAreaTo() : Long.MAX_VALUE;
			if (areaValue.getValue() >= areaFrom && areaValue.getValue() <= areaTo) {
				filterAreaList.add(Long.toString(areaValue.getValue()));
			}
		}
		return filterAreaList.stream().collect(Collectors.joining(","));
	}
}

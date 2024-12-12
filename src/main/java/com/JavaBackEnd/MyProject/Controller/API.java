package com.JavaBackEnd.MyProject.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.JavaBackEnd.MyProject.DTO.BuildingRequestDTO;
import com.JavaBackEnd.MyProject.DTO.BuildingResponseDTO;
import com.JavaBackEnd.MyProject.Service.BuildingService;

@RestController
public class API {
	@Autowired
	private BuildingService buildingService;

	@GetMapping("/test")
	public String Test() {
		return "Hello";
	}

	@GetMapping("/api/building")
	public List<BuildingResponseDTO> GetBuildingDTO(@ModelAttribute BuildingRequestDTO buildingRequestDTO) {
		List<BuildingResponseDTO> listBuildingResponseDTOs = buildingService.findBuilding(buildingRequestDTO);
		return listBuildingResponseDTOs;
	}
}

package com.JavaBackEnd.MyProject.DTO;

import java.util.ArrayList;
import java.util.List;

public class BuildingRequestDTO {
	private String name, street, ward, direction, level, managerName, managerPhoneNumber;
	private Long floorArea, districtId, numberOfBasement, staffId, areaFrom, areaTo, rentPriceFrom, rentPriceTo;
	private List<String> rentType = new ArrayList<String>();

	public BuildingRequestDTO() {
	}

	public BuildingRequestDTO(String name, String street, String ward, String direction, String level,
			String managerName, String managerPhoneNumber, Long floorArea, Long districtId, Long numberOfBasement,
			Long staffId, Long areaFrom, Long areaTo, Long rentPriceFrom, Long rentPriceTo, List<String> rentTypeList) {
		super();
		this.name = name;
		this.street = street;
		this.ward = ward;
		this.direction = direction;
		this.level = level;
		this.managerName = managerName;
		this.managerPhoneNumber = managerPhoneNumber;
		this.floorArea = floorArea;
		this.districtId = districtId;
		this.numberOfBasement = numberOfBasement;
		this.staffId = staffId;
		this.areaFrom = areaFrom;
		this.areaTo = areaTo;
		this.rentPriceFrom = rentPriceFrom;
		this.rentPriceTo = rentPriceTo;
		this.rentType = rentTypeList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerPhoneNumber() {
		return managerPhoneNumber;
	}

	public void setManagerPhoneNumber(String managerPhoneNumber) {
		this.managerPhoneNumber = managerPhoneNumber;
	}

	public Long getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(Long floorArea) {
		this.floorArea = floorArea;
	}

	public Long getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}

	public Long getNumberOfBasement() {
		return numberOfBasement;
	}

	public void setNumberOfBasement(Long numberOfBasement) {
		this.numberOfBasement = numberOfBasement;
	}

	public Long getStaffId() {
		return staffId;
	}

	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}

	public Long getAreaFrom() {
		return areaFrom;
	}

	public void setAreaFrom(Long areaFrom) {
		this.areaFrom = areaFrom;
	}

	public Long getAreaTo() {
		return areaTo;
	}

	public void setAreaTo(Long areaTo) {
		this.areaTo = areaTo;
	}

	public Long getRentPriceFrom() {
		return rentPriceFrom;
	}

	public void setRentPriceFrom(Long rentPriceFrom) {
		this.rentPriceFrom = rentPriceFrom;
	}

	public Long getRentPriceTo() {
		return rentPriceTo;
	}

	public void setRentPriceTo(Long rentPriceTo) {
		this.rentPriceTo = rentPriceTo;
	}

	public List<String> getRentType() {
		return rentType;
	}

	public void setRentType(List<String> rentTypeList) {
		this.rentType = rentTypeList;
	}

}

package com.JavaBackEnd.MyProject.Entity;

public class BuildingEntity {
	private String name, street, ward, direction, level, managerName, managerPhoneNumber;
	private Long floorArea, rentPrice, districtId, numberOfBasement, buildingId;

	public BuildingEntity() {
	}

	public BuildingEntity(String name, String street, String ward, String direction, String level, String managerName,
			String managerPhoneNumber, Long floorArea, Long rentPrice, Long districtId, Long numberOfBasement,
			Long buildingId) {
		super();
		this.name = name;
		this.street = street;
		this.ward = ward;
		this.direction = direction;
		this.level = level;
		this.managerName = managerName;
		this.managerPhoneNumber = managerPhoneNumber;
		this.floorArea = floorArea;
		this.rentPrice = rentPrice;
		this.districtId = districtId;
		this.numberOfBasement = numberOfBasement;
		this.buildingId = buildingId;
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

	public Long getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(Long rentPrice) {
		this.rentPrice = rentPrice;
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

	public Long getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(Long buildingId) {
		this.buildingId = buildingId;
	}

}

package com.JavaBackEnd.MyProject.DTO;

public class BuildingResponseDTO {
	private String name, address, numberOfBasement, managerName, managerPhoneNumber, rentArea;
	private Long floorArea, rentPrice, serviceFee, brokeragefee;
	public BuildingResponseDTO() {}
	public BuildingResponseDTO(String name, String address, String numberOfBasement, String managerName,
			String managerPhoneNumber, String rentArea, Long floorArea, Long rentPrice, Long serviceFee,
			Long brokeragefee) {
		super();
		this.name = name;
		this.address = address;
		this.numberOfBasement = numberOfBasement;
		this.managerName = managerName;
		this.managerPhoneNumber = managerPhoneNumber;
		this.rentArea = rentArea;
		this.floorArea = floorArea;
		this.rentPrice = rentPrice;
		this.serviceFee = serviceFee;
		this.brokeragefee = brokeragefee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumberOfBasement() {
		return numberOfBasement;
	}

	public void setNumberOfBasement(String numberOfBasement) {
		this.numberOfBasement = numberOfBasement;
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

	public String getRentArea() {
		return rentArea;
	}

	public void setRentArea(String rentArea) {
		this.rentArea = rentArea;
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

	public Long getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(Long serviceFee) {
		this.serviceFee = serviceFee;
	}

	public Long getBrokeragefee() {
		return brokeragefee;
	}

	public void setBrokeragefee(Long brokeragefee) {
		this.brokeragefee = brokeragefee;
	}

}

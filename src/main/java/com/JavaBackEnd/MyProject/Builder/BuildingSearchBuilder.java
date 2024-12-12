package com.JavaBackEnd.MyProject.Builder;

import java.util.ArrayList;
import java.util.List;

public class BuildingSearchBuilder {
	private String name, street, ward, direction, level, managerName, managerPhoneNumber;
	private Long floorArea, districtId, numberOfBasement, staffId, areaFrom, areaTo, rentPriceFrom, rentPriceTo;
	private List<String> rentType = new ArrayList<String>();

	public BuildingSearchBuilder(Builder builder) {
		builder.name = name;
		builder.street = street;
		builder.ward = ward;
		builder.direction = direction;
		builder.level = level;
		builder.managerName = managerName;
		builder.managerPhoneNumber = managerPhoneNumber;
		builder.floorArea = floorArea;
		builder.districtId = districtId;
		builder.numberOfBasement = numberOfBasement;
		builder.staffId = staffId;
		builder.areaFrom = areaFrom;
		builder.areaTo = areaTo;
		builder.rentPriceFrom = rentPriceFrom;
		builder.rentPriceTo = rentPriceTo;
		builder.rentType = rentType;
	}

	public String getName() {
		return name;
	}

	public String getStreet() {
		return street;
	}

	public String getWard() {
		return ward;
	}

	public String getDirection() {
		return direction;
	}

	public String getLevel() {
		return level;
	}

	public String getManagerName() {
		return managerName;
	}

	public String getManagerPhoneNumber() {
		return managerPhoneNumber;
	}

	public Long getFloorArea() {
		return floorArea;
	}

	public Long getDistrictId() {
		return districtId;
	}

	public Long getNumberOfBasement() {
		return numberOfBasement;
	}

	public Long getStaffId() {
		return staffId;
	}

	public Long getAreaFrom() {
		return areaFrom;
	}

	public Long getAreaTo() {
		return areaTo;
	}

	public Long getRentPriceFrom() {
		return rentPriceFrom;
	}

	public Long getRentPriceTo() {
		return rentPriceTo;
	}

	public List<String> getRentType() {
		return rentType;
	}

	public static class Builder {
		private String name, street, ward, direction, level, managerName, managerPhoneNumber;
		private Long floorArea, districtId, numberOfBasement, staffId, areaFrom, areaTo, rentPriceFrom, rentPriceTo;
		private List<String> rentType = new ArrayList<String>();

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setStreet(String street) {
			this.street = street;
			return this;
		}

		public Builder setWard(String ward) {
			this.ward = ward;
			return this;
		}

		public Builder setDirection(String direction) {
			this.direction = direction;
			return this;
		}

		public Builder setLevel(String level) {
			this.level = level;
			return this;
		}

		public Builder setManagerName(String managerName) {
			this.managerName = managerName;
			return this;
		}

		public Builder setManagerPhoneNumber(String managerPhoneNumber) {
			this.managerPhoneNumber = managerPhoneNumber;
			return this;
		}

		public Builder setFloorArea(Long floorArea) {
			this.floorArea = floorArea;
			return this;
		}

		public Builder setDistrictId(Long districtId) {
			this.districtId = districtId;
			return this;
		}

		public Builder setNumberOfBasement(Long numberOfBasement) {
			this.numberOfBasement = numberOfBasement;
			return this;
		}

		public Builder setStaffId(Long staffId) {
			this.staffId = staffId;
			return this;
		}

		public Builder setAreaFrom(Long areaFrom) {
			this.areaFrom = areaFrom;
			return this;
		}

		public Builder setAreaTo(Long areaTo) {
			this.areaTo = areaTo;
			return this;
		}

		public Builder setRentPriceFrom(Long rentPriceFrom) {
			this.rentPriceFrom = rentPriceFrom;
			return this;
		}

		public Builder setRentPriceTo(Long rentPriceTo) {
			this.rentPriceTo = rentPriceTo;
			return this;
		}

		public Builder setRentType(List<String> rentType) {
			this.rentType = rentType;
			return this;
		}
		public BuildingSearchBuilder build() {
			return new BuildingSearchBuilder(this);
		}
	}

}

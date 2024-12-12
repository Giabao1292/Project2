package com.JavaBackEnd.MyProject.Entity;

import java.util.List;

public class RentArea {
	private List<String> areaList;

	public RentArea(List<String> areaList) {
		super();
		this.areaList = areaList;
	}

	public List<String> getAreaList() {
		return areaList;
	}

	public void setAreaList(List<String> areaList) {
		this.areaList = areaList;
	}

}

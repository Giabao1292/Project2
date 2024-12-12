package com.JavaBackEnd.MyProject.Repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.JavaBackEnd.MyProject.DTO.BuildingRequestDTO;
import com.JavaBackEnd.MyProject.Repository.RentAreaRepository;
import com.JavaBackEnd.MyProject.Util.ConnectionJDBC;

@Repository
public class RentAreaRepositoryImpl implements RentAreaRepository {
	@Override
	public List<String> getAreaById(Long buildingId, BuildingRequestDTO buildingRequestDTO) {
		List<String> rentAreaList = new ArrayList<String>();
		StringBuilder sqlFindRentArea = new StringBuilder(
				"SELECT value FROM rentarea WHERE rentarea.buildingid = " + buildingId);
		if (buildingRequestDTO.getAreaFrom() != null && buildingRequestDTO.getAreaFrom() != 0) {
			sqlFindRentArea.append(" AND value >= " + buildingRequestDTO.getAreaFrom());
		}
		if (buildingRequestDTO.getAreaTo() != null && buildingRequestDTO.getAreaTo() != 0) {
			sqlFindRentArea.append(" AND value <= " + buildingRequestDTO.getAreaTo());
		}
		try {
			Statement statement = ConnectionJDBC.getConnection().createStatement();
			ResultSet rs = statement.executeQuery(sqlFindRentArea.toString());
			while (rs.next()) {
				rentAreaList.add(rs.getString("value"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQLException when connect to rentarea table!");
		}
		return rentAreaList;
	}
}

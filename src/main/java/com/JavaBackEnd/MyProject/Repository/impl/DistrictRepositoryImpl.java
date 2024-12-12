package com.JavaBackEnd.MyProject.Repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

import com.JavaBackEnd.MyProject.Repository.DistrictRepository;
import com.JavaBackEnd.MyProject.Util.ConnectionJDBC;

@Repository
public class DistrictRepositoryImpl implements DistrictRepository {
	@Override
	public String getDistrictByID(Long districtid) {
		String districtname = "";
		String sqlFindDistrict = "SELECT name FROM district WHERE district.id = " + districtid;
		try {
			Statement statement = ConnectionJDBC.getConnection().createStatement();
			ResultSet rs = statement.executeQuery(sqlFindDistrict);
			while(rs.next()) {
				districtname = rs.getString("name");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQLException when connect to district table!");

		}
		return districtname;
	}
}

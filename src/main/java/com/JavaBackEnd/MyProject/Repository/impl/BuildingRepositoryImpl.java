package com.JavaBackEnd.MyProject.Repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.JavaBackEnd.MyProject.DTO.BuildingRequestDTO;
import com.JavaBackEnd.MyProject.Entity.BuildingEntity;
import com.JavaBackEnd.MyProject.Repository.BuildingRepository;
import com.JavaBackEnd.MyProject.Util.ConnectionJDBC;
import com.JavaBackEnd.MyProject.Util.ModelMapperConvert;

@Repository
public class BuildingRepositoryImpl implements BuildingRepository {
	public void JoinTable(BuildingRequestDTO buildingRequestDTO, StringBuilder sqlFindBuilding) {
		if (buildingRequestDTO.getStaffId() != null && buildingRequestDTO.getStaffId() != 0) {
			sqlFindBuilding.append(" JOIN assignmentbuilding a ON a.buildingid = b.buildingid");
			sqlFindBuilding.append(" JOIN user u ON u.id = a.staffid");
		}
		if (buildingRequestDTO.getRentType() != null && buildingRequestDTO.getRentType().size() != 0) {
			sqlFindBuilding.append(" JOIN buildingrenttype brt ON brt.buildingid = b.id");
			sqlFindBuilding.append(" JOIN renttype rt ON rt.id = brt.renttypeid");
		}
		if ((buildingRequestDTO.getAreaFrom() != null && buildingRequestDTO.getAreaFrom() != 0)
				|| (buildingRequestDTO.getAreaTo() != null && buildingRequestDTO.getAreaTo() != 0)) {
			sqlFindBuilding.append(" JOIN rentarea ra ON ra.buildingid = b.id");
		}
	}

	public void queryString(String value, String object, StringBuilder sqlFindBuilding) {
		sqlFindBuilding.append(" AND " + object + " LIKE '%" + value + "%'");
	}

	public void queryNumber(Long value, String object, StringBuilder sqlFindBuilding) {
		sqlFindBuilding.append(" AND " + object + " = " + value);
	}

	public void queryCompare(Long value, String object, String compare, StringBuilder sqlFindBuilding) {
		sqlFindBuilding.append(" AND " + object + compare + value);
	}

	public void queryAll(BuildingRequestDTO buildingRequestDTO, StringBuilder sqlFindBuilding) {
		sqlFindBuilding.append(" WHERE 1 = 1");
		Map<String, Object> buildingRequestMap = ModelMapperConvert.convertToMap(buildingRequestDTO);
		for (String attribute : buildingRequestMap.keySet()) {
			if (buildingRequestMap.get(attribute) == null || buildingRequestMap.get(attribute) == ""
					|| attribute == "rentType" || attribute == "staffId") {
				continue;
			}
			if (attribute.startsWith("rentPrice")) {
				if (attribute.contains("From")) {
					queryCompare((Long) buildingRequestMap.get(attribute), "b.rentPrice ", ">= ", sqlFindBuilding);
				} else {
					queryCompare((Long) buildingRequestMap.get(attribute), "b.rentPrice ", "<= ", sqlFindBuilding);
				}
			} else if (attribute.startsWith("area")) {
				if (attribute.contains("From")) {
					queryCompare((Long) buildingRequestMap.get(attribute), "ra.value ", ">= ", sqlFindBuilding);
				} else {
					queryCompare((Long) buildingRequestMap.get(attribute), "ra.value ", "<= ", sqlFindBuilding);
				}
			} else if (buildingRequestMap.get(attribute) instanceof String) {
				queryString((String) buildingRequestMap.get(attribute), "b." + attribute, sqlFindBuilding);
			} else {
				queryNumber((Long) buildingRequestMap.get(attribute), "b." + attribute, sqlFindBuilding);
			}
		}
	}

	public void queryRentType(BuildingRequestDTO buildingRequestDTO, StringBuilder sqlFindBuilding) {
		if (buildingRequestDTO.getRentType() != null && buildingRequestDTO.getRentType().size() != 0) {
			String rentAreaList = buildingRequestDTO.getRentType().stream()
					.map(item -> " rt.name LIKE '%" + item + "%' ").collect(Collectors.joining("OR"));
			sqlFindBuilding.append(" AND (" + rentAreaList + ")");
		}
	}

	public List<BuildingEntity> getBuildingEntities(BuildingRequestDTO buildingRequestDTO) {
		StringBuilder sqlFindBuilding = new StringBuilder("SELECT b.id, b.name, b.street,"
				+ " b.districtid, b.direction, b.level, b.managerName, b.managerPhoneNumber,"
				+ " b.floorArea, b.rentPrice, b.numberOfBasement, b.ward FROM building b");
		JoinTable(buildingRequestDTO, sqlFindBuilding);
		queryAll(buildingRequestDTO, sqlFindBuilding);
		queryRentType(buildingRequestDTO, sqlFindBuilding);
		sqlFindBuilding.append(
				" GROUP BY b.id, b.name, b.street, b.districtid, b.direction, b.level, b.ward, b.managerName, b.managerPhoneNumber, b.floorArea, b.rentPrice, b.numberOfBasement");
		List<BuildingEntity> listBuildingEntities = new ArrayList<BuildingEntity>();
		try {
			Statement statement = ConnectionJDBC.getConnection().createStatement();
			ResultSet rs = statement.executeQuery(sqlFindBuilding.toString());
			while (rs.next()) {
				BuildingEntity buildingEntity = new BuildingEntity();
				buildingEntity.setBuildingId(rs.getLong("id"));
				buildingEntity.setDirection(rs.getString("direction"));
				buildingEntity.setDistrictId(rs.getLong("districtid"));
				buildingEntity.setFloorArea(rs.getLong("floorarea"));
				buildingEntity.setLevel(rs.getString("level"));
				buildingEntity.setManagerName(rs.getString("managername"));
				buildingEntity.setManagerPhoneNumber(rs.getString("managerphonenumber"));
				buildingEntity.setName(rs.getString("name"));
				buildingEntity.setNumberOfBasement(rs.getLong("numberofbasement"));
				buildingEntity.setRentPrice(rs.getLong("rentprice"));
				buildingEntity.setWard(rs.getString("ward"));
				buildingEntity.setStreet(rs.getString("street"));
				listBuildingEntities.add(buildingEntity);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL connection when query building!");
		}
		return listBuildingEntities;
	}
}

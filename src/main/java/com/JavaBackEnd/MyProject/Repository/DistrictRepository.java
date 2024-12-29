package com.JavaBackEnd.MyProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JavaBackEnd.MyProject.Entity.DistrictEntity;
import com.JavaBackEnd.MyProject.Repository.Custom.DistrictRepositoryCustom;

public interface DistrictRepository extends JpaRepository<DistrictEntity, Long>, DistrictRepositoryCustom {
}

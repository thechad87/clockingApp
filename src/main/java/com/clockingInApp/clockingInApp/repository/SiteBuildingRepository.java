package com.clockingInApp.clockingInApp.repository;

import com.clockingInApp.clockingInApp.domain.Location.SiteBuilding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteBuildingRepository extends JpaRepository<SiteBuilding, String> {
}

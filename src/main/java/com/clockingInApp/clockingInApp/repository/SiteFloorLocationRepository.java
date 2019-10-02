package com.clockingInApp.clockingInApp.repository;

import com.clockingInApp.clockingInApp.domain.Location.SiteFloorLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ChadMarthinussen2 on 2019/06/10.
 */
@Repository
public interface SiteFloorLocationRepository extends JpaRepository <SiteFloorLocation, String> {
//    Set<SiteFloorLocation> getAll();
}

package com.clockingInApp.clockingInApp.repository;

import com.clockingInApp.clockingInApp.domain.Location.SiteLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ChadMarthinussen2 on 2019/06/11.
 */
@Repository
public interface SiteLocationRepository extends JpaRepository <SiteLocation, String> {
//    Set <SiteLocation> getAll();
}

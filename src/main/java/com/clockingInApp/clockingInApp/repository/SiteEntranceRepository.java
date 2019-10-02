package com.clockingInApp.clockingInApp.repository;

import com.clockingInApp.clockingInApp.domain.Location.SiteEntrance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteEntranceRepository extends JpaRepository <SiteEntrance, String> {
}

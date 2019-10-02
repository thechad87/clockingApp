package com.clockingInApp.clockingInApp.repository;

import com.clockingInApp.clockingInApp.domain.Alerts.Notices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticesRepository extends JpaRepository<Notices, String> {
}

package com.clockingInApp.clockingInApp.repository;

import com.clockingInApp.clockingInApp.domain.Alerts.Alert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertRepository extends JpaRepository<Alert, String> {
}

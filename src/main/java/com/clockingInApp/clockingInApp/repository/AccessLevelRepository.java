package com.clockingInApp.clockingInApp.repository;

import com.clockingInApp.clockingInApp.domain.AccessTypes.AccessLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessLevelRepository extends JpaRepository<AccessLevel, String> {
}

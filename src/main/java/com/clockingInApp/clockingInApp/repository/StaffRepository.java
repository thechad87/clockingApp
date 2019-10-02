package com.clockingInApp.clockingInApp.repository;

import com.clockingInApp.clockingInApp.domain.UserlType.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ChadMarthinussen2 on 2019/04/25.
 */
@Repository
public interface StaffRepository extends JpaRepository <Staff, Integer> {
//    Set<Staff> getAll();
}

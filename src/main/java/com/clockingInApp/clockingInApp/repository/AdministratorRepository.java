package com.clockingInApp.clockingInApp.repository;

import com.clockingInApp.clockingInApp.domain.UserlType.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ChadMarthinussen2 on 2019/04/29.
 */
@Repository
public interface AdministratorRepository extends JpaRepository <Administrator, Integer> {
//    Set<Administrator> getAll();
}

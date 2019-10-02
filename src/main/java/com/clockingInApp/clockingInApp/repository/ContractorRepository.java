package com.clockingInApp.clockingInApp.repository;

import com.clockingInApp.clockingInApp.domain.UserlType.Contractor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ChadMarthinussen2 on 2019/05/01.
 */
@Repository
public interface ContractorRepository extends JpaRepository <Contractor, Integer> {
//    Set<Contractor> getAll();
}

package com.clockingInApp.clockingInApp.repository;

import com.clockingInApp.clockingInApp.domain.UserlType.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ChadMarthinussen2 on 2019/04/29.
 */
@Repository
public interface GuestRepository extends JpaRepository <Guest, Integer> {
//    Guest retrieveByDesc(String genderDesc);
//    Set<Guest> getAll();

}

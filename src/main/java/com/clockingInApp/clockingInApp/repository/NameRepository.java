package com.clockingInApp.clockingInApp.repository;

/**
 * Created by ChadMarthinussen2 on 2019/06/09.
 */

import com.clockingInApp.clockingInApp.domain.PersonalDetails.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
//public interface NameRepository{
public interface NameRepository extends JpaRepository <Name, String> {
//    Set<Name> getAll();
}

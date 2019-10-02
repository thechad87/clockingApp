package com.clockingInApp.clockingInApp.repository;

import com.clockingInApp.clockingInApp.domain.PersonalDetails.ContactDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ChadMarthinussen2 on 2019/06/11.
 */
@Repository
public interface ContactDetailsRepository extends JpaRepository <ContactDetails, String> {
//    Set<ContactDetails> getAll();
}


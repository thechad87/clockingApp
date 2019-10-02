package com.clockingInApp.clockingInApp.repository;

import com.clockingInApp.clockingInApp.domain.AccessTypes.PasswordCredential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ChadMarthinussen2 on 2019/05/01.
 */
@Repository
public interface PasswordCredentialRepository extends JpaRepository <PasswordCredential, String> {
//    Set<PasswordCredential> getAll();
}
package com.clockingInApp.clockingInApp.services.impl;

import com.clockingInApp.clockingInApp.domain.AccessTypes.PasswordCredential;
import com.clockingInApp.clockingInApp.repository.PasswordCredentialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/06/10.
 */
@Service
public class PasswordCredentialServiceImpl {

    @Autowired
    private PasswordCredentialRepository passwordCredentialRepository;

    public List <PasswordCredential> getAllPasswordCredentials() {
        List <PasswordCredential> passwordCredentials = new ArrayList <>();
        passwordCredentialRepository.findAll().forEach(passwordCredentials::add);
        return passwordCredentials;
    }

    public PasswordCredential getPasswordCredential(String id) {
        return passwordCredentialRepository.findById(id).get();
    }

    public void addPasswordCredential(PasswordCredential passwordCredential) {
        passwordCredentialRepository.save(passwordCredential);
    }

    public void updatePasswordCredential(String id, PasswordCredential passwordCredential) {
        passwordCredentialRepository.save(passwordCredential);
    }

    public void deletePasswordCredential(String id) {
        passwordCredentialRepository.deleteById(id);
    }
}

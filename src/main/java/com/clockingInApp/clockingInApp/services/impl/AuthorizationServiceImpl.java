package com.clockingInApp.clockingInApp.services.impl;

import com.clockingInApp.clockingInApp.domain.AccessTypes.Authorization;
import com.clockingInApp.clockingInApp.repository.AuthorizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/06/10.
 */
@Service
public class AuthorizationServiceImpl {

    @Autowired
    private AuthorizationRepository authorizationRepository;

    public List <Authorization> getAllAuthorizations() {
        List <Authorization> authorizations = new ArrayList <>();
        authorizationRepository.findAll().forEach(authorizations::add);
        return authorizations;
    }

    public Authorization getAuthorization(String id) {
        return authorizationRepository.findById(id).get();
    }

    public void addAuthorization(Authorization authorization) {
        authorizationRepository.save(authorization);
    }

    public void updateAuthorization(String id, Authorization authorization) {
        authorizationRepository.save(authorization);
    }

    public void deleteAuthorization(String id) {
        authorizationRepository.deleteById(id);
    }
}





















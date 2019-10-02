package com.clockingInApp.clockingInApp.services.impl;

import com.clockingInApp.clockingInApp.domain.AccessTypes.AccessLevel;
import com.clockingInApp.clockingInApp.repository.AccessLevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AccessLevelServiceImpl {

    @Autowired
    private AccessLevelRepository accessLevelRepository;

    public List <AccessLevel> getAllAccessLevels() {
        List <AccessLevel> accessLevels = new ArrayList <>();
        accessLevelRepository.findAll().forEach(accessLevels::add);
        return accessLevels;
    }

    public AccessLevel getAccessLevel(String id) {
        return accessLevelRepository.findById(id).get();
    }

    public void addAccessLevel(AccessLevel accessLevel) {
        accessLevelRepository.save(accessLevel);
    }

    public void updateAccessLevel(String id, AccessLevel accessLevel) {
        accessLevelRepository.save(accessLevel);
    }

    public void deleteAccessLevel(String id) {
        accessLevelRepository.deleteById(id);
    }
}

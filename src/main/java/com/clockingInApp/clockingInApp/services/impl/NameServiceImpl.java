package com.clockingInApp.clockingInApp.services.impl;

import com.clockingInApp.clockingInApp.domain.PersonalDetails.Name;
import com.clockingInApp.clockingInApp.repository.NameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/06/10.
 */
@Service
public class NameServiceImpl{

    @Autowired
    private NameRepository nameRepository;

    public List <Name> getAllNames() {
        List <Name> names = new ArrayList <>();
        nameRepository.findAll().forEach(names::add);
        return names;
    }

    public Name getName(String id) {
        return nameRepository.findById(id).get();
    }

    public void addName(Name name) {
        nameRepository.save(name);
    }

    public void updateName(String id, Name name) {
        nameRepository.save(name);
    }

    public void deleteName(String id) {
        nameRepository.deleteById(id);
    }
}

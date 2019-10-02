package com.clockingInApp.clockingInApp.services.impl;

import com.clockingInApp.clockingInApp.domain.UserlType.Administrator;
import com.clockingInApp.clockingInApp.repository.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/06/08.
 */
@Service
public class AdministratorServiceImpl {

    @Autowired
    private AdministratorRepository administratorRepository;

    public List <Administrator> getAllAdministrators() {
        List <Administrator> administrators = new ArrayList <>();
        administratorRepository.findAll().forEach(administrators::add);
        return administrators;
    }

    public Administrator getAdministrator(Integer id) {
        return administratorRepository.findById(id).get();
    }

    public void addAdministrator(Administrator administrator) {
        administratorRepository.save(administrator);
    }

    public void updateAdministrator(Integer id, Administrator administrator) {
        administratorRepository.save(administrator);
    }

    public void deleteAdministrator(Integer id) {
        administratorRepository.deleteById(id);
    }
}

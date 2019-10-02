package com.clockingInApp.clockingInApp.services.impl;

import com.clockingInApp.clockingInApp.domain.UserlType.Contractor;
import com.clockingInApp.clockingInApp.repository.ContractorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/06/10.
 */
@Service
public class ContractorServiceImpl {

    @Autowired
    private ContractorRepository contractorRepository;


    public List <Contractor> getAllContractors() {
        List <Contractor> contractors = new ArrayList <>();
        contractorRepository.findAll().forEach(contractors::add);
        return contractors;
    }

    public Contractor getContractor(Integer id) {
        return contractorRepository.findById(id).get();
    }

    public void addContractor(Contractor contractor) {
        contractorRepository.save(contractor);
    }

    public void updateContractor(Integer id, Contractor contractor) {
        contractorRepository.save(contractor);
    }

    public void deleteContractor(Integer id) {
        contractorRepository.deleteById(id);
    }
}


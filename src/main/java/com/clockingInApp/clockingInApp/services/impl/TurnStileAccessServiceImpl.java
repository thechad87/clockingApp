package com.clockingInApp.clockingInApp.services.impl;

import com.clockingInApp.clockingInApp.domain.AccessTypes.TurnStileAccess;
import com.clockingInApp.clockingInApp.repository.TurnStileAccessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/06/10.
 */

@Service
public class TurnStileAccessServiceImpl {

    @Autowired
    private TurnStileAccessRepository contractorRepository;

    public List <TurnStileAccess> getAllTurnStileAccesss() {
        List <TurnStileAccess> contractors = new ArrayList <>();
        contractorRepository.findAll().forEach(contractors::add);
        return contractors;
    }

    public TurnStileAccess getTurnStileAccess(String id) {
        return contractorRepository.findById(id).get();
    }

    public void addTurnStileAccess(TurnStileAccess contractor) {
        contractorRepository.save(contractor);
    }

    public void updateTurnStileAccess(String id, TurnStileAccess contractor) {
        contractorRepository.save(contractor);
    }

    public void deleteTurnStileAccess(String id) {
        contractorRepository.deleteById(id);
    }
}

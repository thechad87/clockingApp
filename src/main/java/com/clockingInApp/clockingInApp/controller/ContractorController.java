package com.clockingInApp.clockingInApp.controller;

import com.clockingInApp.clockingInApp.domain.UserlType.Contractor;
import com.clockingInApp.clockingInApp.services.impl.ContractorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/06/08.
 */
@RestController
public class ContractorController {

    @Autowired
    private ContractorServiceImpl contractorService;

    @RequestMapping("/contractors")
    public List <Contractor> GetAllContractors() {
        return contractorService.getAllContractors();
    }

    @RequestMapping("/contractors/{id}")
    public Contractor getContractor(@PathVariable Integer id) {
        return contractorService.getContractor(id);
    }

    @PostMapping("/contractors")
    public void addContractor(@RequestBody Contractor contractor){
        contractorService.addContractor(contractor);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/contractors/{id}")
    public void updateContractor(@RequestBody Contractor contractor, @PathVariable Integer id){
        contractorService.updateContractor(id, contractor);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/contractors/{id}")
    public void deleteContractor(@PathVariable Integer id){
        contractorService.deleteContractor(id);
    }
}
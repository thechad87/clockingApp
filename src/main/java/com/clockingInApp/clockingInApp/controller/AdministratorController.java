package com.clockingInApp.clockingInApp.controller;

import com.clockingInApp.clockingInApp.domain.UserlType.Administrator;
import com.clockingInApp.clockingInApp.services.impl.AdministratorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Chad Marthinussen on 2019/06/08.
 */

@RestController
public class AdministratorController {


    @Autowired
    private AdministratorServiceImpl administratorService;

    @RequestMapping("/administrators")
    public List <Administrator> GetAllAdministrators() {
        return administratorService.getAllAdministrators();
    }

    @RequestMapping("/administrators/{id}")
    public Administrator getAdministrator(@PathVariable Integer id) {
        return administratorService.getAdministrator(id);
    }

    @PostMapping("/administrators")
    public void addAdministrator(@RequestBody Administrator administrator){
        administratorService.addAdministrator(administrator);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/administrators/{id}")
    public void updateAdministrator(@RequestBody Administrator administrator, @PathVariable Integer id){
        administratorService.updateAdministrator(id, administrator);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/administrators/{id}")
    public void deleteAdministrator(@PathVariable Integer id){
        administratorService.deleteAdministrator(id);
    }
}

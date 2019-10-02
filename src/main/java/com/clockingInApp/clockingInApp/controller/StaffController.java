package com.clockingInApp.clockingInApp.controller;

import com.clockingInApp.clockingInApp.domain.UserlType.Staff;
import com.clockingInApp.clockingInApp.services.impl.StaffServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/06/08.
 */
@RestController
//@RequestMapping("clockin/staff")
public class StaffController {


    @Autowired
    private StaffServiceImpl staffService;

    @RequestMapping("/staffs")
    public List <Staff> GetAllStaffs() {
        return staffService.getAllStaffs();
    }

    @RequestMapping("/staffs/{id}")
    public Staff getStaff(@PathVariable Integer id) {
        return staffService.getStaff(id);
    }

    @PostMapping("/staffs")
    public void addStaff(@RequestBody Staff staff){
        staffService.addStaff(staff);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/staffs/{id}")
    public void updateStaff(@RequestBody Staff staff, @PathVariable Integer id){
        staffService.updateStaff(id, staff);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/staffs/{id}")
    public void deleteStaff(@PathVariable Integer id){
        staffService.deleteStaff(id);
    }

}
package com.clockingInApp.clockingInApp.services.impl;

import com.clockingInApp.clockingInApp.domain.UserlType.Staff;
import com.clockingInApp.clockingInApp.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/06/10.
 */
@Service
public class StaffServiceImpl {

    @Autowired
    private StaffRepository staffRepository;

    public List <Staff> getAllStaffs() {
        List <Staff> staffs = new ArrayList <>();
        staffRepository.findAll().forEach(staffs::add);
        return staffs;
    }

    public Staff getStaff(Integer id) {
        return staffRepository.findById(id).get();
    }

    public void addStaff(Staff staff) {
        staffRepository.save(staff);
    }

    public void updateStaff(Integer id, Staff staff) {
        staffRepository.save(staff);
    }

    public void deleteStaff(Integer id) {
        staffRepository.deleteById(id);
    }
}

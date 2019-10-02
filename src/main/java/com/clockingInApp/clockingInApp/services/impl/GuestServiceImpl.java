package com.clockingInApp.clockingInApp.services.impl;

import com.clockingInApp.clockingInApp.domain.UserlType.Guest;
import com.clockingInApp.clockingInApp.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/06/10.
 */
@Service
public class GuestServiceImpl  {

    @Autowired
    private GuestRepository guestRepository;

    public List <Guest> getAllGuests() {
        List <Guest> guests = new ArrayList <>();
        guestRepository.findAll().forEach(guests::add);
        return guests;
    }

    public Guest getGuest(Integer id) {
        return guestRepository.findById(id).get();
    }

    public void addGuest(Guest guest) {
        guestRepository.save(guest);
    }

    public void updateGuest(Integer id, Guest guest) {
        guestRepository.save(guest);
    }

    public void deleteGuest(Integer id) {
        guestRepository.deleteById(id);
    }
}

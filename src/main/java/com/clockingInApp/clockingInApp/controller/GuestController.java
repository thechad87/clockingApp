package com.clockingInApp.clockingInApp.controller;

import com.clockingInApp.clockingInApp.domain.UserlType.Guest;
import com.clockingInApp.clockingInApp.services.impl.GuestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/06/08.
 */
@RestController
public class GuestController {


    @Autowired
    private GuestServiceImpl guestService;

    @RequestMapping("/guests")
    public List <Guest> GetAllGuests() {
        return guestService.getAllGuests();
    }

    @RequestMapping("/guests/{id}")
    public Guest getGuest(@PathVariable Integer id) {
        return guestService.getGuest(id);
    }

    @PostMapping("/guests")
    public void addGuest(@RequestBody Guest guest){
        guestService.addGuest(guest);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/guests/{id}")
    public void updateGuest(@RequestBody Guest guest, @PathVariable Integer id){
        guestService.updateGuest(id, guest);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/guests/{id}")
    public void deleteGuest(@PathVariable Integer id){
        guestService.deleteGuest(id);
    }

}

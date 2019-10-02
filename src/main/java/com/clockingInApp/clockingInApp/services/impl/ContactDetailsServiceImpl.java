package com.clockingInApp.clockingInApp.services.impl;

import com.clockingInApp.clockingInApp.domain.PersonalDetails.ContactDetails;
import com.clockingInApp.clockingInApp.repository.ContactDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/06/10.
 */
@Service
public class ContactDetailsServiceImpl{

    @Autowired
    private ContactDetailsRepository contactDetailsRepository;

    public List <ContactDetails> getAllContactDetailss() {
        List <ContactDetails> contactDetailss = new ArrayList <>();
        contactDetailsRepository.findAll().forEach(contactDetailss::add);
        return contactDetailss;
    }

    public ContactDetails getContactDetails(String id) {
        return contactDetailsRepository.findById(id).get();
    }

    public void addContactDetails(ContactDetails contactDetails) {
        contactDetailsRepository.save(contactDetails);
    }

    public void updateContactDetails(String id, ContactDetails contactDetails) {
        contactDetailsRepository.save(contactDetails);
    }

    public void deleteContactDetails(String id) {
        contactDetailsRepository.deleteById(id);
    }
}


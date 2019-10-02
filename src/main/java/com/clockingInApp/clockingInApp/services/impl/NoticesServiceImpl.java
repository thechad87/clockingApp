package com.clockingInApp.clockingInApp.services.impl;

import com.clockingInApp.clockingInApp.domain.Alerts.Notices;
import com.clockingInApp.clockingInApp.repository.NoticesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class NoticesServiceImpl {

    @Autowired
    private NoticesRepository noticesRepository;

    public List <Notices> getAllNoticess() {
        List <Notices> noticess = new ArrayList <>();
        noticesRepository.findAll().forEach(noticess::add);
        return noticess;
    }

    public Notices getNotices(String id) {
        return noticesRepository.findById(id).get();
    }

    public void addNotices(Notices notices) {
        noticesRepository.save(notices);
    }

    public void updateNotices(String id, Notices notices) {
        noticesRepository.save(notices);
    }

    public void deleteNotices(String id) {
        noticesRepository.deleteById(id);
    }
}

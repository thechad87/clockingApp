package com.clockingInApp.clockingInApp.services.impl;

import com.clockingInApp.clockingInApp.domain.Location.SiteEntrance;
import com.clockingInApp.clockingInApp.repository.SiteEntranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SiteEntranceServiceImpl {

    @Autowired
    private SiteEntranceRepository siteEntranceRepository;

    public List <SiteEntrance> getAllSiteEntrances() {
        List <SiteEntrance> siteEntrances = new ArrayList <>();
        siteEntranceRepository.findAll().forEach(siteEntrances::add);
        return siteEntrances;
    }

    public SiteEntrance getSiteEntrance(String id) {
        return siteEntranceRepository.findById(id).get();
    }

    public void addSiteEntrance(SiteEntrance siteEntrance) {
        siteEntranceRepository.save(siteEntrance);
    }

    public void updateSiteEntrance(String id, SiteEntrance siteEntrance) {
        siteEntranceRepository.save(siteEntrance);
    }

    public void deleteSiteEntrance(String id) {
        siteEntranceRepository.deleteById(id);
    }
}

package com.clockingInApp.clockingInApp.services.impl;

import com.clockingInApp.clockingInApp.domain.Location.SiteBuilding;
import com.clockingInApp.clockingInApp.repository.SiteBuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SiteBuildingServiceImpl {

    @Autowired
    private SiteBuildingRepository siteBuildingRepository;

    public List <SiteBuilding> getAllSiteBuildings() {
        List <SiteBuilding> siteBuildings = new ArrayList <>();
        siteBuildingRepository.findAll().forEach(siteBuildings::add);
        return siteBuildings;
    }

    public SiteBuilding getSiteBuilding(String id) {
        return siteBuildingRepository.findById(id).get();
    }

    public void addSiteBuilding(SiteBuilding siteBuilding) {
        siteBuildingRepository.save(siteBuilding);
    }

    public void updateSiteBuilding(String id, SiteBuilding siteBuilding) {
        siteBuildingRepository.save(siteBuilding);
    }

    public void deleteSiteBuilding(String id) {
        siteBuildingRepository.deleteById(id);
    }
}

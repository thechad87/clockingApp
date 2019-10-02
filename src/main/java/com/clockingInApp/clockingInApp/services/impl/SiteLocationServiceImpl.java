package com.clockingInApp.clockingInApp.services.impl;

import com.clockingInApp.clockingInApp.domain.Location.SiteLocation;
import com.clockingInApp.clockingInApp.repository.SiteLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/06/10.
 */
@Service
public class SiteLocationServiceImpl {

    @Autowired
    private SiteLocationRepository siteLocationRepository;

    public List <SiteLocation> getAllSiteLocations() {
        List <SiteLocation> siteLocations = new ArrayList <>();
        siteLocationRepository.findAll().forEach(siteLocations::add);
        return siteLocations;
    }

    public SiteLocation getSiteLocation(String id) {
        return siteLocationRepository.findById(id).get();
    }

    public void addSiteLocation(SiteLocation siteLocation) {
        siteLocationRepository.save(siteLocation);
    }

    public void updateSiteLocation(String id, SiteLocation siteLocation) {
        siteLocationRepository.save(siteLocation);
    }

    public void deleteSiteLocation(String id) {
        siteLocationRepository.deleteById(id);
    }
}

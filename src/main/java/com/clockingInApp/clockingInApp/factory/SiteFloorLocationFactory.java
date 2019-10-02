package com.clockingInApp.clockingInApp.factory;

import com.clockingInApp.clockingInApp.domain.Location.SiteFloorLocation;

/**
 * Created by ChadMarthinussen2 on 2019/04/17.
 */
public class SiteFloorLocationFactory {

    public static SiteFloorLocation buildSiteFloorLocation(String siteFloorLocationID, String buildingLocation, String floorNumber, String siteFloorLocationEntrance){
    return new SiteFloorLocation.Builder().siteFloorLocationID(siteFloorLocationID).siteFloorLocationID(siteFloorLocationID).buildingLocation(buildingLocation).floorNumber(floorNumber).siteFloorLocationEntrance(siteFloorLocationEntrance).build();
    }
}



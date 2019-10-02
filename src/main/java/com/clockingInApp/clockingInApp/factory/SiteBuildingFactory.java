package com.clockingInApp.clockingInApp.factory;

import com.clockingInApp.clockingInApp.domain.Location.SiteBuilding;

/**
 * Created by ChadMarthinussen2 on 2019/09/14.
 */
public class SiteBuildingFactory {

    public static SiteBuilding buildSiteBuilding(String buildingId, String buildingName, String buildingDescription){
        return new SiteBuilding.Builder().buildingId(buildingId).buildingName(buildingName).buildingDescription(buildingDescription).build();
    }
}

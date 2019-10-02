package com.clockingInApp.clockingInApp.factory;

import com.clockingInApp.clockingInApp.domain.Location.SiteEntrance;

/**
 * Created by ChadMarthinussen2 on 2019/09/14.
 */
public class SiteEntranceFactory {

    public static SiteEntrance builSiteEntrance(String entranceID, String entranceName, String entranceDescription){
        return new SiteEntrance.Builder().entranceID(entranceID).entranceName(entranceName).entranceDescription(entranceDescription).build();
    }
}


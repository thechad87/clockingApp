package com.clockingInApp.clockingInApp.factory;

import com.clockingInApp.clockingInApp.domain.AccessTypes.AccessLevel;

public class AccessLevelFactory{

        public static AccessLevel buildAccessLevelFactory(String accessLevelID, String accessLevelType, String accessLevelDescription) {
            return new AccessLevel.Builder().accessLevelID(accessLevelID).accessLevelType(accessLevelType).accessLevelDescription(accessLevelDescription).build();
        }
}


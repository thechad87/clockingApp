package com.clockingInApp.clockingInApp.domain.AccessTypes;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ChadMarthinussen2 on 2019/06/09.
 */
@Entity
public class AccessLevel implements Comparable<AccessLevel>{

    @Id
    private String accessLevelID;
    private String accessLevelType;
    private String accessLevelDescription;

    public AccessLevel(Builder builder) {
        this.accessLevelID  = builder.accessLevelID;
        this.accessLevelType = builder.accessLevelType;
        this.accessLevelDescription = builder.accessLevelDescription;
        return;
    }

    public String getAccessLevelID() {
        return accessLevelID;
    }

    public String getAccessLevelType() {
        return accessLevelType;
    }

    public String getAccessLevelDescription() {
        return accessLevelDescription;
    }

    @Override
    public String toString() {
        return "AccessLevel{" +
                "accessLevelID='" + accessLevelID + '\'' +
                ", accessLevelType='" + accessLevelType + '\'' +
                ", accessLevelDescription='" + accessLevelDescription + '\'' +
                '}';
    }

    @Override
    public int compareTo(AccessLevel o) {
        return this.accessLevelID.compareToIgnoreCase(o.accessLevelID);
    }

    public static class Builder {

        private String accessLevelID;
        private String accessLevelType;
        private String accessLevelDescription;


        public Builder accessLevelID(String accessLevelID) {
            this.accessLevelID = accessLevelID;
            return this;
        }

        public Builder accessLevelType(String accessLevelType) {
            this.accessLevelType = accessLevelType;
            return this;
        }

        public Builder accessLevelDescription(String accessLevelDescription) {
            this.accessLevelDescription = accessLevelDescription;
            return this;
        }

        public Builder copy(AccessLevel accessLevel){
            this.accessLevelID  = accessLevel.accessLevelID;
            this.accessLevelType = accessLevel.accessLevelType;
            this.accessLevelDescription = accessLevel.accessLevelDescription;
            return this;
        }

        public AccessLevel build(){
            return new AccessLevel(this);
        }
    }
}


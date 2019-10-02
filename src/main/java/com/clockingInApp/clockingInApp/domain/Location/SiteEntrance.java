package com.clockingInApp.clockingInApp.domain.Location;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ChadMarthinussen2 on 2019/09/13.
 */
@Entity
public class SiteEntrance implements Comparable<SiteEntrance> {

    @Id
    private String entranceID;
    private String entranceName;
    private String entranceDescription;

    public SiteEntrance(Builder builder) {
        this.entranceID = builder.entranceID;
        this.entranceName = builder.entranceName;
        this.entranceDescription = builder.entranceDescription;
    }

    public String getEntranceID() {
        return entranceID;
    }

    public String getEntranceName() {
        return entranceName;
    }

    public String getEntranceDescription() {
        return entranceDescription;
    }


    @Override
    public String toString() {
        return "SiteEntrance{" +
                "entranceID='" + entranceID + '\'' +
                ", entranceName='" + entranceName + '\'' +
                ", entranceDescription='" + entranceDescription + '\'' +
                '}';
    }

    @Override
    public int compareTo(SiteEntrance o) {
        return this.entranceID.compareToIgnoreCase(o.entranceID);

    }

    public static class Builder{

        private String entranceID;
        private String entranceName;
        private String entranceDescription;


        public Builder entranceID(String entranceID) {
            this.entranceID = entranceID;
            return this;
        }

        public Builder entranceName(String entranceName) {
            this.entranceName = entranceName;
            return this;
        }

        public Builder entranceDescription(String entranceDescription) {
            this.entranceDescription = entranceDescription;
            return this;
        }


        public SiteEntrance build(){
            return new SiteEntrance(this);
        }

        public Builder copy(SiteEntrance siteEntrance){
            this.entranceID = siteEntrance.entranceID;
            this.entranceName = siteEntrance.entranceName;
            this.entranceDescription = siteEntrance.entranceDescription;
            return this;
        }

    }
}

package com.clockingInApp.clockingInApp.domain.Location;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ChadMarthinussen2 on 2019/09/13.
 */
@Entity
public class SiteBuilding implements Comparable<SiteBuilding> {

    @Id
    private String buildingId;
    private String buildingName;
    private String buildingDescription;

    public SiteBuilding(Builder builder) {
        this.buildingId = builder.buildingId;
        this.buildingName = builder.buildingName;
        this.buildingDescription = builder.buildingDescription;
    }

    public String getBuildingId() {
        return buildingId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public String getBuildingDescription() {
        return buildingDescription;
    }

    @Override
    public String toString() {
        return "SiteBuilding{" +
                "buildingId='" + buildingId + '\'' +
                ", buildingName='" + buildingName + '\'' +
                ", buildingDescription='" + buildingDescription + '\'' +
                '}';
    }

    @Override
    public int compareTo(SiteBuilding o) {
        return this.buildingId.compareToIgnoreCase(o.buildingId);

    }

    public static class Builder{

        private String buildingId;
        private String buildingName;
        private String buildingDescription;

        public Builder buildingId(String buildingId) {
            this.buildingId = buildingId;
            return this;
        }

        public Builder buildingName(String buildingName) {
            this.buildingName = buildingName;
            return this;
        }

        public Builder buildingDescription(String buildingDescription) {
            this.buildingDescription = buildingDescription;
            return this;
        }

        public SiteBuilding build(){
            return new SiteBuilding(this);
        }

        public Builder copy(SiteBuilding siteBuilding){
            this.buildingId = siteBuilding.buildingId;
            this.buildingName = siteBuilding.buildingName;
            this.buildingDescription = siteBuilding.buildingDescription;
            return this;
        }
    }
}

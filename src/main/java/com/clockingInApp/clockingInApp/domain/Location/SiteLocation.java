package com.clockingInApp.clockingInApp.domain.Location;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ChadMarthinussen2 on 2019/04/17.
 */
@Entity
public class SiteLocation implements Comparable<SiteLocation> {

    @Id
    private String siteLocationID;
    private String streetNumber;
    private String streetsName;
    private String city;
    private String town;
    private String postalCode;

    public SiteLocation() {
    }

    public SiteLocation(Builder builder) {
        this.siteLocationID = builder.siteLocationID;
        this.streetNumber = builder.streetNumber;
        this.streetsName = builder.streetsName;
        this.city = builder.city;
        this.town = builder.town;
        this.postalCode = builder.postalCode;
    }

    public String getSiteLocationID() {
        return siteLocationID;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getStreetsName() {
        return streetsName;
    }

    public String getCity() {
        return city;
    }

    public String getTown() {
        return town;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return "SiteLocation{" +
                "siteLocationID=" + siteLocationID +
                ", streetNumber='" + streetNumber + '\'' +
                ", streetsName='" + streetsName + '\'' +
                ", city='" + city + '\'' +
                ", town='" + town + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }

    @Override
    public int compareTo(SiteLocation o) {
        return this.siteLocationID.compareToIgnoreCase(o.siteLocationID);
    }

    public static class Builder{

        private String siteLocationID;
        private String streetNumber;
        private String streetsName;
        private String city;
        private String town;
        private String postalCode;

        public Builder sitelocationID(String siteLocationID) {
            this.siteLocationID = siteLocationID;
            return this;
        }

        public Builder streetNumber(String streetNumber){
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder streetsName(String streetsName){
            this.streetsName = streetsName;
            return this;
        }

        public Builder city(String city){
            this.city = city;
            return this;
        }

        public Builder town(String town){
            this.town = town;
            return this;
        }
        public Builder postalCode(String postalCode){
            this.postalCode = postalCode;
            return this;
        }

        public Builder copy(SiteLocation siteLocation){
            this.siteLocationID = siteLocation.siteLocationID;
            this.streetNumber = siteLocation.streetNumber;
            this.streetsName = siteLocation.streetsName;
            this.city = siteLocation.city;
            this.town = siteLocation.town;
            this.postalCode = siteLocation.postalCode;
            return this;
        }

        public SiteLocation build() {
            return new SiteLocation(this);
        }

    }
}
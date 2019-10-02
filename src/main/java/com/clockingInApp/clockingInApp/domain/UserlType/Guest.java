package com.clockingInApp.clockingInApp.domain.UserlType;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ChadMarthinussen2 on 2019/04/17.
 */

@Entity
//@Table(name = "Guest")
public class Guest implements Comparable<Guest>{

    @Id
    private int guestAssignedID;

//    @Column(name = "Organization_Name")
    private String organizationsName;

//    @Column(name = "full_Name")
    private String fullName;

//    @Column(name = "contact_Details")
    private String contactDetails;

    private Guest(){
    }

    public Guest(Builder builder) {
        this.organizationsName = builder.organizationsName;
        this.guestAssignedID = builder.guestAssignedID;
        this.fullName = builder.fullName;
        this.contactDetails = builder.contactDetails;

    }

    public String getOrganizationsName() {
        return organizationsName;
    }

    public int getGuestAssignedID() {
        return guestAssignedID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getContactDetails() {
        return contactDetails;
    }


    @Override
    public String toString() {
        return "Guest{" +
                "guestAssignedID=" + guestAssignedID +
                ", organizationsName='" + organizationsName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", contactDetails='" + contactDetails + '\'' +
                '}';
    }

    @Override
    public int compareTo(Guest o) {
        return this.guestAssignedID;
    }

    public static class Builder{

        private String organizationsName;
        @Id
        private int guestAssignedID;
        private String fullName;
        private String contactDetails;

        public Builder organizationsName(String organizationsName){
            this.organizationsName = organizationsName;
            return this;
        }

        public Builder guestAssignedID(int guestAssignedID){
            this.guestAssignedID = guestAssignedID;
            return this;
        }

        public Builder fullName(String fullName){
            this.fullName = fullName;
            return this;
        }

        public Builder contactDetails(String contactDetails){
            this.contactDetails = contactDetails;
            return this;
        }

        public Builder copy(Guest guest) {
            this.organizationsName = guest.organizationsName;
            this.guestAssignedID = guest.guestAssignedID;
            this.fullName = guest.fullName;
            this.contactDetails = guest.contactDetails;
            return this;
        }

        public Guest build() {
            return new Guest(this);
        }
    }
}


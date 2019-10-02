package com.clockingInApp.clockingInApp.domain.UserlType;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ChadMarthinussen2 on 2019/04/10.
 * student number : 208031197
 *
 */
@Entity
public class Staff implements Comparable<Staff>{

    @Id
    private int staffID;
    private String name;
    private String secondName;
    private String lateName;

    private Staff(Builder builder){
        this.staffID = builder.staffID;
        this.name = builder.name;
        this.secondName = builder.secondName;
        this.lateName = builder.lateName;
    }

    public int getStaffID() {
        return staffID;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLateName() {
        return lateName;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffID=" + staffID +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lateName='" + lateName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Staff o) {
        return this.staffID;
    }

    public static class Builder{

        private int staffID;
        private String name;
        private String secondName;
        private String lateName;


        public Builder staffID(int staffID) {
            this.staffID = staffID;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder secondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        public Builder lateName(String lateName) {
            this.lateName = lateName;
            return this;
        }
        

        public Builder copy(Staff staff) {
            this.staffID = staff.staffID;
            this.name = staff.name;
            this.secondName = staff.secondName;
            this.lateName = staff.lateName;
            return this;
        }


        public Staff build() {
            return new Staff(this);
        }
    }
}


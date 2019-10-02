package com.clockingInApp.clockingInApp.domain.UserlType;

import javax.persistence.*;

/**
 * Created by ChadMarthinussen2 on 2019/04/17.
 */

@Entity
public class Administrator implements Comparable<Administrator> {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "Administrator_id")
    private int administratorID;

//    @Column(name = "Is_Administrator")
    private String isAdministrator;

//    @Column(name = "Edit_Rights")
    private String canEdit;

    public Administrator() {
    }

    public Administrator(Builder builder) {
        this.administratorID = builder.administratorID;
        this.isAdministrator = builder.isAdministrator;
        this.canEdit = builder.canEdit;
    }


    public String isAdministrator() {
        return isAdministrator;
    }

    public String getCanEdit() {
        return canEdit;
    }

    public int getAdministratorID() {
        return administratorID;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "administratorID='" + administratorID + '\'' +
                ", isAdministrator=" + isAdministrator +
                ", canEdit=" + canEdit +
                '}';
    }

    @Override
    public int compareTo(Administrator o) {
        return this.administratorID;
    }

    public static class Builder{

        private int administratorID;
        private String isAdministrator;
        private String canEdit;

        public Builder isAdministrator(String isAdministrator){
            this.isAdministrator = isAdministrator;
            return this;
        }

        public Builder canEdit(String canEdit){
            this.canEdit = canEdit;
            return this;
        }

        public Builder administratorID(int administratorID) {
            this.administratorID = administratorID;
            return this;
        }

        public Builder copy(Administrator administrator) {
            this.administratorID = administrator.administratorID;
            this.isAdministrator = administrator.isAdministrator;
            this.canEdit = administrator.canEdit;
            return this;
        }

        public Administrator build() {
            return new Administrator(this);
        }
    }
}

package com.clockingInApp.clockingInApp.domain.AccessTypes;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ChadMarthinussen2 on 2019/04/17.
 */
@Entity
public class Authorization implements Comparable<Authorization> {

        @Id
        private String userTypeID;
        private String verifyUserAccess;

        public Authorization() {
        }

        public Authorization(Builder builder) {
                this.verifyUserAccess = builder.verifyUserAccess;
                this.userTypeID = builder.userTypeID;
        }


        public String isVerifyUserAccess() {
                return verifyUserAccess;
        }

        public String getUserTypeID() {
                return userTypeID;
        }

        @Override
        public String toString() {
                return "Authorization{" +
                        "verifyUserAccess=" + verifyUserAccess +
                        ", userTypeID='" + userTypeID + '\'' +
                        '}';
        }

        @Override
        public int compareTo(Authorization o) {
                return this.userTypeID.compareToIgnoreCase(o.userTypeID);
        }


        public static class Builder{

                private String verifyUserAccess;
                private String userTypeID;


                public Builder verifyUserAccess(String verifyUserAccess) {
                        this.verifyUserAccess = verifyUserAccess;
                        return this;
                }

                public Builder userTypeID(String userTypeID) {
                        this.userTypeID = userTypeID;
                        return this;
                }

                public Builder copy(Authorization authorization){
                        this.verifyUserAccess  = authorization.verifyUserAccess;
                        this.userTypeID = authorization.userTypeID;
                        return this;
                }

                public Authorization build(){
                        return new Authorization(this);
                }
        }
}

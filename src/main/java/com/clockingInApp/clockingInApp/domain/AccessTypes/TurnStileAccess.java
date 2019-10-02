package com.clockingInApp.clockingInApp.domain.AccessTypes;

import com.clockingInApp.clockingInApp.misc.Time;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ChadMarthinussen2 on 2019/04/29.
 */
@Entity
public class TurnStileAccess implements Comparable<TurnStileAccess>{

    @Id
    private String turnStileAccessID;
    private String validUserAccess;
//    private Time clockingTimes;

    public TurnStileAccess(Builder builder) {
        this.turnStileAccessID = builder.turnStileAccessID;
        this.validUserAccess = builder.validUserAccess;
//        this.clockingTimes = builder.clockingTimes;
    }


    public String getTurnStileAccessID() {
        return turnStileAccessID;
    }

    public String isValidUserAccess() {
        return validUserAccess;
    }

    @Override
    public int compareTo(TurnStileAccess o) {
        return this.turnStileAccessID.compareToIgnoreCase(o.turnStileAccessID);
    }

//    public Time getClockingTimes() {
//        return clockingTimes;
//    }



    public static class Builder{

        private String turnStileAccessID;

        @Override
        public String toString() {
            return "Builder{" +
                    "turnStileAccessID='" + turnStileAccessID + '\'' +
                    ", validUserAccess='" + validUserAccess + '\'' +
                    ", clockingTimes=" + clockingTimes +
                    '}';
        }

        private String validUserAccess;
        private Time clockingTimes;

        public Builder turnStileAccessID(String turnStileAccessID) {
            this.turnStileAccessID = turnStileAccessID;
            return this;
        }

        public Builder validUserAccess(String validUserAccess) {
            this.validUserAccess = validUserAccess;
            return this;
        }

//        public Builder clockingTimes(Time clockingTimes) {
//            this.clockingTimes = clockingTimes;
//            return this;
//        }

        public Builder copy(TurnStileAccess turnStileAccess ){
            this.turnStileAccessID = turnStileAccess.turnStileAccessID;
            this.validUserAccess = turnStileAccess.validUserAccess;
//            this.clockingTimes = turnStileAccess.clockingTimes;
            return this;
        }

        public TurnStileAccess build(){
            return new TurnStileAccess(this);
        }
    }
}

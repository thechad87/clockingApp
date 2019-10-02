package com.clockingInApp.clockingInApp.domain.UserlType;

import javax.persistence.*;

/**
 * Created by ChadMarthinussen2 on 2019/04/17.
 */
@Entity
@Table(name= "Contractor")
public class Contractor implements Comparable<Contractor> {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "contractor_Id")
    private int contractorID;

//    @Column(name = "isContractor")
    private String isContactor;
//    @Column(name = "time_period")
    private String timePeriodMonths;


    public Contractor() {
    }

    public Contractor(Builder builder) {
        this.isContactor = builder.isContactor;
        this.timePeriodMonths = builder.timePeriodMonths;
        this.contractorID = builder.contractorID;
    }

    public String isContactor() {
        return isContactor;
    }

    public String getTimePeriodMonths() {
        return timePeriodMonths;
    }

    public int getContractorID() {
        return contractorID;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "contractorID=" + contractorID +
                ", isContactor='" + isContactor + '\'' +
                ", timePeriodMonths='" + timePeriodMonths + '\'' +
                '}';
    }

    @Override
    public int compareTo(Contractor o) {
        return this.contractorID;
    }

    public static class Builder{

        private String isContactor;
        private String timePeriodMonths;
        private int contractorID;


        public Builder isContactor(String isContactor){
            this.isContactor = isContactor;
            return this;
        }

        public Builder timePeriodMonths(String timePeriodMonths){
            this.timePeriodMonths = timePeriodMonths;
            return this;
        }

        public Builder contractorID(int contractorID){
            this.contractorID = contractorID;
            return this;
        }

        public Builder copy(Contractor contractor) {
            this.isContactor = contractor.isContactor;
            this.timePeriodMonths = contractor.timePeriodMonths;
            this.contractorID = contractor.contractorID;
            return this;
        }

        public Contractor build() {
            return new Contractor(this);
        }
    }
}


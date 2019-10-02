package com.clockingInApp.clockingInApp.domain.Alerts;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ChadMarthinussen2 on 2019/09/14.
 */
@Entity
public class Notices implements Comparable<Notices> {

    @Id
    private String noticeID;
    private String noticeType;
    private String noticeDescription;

    public Notices(String noticeID, String noticeDescription) {
        this.noticeID = noticeID;
        this.noticeDescription = noticeDescription;
        this.noticeType = noticeType;

    }

    public Notices(Builder builder) {
        this.noticeID = builder.noticeID;
        this.noticeType = builder.noticeType;
        this.noticeDescription = builder.noticeDescription;
    }

    public String getNoticeID() {
        return noticeID;
    }

    public String getNoticeType() {
        return noticeID;
    }

    public String getNoticeDescription() {
        return noticeDescription;
    }

    @Override
    public String toString() {
        return "Notices{" +
                "noticeID='" + noticeID + '\'' +
                ", noticeType='" + noticeType + '\'' +
                ", noticeDescription='" + noticeDescription + '\'' +
                '}';
    }

    @Override
    public int compareTo(Notices o) {
        return this.noticeID.compareToIgnoreCase(o.noticeID);
    }

    public static class Builder{

        private String noticeID;
        private String noticeType;
        private String noticeDescription;

        public Builder NoticeID(String noticeID){
            this.noticeID = noticeID;
            return this;
        }

        public Builder noticeType(String noticeType){
            this.noticeType = noticeType;
            return this;
        }

        public Builder noticeDescription(String noticeDescription){
            this.noticeDescription = noticeDescription;
            return this;
        }

        public Notices build(){
            return new Notices(this);
        }
        public Builder copy(Notices notices){
            this.noticeID = notices.noticeID;
            this.noticeType = notices.noticeType;
            this.noticeDescription = notices.noticeDescription;
            return this;
        }

    }
}

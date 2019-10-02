package com.clockingInApp.clockingInApp.factory;

import com.clockingInApp.clockingInApp.domain.Alerts.Notices;

/**
 * Created by ChadMarthinussen2 on 2019/09/14.
 */
public class NoticesFactory {

    public static Notices buildNotices(String noticeID, String noticeType, String noticeDescription){
        return new Notices.Builder().NoticeID(noticeID).noticeType(noticeID).noticeDescription(noticeDescription).build();
    }
}


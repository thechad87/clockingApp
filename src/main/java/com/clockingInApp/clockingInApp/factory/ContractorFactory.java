package com.clockingInApp.clockingInApp.factory;


import com.clockingInApp.clockingInApp.domain.UserlType.Contractor;

/**
 * Created by ChadMarthinussen2 on 2019/04/17.
 */
public class ContractorFactory {

        public static Contractor buildContractor(String isContactor, String timePeriodMonths, Integer contractorID){
            return new Contractor.Builder().isContactor(isContactor).timePeriodMonths(timePeriodMonths).contractorID(contractorID).build();
        }

}


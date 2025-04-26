package com.example.demo.service;

import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.example.MySciencePlan;
import edu.gemini.app.ocs.model.SciencePlan;
import org.springframework.stereotype.Service;

@Service
public class SciencePlanService {

    private static final OCS ocs = new OCS(true);

    public void createSciencePlan(SciencePlan sciencePlan) {
        // แปลงจาก SciencePlan เป็น MySciencePlan แล้วส่งเข้า OCS
        MySciencePlan mySP = new MySciencePlan();
        mySP.setCreator(sciencePlan.getCreator());
        mySP.setSubmitter(sciencePlan.getSubmitter());
        mySP.setFundingInUSD(sciencePlan.getFundingInUSD());
        mySP.setObjectives(sciencePlan.getObjectives());
        mySP.setStarSystem(sciencePlan.getStarSystem());
        mySP.setStartDate(sciencePlan.getStartDate());
        mySP.setEndDate(sciencePlan.getEndDate());
        mySP.setTelescopeLocation(sciencePlan.getTelescopeLocation());
        if (sciencePlan.getDataProcRequirements() != null && !sciencePlan.getDataProcRequirements().isEmpty()) {
            mySP.setDataProcRequirements(sciencePlan.getDataProcRequirements().get(0)); // เอาตัวแรก
        }
        ocs.createSciencePlan(mySP);
    }

    public boolean testSciencePlan(int id) {
        SciencePlan sp = ocs.getSciencePlanByNo(id);
        return "pass".equalsIgnoreCase(ocs.testSciencePlan(sp));    }

    public void submitSciencePlan(int id) {
        ocs.updateSciencePlanStatus(id, SciencePlan.STATUS.SUBMITTED);
    }
}

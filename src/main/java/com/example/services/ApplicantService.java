package com.example.services;

import com.example.entities.ApplicantEntity;
import com.example.models.ApplicantModel;
import com.example.repositories.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ApplicantService {

    @Autowired
    private ApplicantRepository applicantRepository;

    public ApplicantEntity saveApplicantDetails(ApplicantModel applicantModel) {
        ApplicantEntity applicantEntity = getApplicantEntityFromModel(applicantModel);
        return applicantRepository.save(applicantEntity);
    }

    public ApplicantEntity getApplicantEntityFromModel(ApplicantModel applicantModel) {
        ApplicantEntity applicantEntity = new ApplicantEntity();
        applicantEntity.setFirstName(applicantModel.getFirstName());
        applicantEntity.setLastName(applicantModel.getLastName());
        applicantEntity.setPhnumber(applicantModel.getPhnumber());
        return applicantEntity;
    }
}

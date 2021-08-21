package com.example.services;

import com.example.entities.ApplicationStatusEntity;
import com.example.models.ApplicationModel;
import com.example.repositories.ApplicantStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantStatusService {

    @Autowired
    private ApplicantStatusRepository applicantStatusRepository;

    public ApplicationStatusEntity saveApplicantStatus(ApplicationModel applicationModel) {
        ApplicationStatusEntity applicationStatus = getApplicantStatusEntity(applicationModel);
        return applicantStatusRepository.save(applicationStatus);
    }

    public List<ApplicationStatusEntity> getApplicantsByStatus(String status){
        return applicantStatusRepository.findByStatus(status);
    }

    public ApplicationStatusEntity getApplicantStatusEntity(ApplicationModel applicationModel) {
        ApplicationStatusEntity applicationStatus = new ApplicationStatusEntity();
        applicationStatus.setStatus(applicationModel.getStatus());
        applicationStatus.setApplicantId(applicationModel.getApplicantId());
        return applicationStatus;

    }

}

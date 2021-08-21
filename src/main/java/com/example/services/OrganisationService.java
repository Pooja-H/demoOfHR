package com.example.services;

import com.example.entities.OrganisationEntity;
import com.example.models.OrganisationModel;
import com.example.repositories.OrganisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganisationService {
    @Autowired
    private OrganisationRepository organisationRepository;

    public OrganisationEntity saveOrganisationDetails(OrganisationModel organisationModel) {
        OrganisationEntity organisationEntity = getOrganisationEntity(organisationModel);
        return organisationRepository.save(organisationEntity);

    }

    public List<OrganisationEntity> getOrganisationDetailsById(int id) {
        return organisationRepository.findById(id);
    }

    public OrganisationEntity getOrganisationEntity(OrganisationModel organisationModel) {
        OrganisationEntity organisationEntity = new OrganisationEntity();
        organisationEntity.setName(organisationModel.getName());
        return organisationEntity;
    }
}

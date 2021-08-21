package com.example.repositories;

import com.example.entities.OrganisationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrganisationRepository extends JpaRepository<OrganisationEntity, Long> {

    List<OrganisationEntity> findById(int id);
}

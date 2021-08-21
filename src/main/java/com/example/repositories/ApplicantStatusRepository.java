package com.example.repositories;

import com.example.entities.ApplicationStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApplicantStatusRepository extends JpaRepository<ApplicationStatusEntity, Long> {
    List<ApplicationStatusEntity> findByStatus(String status);
}

package com.example.controller;

import com.example.models.ApplicantModel;
import com.example.services.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping(path = "/v1/applicant")
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;

    @PostMapping
    public ResponseEntity<?> createApplicant(@RequestBody ApplicantModel applicantModel) {

        if (Objects.isNull(applicantModel))
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Request Body is missing");
        else
            return new ResponseEntity<>(applicantService.saveApplicantDetails(applicantModel), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> updateApplicant(@RequestBody ApplicantModel applicantModel) {
        if (Objects.isNull(applicantModel))
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Request Body is missing");
        else
            return new ResponseEntity<>(applicantService.saveApplicantDetails(applicantModel), HttpStatus.OK);
    }
}

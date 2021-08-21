package com.example.controller;

import com.example.models.ApplicationModel;
import com.example.services.ApplicantStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Objects;

@RestController
@RequestMapping(path = "/v1/applicantStatus")
public class ApplicantStatusController {

    @Autowired
    public ApplicantStatusService applicantStatusService;

    @PostMapping
    public ResponseEntity<?> saveApplicationDetails(@RequestBody ApplicationModel applicationModel) {
        if (Objects.isNull(applicationModel))
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Request Body is missing");
        else
            return new ResponseEntity<>(applicantStatusService.saveApplicantStatus(applicationModel), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> updateApplicationDetails(@RequestBody ApplicationModel applicationModel) {
        if (Objects.isNull(applicationModel))
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Request Body is missing");
        else
            return new ResponseEntity<>(applicantStatusService.saveApplicantStatus(applicationModel), HttpStatus.OK);
    }

    @GetMapping(value = "/{status}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getApplicantsByStatus(@PathParam("status") String status) {
        return new ResponseEntity<>(applicantStatusService.getApplicantsByStatus(status), HttpStatus.OK);
    }
}

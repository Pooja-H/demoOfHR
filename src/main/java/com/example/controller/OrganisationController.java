package com.example.controller;

import com.example.models.OrganisationModel;
import com.example.services.OrganisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping(path = "/v1/organisation")
public class OrganisationController {
    @Autowired
    private OrganisationService organisationService;

    @PostMapping
    public ResponseEntity<?> saveOrganisationDetails(@RequestBody OrganisationModel organisationModel) {

        if (Objects.isNull(organisationModel))
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Request Body is missing");
        else
            return new ResponseEntity<>(organisationService.saveOrganisationDetails(organisationModel), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> updateOrganisationDetails(@RequestBody OrganisationModel organisationModel) {
        if (Objects.isNull(organisationModel))
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Request Body is missing");
        else
            return new ResponseEntity<>(organisationService.saveOrganisationDetails(organisationModel), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getOrgDetailsById(@PathVariable("id") int id) {
        return new ResponseEntity<>(organisationService.getOrganisationDetailsById(id), HttpStatus.OK);
    }
}

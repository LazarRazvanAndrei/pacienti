package com.sda.patiemtportal.controller;


import com.sda.patiemtportal.model.Patient;
import com.sda.patiemtportal.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/patients")
public class PatientController {


////    @GetMapping(value = "/demo", method = RequestMethod.GET) -- sama as below
//    @GetMapping(value = "/demo")
//    public String demo(){
//        return "HTTP return get ...";
//    }
//
//    @PostMapping(value = "/demo")
//    public String demo2(){
//        return "HTTP return post";
//    }
//
//    @PutMapping(value = "/demo")
//    public String demo3(@RequestBody String message){
//        return "text de verificat: " + message;
//    }

//    sau asa
//    @PutMapping(value = "/demo",consumes = "application/json", produces = "application/json")


    private PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService){
        this.patientService = patientService;
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient){
        return patientService.create(patient);
    }

    @GetMapping
    public List<Patient> getPatients(){
        return patientService.getAllPatiets();
    }

    @GetMapping(value = "/{id}")
    public Patient getPatientById(@PathVariable Long id){
        return patientService.getById(id);
    }

    @PutMapping(value =  "/{id}")
    public Patient updatePacient(@PathVariable Long id, @RequestBody Patient patient){
        if (id != patient.getId()){
            return null;
        }
        return patientService.updatePacient(patient);
    }

    @DeleteMapping(value = "/{id}")
    public void  deletePatient(@PathVariable Long id){
        patientService.deleteById(id);
    }










}

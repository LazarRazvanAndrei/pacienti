package com.sda.patiemtportal.service;

import com.sda.patiemtportal.model.Patient;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {



    public Patient create(Patient patient){
        System.out.println("Pacient creat");
        return patient;
    }

    public List<Patient> getAllPatiets(){
        System.out.println("return patients");
        return new ArrayList<>();
    }

    public Patient getById(Long indice){
        return new Patient("Eu", "bubu", 1l);
    }

    public Patient updatePacient(Patient patient){
        System.out.println("update patient");
        return patient;
    }

    public Patient deleteById(Long indice){
        System.out.println("patient deleted");
        return null;
    }





}

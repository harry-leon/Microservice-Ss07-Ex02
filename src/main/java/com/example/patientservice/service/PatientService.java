package com.example.patientservice.service;

import com.example.patientservice.dto.PatientRequest;
import com.example.patientservice.entity.Patient;

import java.util.List;

public interface PatientService {
    Patient createPatient(PatientRequest request);
    Patient createPatient(Patient patient);
    List<Patient> getAllPatients();
    Patient getPatientById(Long id);
}

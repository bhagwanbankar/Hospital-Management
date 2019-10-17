package org.bhagwan.hospital.service;

import java.util.List;

import org.bhagwan.hospital.entity.Patient;

public interface PatientService {

	public List<Patient> findAll();

	public Patient save(Patient newPatient);

	public Patient findById(Long id);

	public Patient update(Patient newPatient);

	public void deleteById(Long id);

}

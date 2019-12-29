package org.bhagwan.hospital.service;

import java.util.List;
import java.util.Optional;

import org.bhagwan.hospital.entity.Patient;
import org.bhagwan.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository patientRepository;
	
	@Override
	public List<Patient> findAll() {
		
		return patientRepository.findAll();
	}

	@Override
	public Patient save(Patient newPatient) {
		return patientRepository.save(newPatient);
	}

	@Override
	public Optional<Patient> findById(Long id) {
		return patientRepository.findById(id);
	}

	@Override
	public Patient update(Patient newPatient) {
		return patientRepository.save(newPatient);
	}

	@Override
	public void deleteById(Long id) {
		patientRepository.deleteById(id);
	}

}

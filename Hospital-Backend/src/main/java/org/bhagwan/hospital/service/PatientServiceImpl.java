package org.bhagwan.hospital.service;

import java.util.Date;
import java.util.List;

import org.bhagwan.hospital.entity.Address;
import org.bhagwan.hospital.entity.Patient;
import org.bhagwan.hospital.enums.Gender;
import org.bhagwan.hospital.enums.MaritalStatus;
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
	public Patient findById(Long id) {
		Address address = new Address(new Long(1), "line1", "line2", "city", "district", "state","pincode");
		Patient p = new Patient(id, "firstName", "lastName", address, new Date(), new Date(), "email", new Long("9988112233"), Gender.Male, MaritalStatus.Married);
		//return patientRepository.findById(id).get();
		return p;
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

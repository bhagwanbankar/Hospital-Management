package org.bhagwan.hospital.controller;

import java.util.List;

import org.bhagwan.hospital.entity.Patient;
import org.bhagwan.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "hospital")
@CrossOrigin(origins = "http://localhost:4200")
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@GetMapping(value = "/patients")
	public List<Patient> getAllPatientRecords(){
		return patientService.findAll();
		
	}
	
	@PostMapping(value = "/patients")
	public Patient createOrSavePatient(@RequestBody Patient newPatient) {
		return patientService.save(newPatient);
	}
	
	@GetMapping(value="/patients/{id}")
	public Patient getPatientById(@PathVariable Long id) {
		return patientService.findById(id);
	}
	
	@PutMapping(value="/patients/{id}")
	public Patient updatePatient(@RequestBody Patient newPatient, @PathVariable Long id) {
		return patientService.update(newPatient);
	}
	
	@DeleteMapping(value="/patients/{id}")
	public Patient deletePatient(@PathVariable Long id) {
		patientService.deleteById(id);
		return null;
	}
	
}

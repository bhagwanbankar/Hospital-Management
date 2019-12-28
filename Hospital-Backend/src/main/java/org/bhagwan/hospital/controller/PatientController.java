package org.bhagwan.hospital.controller;

import java.net.URI;
import java.util.List;

import org.bhagwan.hospital.entity.Patient;
import org.bhagwan.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	public 	ResponseEntity<Void> createOrSavePatient(@RequestBody Patient newPatient) {
		
		Patient p = patientService.save(newPatient);
		
		//get current resource uri
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(p.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@GetMapping(value="/patients/{id}")
	public Patient getPatientById(@PathVariable Long id) {
		return patientService.findById(id);
	}
	
	@PutMapping(value="/patients/{id}")
	public ResponseEntity<Patient> updatePatient(@RequestBody Patient newPatient, @PathVariable Long id) {
		
		patientService.update(newPatient);		
		return new ResponseEntity<Patient>(newPatient,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/patients/{id}")
	public ResponseEntity<Void> deletePatient(@PathVariable Long id) {
		
		if(patientService.findById(id)==null)
			return ResponseEntity.notFound().build();
		
		patientService.deleteById(id);	
		
		return ResponseEntity.noContent().build();
	}
	
}

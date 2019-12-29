package org.bhagwan.hospital.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.bhagwan.hospital.entity.Medicine;
import org.bhagwan.hospital.service.MedicineService;
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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MedicineController {

	@Autowired
	private MedicineService medicineService;
	
	@GetMapping(value = "/medicines")
	public List<Medicine> getAllPatientRecords(){
		return medicineService.findAll();
		
	}
	
	@PostMapping(value = "/medicines")
	public 	ResponseEntity<Void> createOrSavePatient(@RequestBody Medicine newMedicine) {
		
		Medicine m = medicineService.save(newMedicine);
		
		//get current resource uri
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(m.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@GetMapping(value="/medicines/{id}")
	public ResponseEntity<Medicine> getPatientById(@PathVariable Long id) {
		Optional<Medicine> findById = medicineService.findById(id);
		if(findById.isPresent())
			new ResponseEntity<Medicine>(findById.get(),HttpStatus.OK);
		return ResponseEntity.notFound().build(); 
	}
	
	@PutMapping(value="/medicines/{id}")
	public ResponseEntity<Medicine> updatePatient(@RequestBody Medicine newMedicine, @PathVariable Long id) {
		
		medicineService.update(newMedicine);		
		return new ResponseEntity<>(newMedicine,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/medicines/{id}")
	public ResponseEntity<Void> deletePatient(@PathVariable Long id) {
		
		if(!medicineService.findById(id).isPresent())
			return ResponseEntity.notFound().build();
		
		medicineService.deleteById(id);	
		
		return ResponseEntity.noContent().build();
	}

	
}

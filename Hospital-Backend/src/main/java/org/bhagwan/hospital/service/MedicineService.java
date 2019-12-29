package org.bhagwan.hospital.service;

import java.util.List;
import java.util.Optional;

import org.bhagwan.hospital.entity.Medicine;

public interface MedicineService {

	public List<Medicine> findAll();

	public Medicine save(Medicine medicine);

	public Optional<Medicine> findById(Long id);

	public Medicine update(Medicine newPatient);

	public void deleteById(Long id);

}

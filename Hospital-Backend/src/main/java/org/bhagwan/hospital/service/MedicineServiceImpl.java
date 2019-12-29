package org.bhagwan.hospital.service;

import java.util.List;
import java.util.Optional;

import org.bhagwan.hospital.entity.Medicine;
import org.bhagwan.hospital.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicineServiceImpl implements MedicineService {

	@Autowired
	private MedicineRepository medicineRepository;
	
	@Override
	public List<Medicine> findAll() {
		
		return medicineRepository.findAll();
	}

	@Override
	public Medicine save(Medicine newMedicine) {
		return medicineRepository.save(newMedicine);
	}

	@Override
	public Optional<Medicine> findById(Long id) {
		return medicineRepository.findById(id);
	}

	@Override
	public Medicine update(Medicine newMedicine) {
		return medicineRepository.save(newMedicine);
	}

	@Override
	public void deleteById(Long id) {
		medicineRepository.deleteById(id);
	}

}

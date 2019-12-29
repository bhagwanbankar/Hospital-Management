package org.bhagwan.hospital.repository;

import org.bhagwan.hospital.entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository<Medicine, Long>{

}

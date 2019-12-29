package org.bhagwan.hospital.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Medicine")
public class Medicine {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String medicineType;
	private String medicineName;
	private String company;
	private String timeInterval;
	private String amoutPerInterval;
	private String instruction;
	private String quantity;
	private String duration;
	
	public Medicine() {
	}

	public Medicine(String type, String name, String company, String timeInterval, String amoutPerInterval,
			String instruction, String quantity, String duration) {
		super();
		this.medicineType = type;
		this.medicineName = name;
		this.company = company;
		this.timeInterval = timeInterval;
		this.amoutPerInterval = amoutPerInterval;
		this.instruction = instruction;
		this.quantity = quantity;
		this.duration = duration;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMedicineType() {
		return medicineType;
	}

	public void setMedicineType(String medicineType) {
		this.medicineType = medicineType;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getTimeInterval() {
		return timeInterval;
	}

	public void setTimeInterval(String timeInterval) {
		this.timeInterval = timeInterval;
	}

	public String getAmoutPerInterval() {
		return amoutPerInterval;
	}

	public void setAmoutPerInterval(String amoutPerInterval) {
		this.amoutPerInterval = amoutPerInterval;
	}

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Medicine [id=" + id + ", medicineType=" + medicineType + ", medicineName=" + medicineName + ", company="
				+ company + ", timeInterval=" + timeInterval + ", amoutPerInterval=" + amoutPerInterval
				+ ", instruction=" + instruction + ", quantity=" + quantity + ", duration=" + duration + "]";
	}

		
	
	
	
}

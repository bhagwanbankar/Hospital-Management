package org.bhagwan.hospital.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.bhagwan.hospital.enums.Gender;
import org.bhagwan.hospital.enums.MaritalStatus;

@Entity
@Table(name="Patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String firstName;
	private String lastName;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="ADDRESS_ID")	
	private Address address;
	
	private Date dob;
	private Date registrationDate;
	private String email;
	private long mobileNo;
	
	private Gender gender;
	private MaritalStatus maritalStatus;
	
	public Patient() {
	}
	
	public Patient(Long id, String firstName, String lastName, Address address, Date dob, Date registrationDate,
			String email, long mobileNo, Gender gender, MaritalStatus maritalStatus) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.dob = dob;
		this.registrationDate = registrationDate;
		this.email = email;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", dob=" + dob + ", registrationDate=" + registrationDate + ", email=" + email + ", mobileNo="
				+ mobileNo + ", gender=" + gender + ", maritalStatus=" + maritalStatus + "]";
	}
	
	
	
	

}

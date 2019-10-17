package org.bhagwan.hospital.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long addressId;
	
	private String line1;
	private String line2;
	private String city;
	private String district;
	private String state;
	private String pincode;
	
	
	public Address() {
	}
	
	public Address(Long addressId, String line1, String line2, String city, String district, String state,
			String pincode) {
		super();
		this.addressId = addressId;
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", line1=" + line1 + ", line2=" + line2 + ", city=" + city
				+ ", district=" + district + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
	
	
	
}

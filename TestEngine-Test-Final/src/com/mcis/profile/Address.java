package com.mcis.profile;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class Address {
	private String doorNumber;
	private String streetName;
	private String location;
	private String city;
	private int pincode;

	public Address() {
		super();
	}

	public Address(String doorNumber, String streetName, String location, String city, int pincode) {
		super();
		this.doorNumber = doorNumber;
		this.streetName = streetName;
		this.location = location;
		this.city = city;
		this.pincode = pincode;
	}

	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}

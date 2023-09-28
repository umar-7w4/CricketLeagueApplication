package com.cg.cla.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 
{
	"pincode" : 578776,
	"city" : "chennai",
	"state" : "Tamil nadhu",
	"country" : "India"
}

 */

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	private int pincode;
	private String city;
	private String state;
	private String country;
	
	public Address() {
		super();
	}

	public Address(int addressId, int pincode, String city, String state, String country) {
		super();
		this.addressId = addressId;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	


}

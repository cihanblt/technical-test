package com.cihanblt.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="address")
public class Address {
	@Id
	@GeneratedValue
	@Column(name="record_id")
	private int id;
	@Column(name="house_number")	
	private int houseNumber;
	@Column(name="street_name")
	private String streetName;
	@Column(name="city")
	private String city;
	@ManyToOne
	private Person person;
	
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}

package com.cihanblt.models;

public class Address {
	
	private long id;
	private long houseNumber;
	private String streetName;
	private String city;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(long houseNumber) {
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

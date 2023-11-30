package com.muthu;

public class Address {
	private String Street;
	private String  city;
	private String state;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String city, String state) {
		super();
		Street = street;
		this.city = city;
		this.state = state;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
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
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", city=" + city + ", state=" + state + "]";
	}
	
	}



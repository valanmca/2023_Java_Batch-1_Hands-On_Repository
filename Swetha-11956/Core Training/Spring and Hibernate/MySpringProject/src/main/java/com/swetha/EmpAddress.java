package com.swetha;

public class EmpAddress {

	private String city;
	private String state;
	
	
	public EmpAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmpAddress(String city, String state) {
		super();
		this.city = city;
		this.state = state;
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
		return "[city=" + city + ", state=" + state + "]";
	}
	
	
	
	
	
	
}

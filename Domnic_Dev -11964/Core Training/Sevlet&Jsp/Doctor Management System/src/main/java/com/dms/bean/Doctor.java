package com.dms.bean;

public class Doctor {

	private int dId;
	private String dName;
	private int dAge;
	private String dEmail;
	private String dSpecialization;
	private int dPhoneNumber;
	private String dLocation;
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(int dId, String dName, int dAge, String dEmail, String dSpecialization, int dPhoneNumber,
			String dLocation) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dAge = dAge;
		this.dEmail = dEmail;
		this.dSpecialization = dSpecialization;
		this.dPhoneNumber = dPhoneNumber;
		this.dLocation = dLocation;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public int getdAge() {
		return dAge;
	}

	public void setdAge(int dAge) {
		this.dAge = dAge;
	}

	public String getdEmail() {
		return dEmail;
	}

	public void setdEmail(String dEmail) {
		this.dEmail = dEmail;
	}

	public String getdSpecialization() {
		return dSpecialization;
	}

	public void setdSpecialization(String dSpecialization) {
		this.dSpecialization = dSpecialization;
	}

	public int getdPhoneNumber() {
		return dPhoneNumber;
	}

	public void setdPhoneNumber(int dPhoneNumber) {
		this.dPhoneNumber = dPhoneNumber;
	}

	public String getdLocation() {
		return dLocation;
	}

	public void setdLocation(String dLocation) {
		this.dLocation = dLocation;
	}
	
	
}

package com.dms.bean;

public class Doctor {
	
	private int doctorId;
	private String doctorName;
	private int doctorAge;
	private String doctorEmail;
	private String doctorSpecialization;
	private String doctorContact;
	private String doctorLocation;
	
	
	public Doctor() {
		super();
		
	}


	public Doctor(int doctorId, String doctorName, int doctorAge, String doctorEmail, String doctorSpecialization,
			String doctorContact, String doctorLocation) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorAge = doctorAge;
		this.doctorEmail = doctorEmail;
		this.doctorSpecialization = doctorSpecialization;
		this.doctorContact = doctorContact;
		this.doctorLocation = doctorLocation;
	}


	public int getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public int getDoctorAge() {
		return doctorAge;
	}


	public void setDoctorAge(int doctorAge) {
		this.doctorAge = doctorAge;
	}


	public String getDoctorEmail() {
		return doctorEmail;
	}


	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}


	public String getDoctorSpecialization() {
		return doctorSpecialization;
	}


	public void setDoctorSpecialization(String doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}


	public String getDoctorContact() {
		return doctorContact;
	}


	public void setDoctorContact(String doctorContact) {
		this.doctorContact = doctorContact;
	}


	public String getDoctorLocation() {
		return doctorLocation;
	}


	public void setDoctorLocation(String doctorLocation) {
		this.doctorLocation = doctorLocation;
	}
	
}

 
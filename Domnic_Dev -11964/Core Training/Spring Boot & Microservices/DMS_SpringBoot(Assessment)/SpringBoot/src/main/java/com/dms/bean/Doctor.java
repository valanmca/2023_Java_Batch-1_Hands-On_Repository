package com.dms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_doctor")
public class Doctor {

	@Id
	@Column(name="d_id")
	private int dId;
	
	@Column(name="d_name")
	private String dName;
	
	@Column(name="d_age")
	private int dAge;
	
	@Column(name="d_email")
	private String dEmail;
	
	@Column(name="d_specialization")
	private String dSpecialization;
	
	@Column(name="d_phno")
	private int dPhno;
	
	@Column(name="d_location")
	private String dLocation;

	
	
	public Doctor() {
		super();
	}

	public Doctor(int dId, String dName, int dAge, String dEmail, String dSpecialization, int dPhno, String dLocation) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dAge = dAge;
		this.dEmail = dEmail;
		this.dSpecialization = dSpecialization;
		this.dPhno = dPhno;
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

	public int getdPhno() {
		return dPhno;
	}

	public void setdPhno(int dPhno) {
		this.dPhno = dPhno;
	}

	public String getdLocation() {
		return dLocation;
	}

	public void setdLocation(String dLocation) {
		this.dLocation = dLocation;
	}

}

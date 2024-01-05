package com.dms.bean;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_dms")
public class Doctor {
	
	@Id
	@Column(name="doc_id")
	private int doctorId;
	
	@Column(name="doc_name")
	private String doctorName;
	
	@Column(name="doc_specialist")
	private String doctorSpecialist;
	
	@Column(name="doc_salary")
	private int doctorSalary;
	
	public Doctor() {
		super();
	}
	
	public Doctor(int doctorId, String doctorName, String doctorSpecialist, int doctorSalary) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorSpecialist = doctorSpecialist;
		this.doctorSalary = doctorSalary;
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
	public String getDoctorSpecialist() {
		return doctorSpecialist;
	}
	public void setDoctorSpecialist(String doctorSpecialist) {
		this.doctorSpecialist = doctorSpecialist;
	}
	public int getDoctorSalary() {
		return doctorSalary;
	}
	public void setDoctorSalary(int doctorSalary) {
		this.doctorSalary = doctorSalary;
	}
	
	

}

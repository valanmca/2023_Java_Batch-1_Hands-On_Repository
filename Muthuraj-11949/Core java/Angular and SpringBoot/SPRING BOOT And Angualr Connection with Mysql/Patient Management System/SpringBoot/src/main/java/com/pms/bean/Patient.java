package com.pms.bean;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name ="pat_table8")
public class Patient {
	
	@Id
	@Column(name="pat_id")
	private int patId;
	
	@Column(name="pat_name")
	private String patName;
	
	@Column(name="pat_email")
	private String patEmail;
	
	@Column(name="pat_blood_group")
	private String patBloodGroup;
	
	@Column(name="pat_phonenumber")
	private Long patPhonenumber;
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(int patId, String patName, String patEmail, String patBloodGroup, Long patPhonenumber) {
		super();
		this.patId = patId;
		this.patName = patName;
		this.patEmail = patEmail;
		this.patBloodGroup = patBloodGroup;
		this.patPhonenumber = patPhonenumber;
	}

	public int getPatId() {
		return patId;
	}

	public void setPatId(int patId) {
		this.patId = patId;
	}

	public String getPatName() {
		return patName;
	}

	public void setPatName(String patName) {
		this.patName = patName;
	}

	public String getPatEmail() {
		return patEmail;
	}

	public void setPatEmail(String patEmail) {
		this.patEmail = patEmail;
	}

	public String getPatBloodGroup() {
		return patBloodGroup;
	}

	public void setPatBloodGroup(String patBloodGroup) {
		this.patBloodGroup = patBloodGroup;
	}

	public Long getPatPhonenumber() {
		return patPhonenumber;
	}

	public void setPatPhonenumber(Long patPhonenumber) {
		this.patPhonenumber = patPhonenumber;
	}
	
}

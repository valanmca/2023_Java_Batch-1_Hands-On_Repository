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
	private int  dID;
	
	@Column(name="d_name")
	private String dName;
	
	@Column(name="d_department")
	private String dDept;
	
	@Column(name="d_salary")
	private int dSalary;
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Doctor(int dID, String dName, String dDept, int dSalary) {
		super();
		this.dID = dID;
		this.dName = dName;
		this.dDept = dDept;
		this.dSalary = dSalary;
	}


	public int getdID() {
		return dID;
	}


	public void setdID(int dID) {
		this.dID = dID;
	}


	public String getdName() {
		return dName;
	}


	public void setdName(String dName) {
		this.dName = dName;
	}


	public String getdDept() {
		return dDept;
	}


	public void setdDept(String dDept) {
		this.dDept = dDept;
	}


	public int getdSalary() {
		return dSalary;
	}


	public void setdSalary(int dSalary) {
		this.dSalary = dSalary;
	}
	
	
	
	
	

}

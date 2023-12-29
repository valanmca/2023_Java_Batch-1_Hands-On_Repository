package com.matthew.bean;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_employee")
public class Employee {
    
	@Id
	@Column(name="eId")
	private int eId;
	@Column(name="eName")
	private String eName;
	@Column(name = "eSalary")
	private int eSalary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Employee(int eId, String eName, int eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
	}



	public int geteId() {
		return eId;
	}
	
	
	

	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteSalary() {
		return eSalary;
	}
	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}
	
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + "]";
	}


	
}

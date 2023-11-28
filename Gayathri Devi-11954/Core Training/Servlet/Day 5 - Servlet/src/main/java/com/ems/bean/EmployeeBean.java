package com.ems.bean;

public class EmployeeBean {

	// Variables declarations
	private int eId;
	private String eName;
	private String eDept;
	private float eSalary;

	// creating constructor with super class
	public EmployeeBean() {
		super();
	}

	// creating constructor with variables
	public EmployeeBean(int eId, String eName, String eDept, float eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eDept = eDept;
		this.eSalary = eSalary;
	}

	// creating getter() setter() method
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

	public String geteDept() {
		return eDept;
	}

	public void seteDept(String eDept) {
		this.eDept = eDept;
	}

	public float geteSalary() {
		return eSalary;
	}

	public void seteSalary(float eSalary) {
		this.eSalary = eSalary;
	}

/*	// Displaying the result
	public void display() {
		System.out.println("Employee Name  : " + eName);
		System.out.println("Employee ID  : " + eId);
		System.out.println("Employee Department  : " + eDept);
		System.out.println("Employee Salary  : " + eSalary);
	}
	*/
}

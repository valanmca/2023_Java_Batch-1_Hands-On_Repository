package com.jsp.bean;

public class Employee {

	private int employeeId;
	private String employeeName;
	private String employeeDept;
	private float employeeSalary;

	public Employee() {
		super();
	}


	public Employee(int employeeId, String employeeName, String employeeDept, float employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDept = employeeDept;
		this.employeeSalary = employeeSalary;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getEmployeeDept() {
		return employeeDept;
	}


	public void setEmployeeDept(String employeeDept) {
		this.employeeDept = employeeDept;
	}


	public float getEmployeeSalary() {
		return employeeSalary;
	}


	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	
	
	
}

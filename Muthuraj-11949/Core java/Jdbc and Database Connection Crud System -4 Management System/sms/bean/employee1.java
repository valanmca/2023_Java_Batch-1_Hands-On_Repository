package com.sms.bean;

public class employee1 {
	
	private int empID;
	private String empname;
	private float empSalary;
	
	public employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employee1(int empID, String empname, float empSalary) {
		super();
		this.empID = empID;
		this.empname = empname;
		this.empSalary = empSalary;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	
	public void display() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "employee1 [empID=" + empID + ", empname=" + empname + ", empSalary=" + empSalary + "]";
	}
}

package com.dharshu.day12;
//java been java class it also a collection of private fields public getter setter

//POJO--->"Plain Old Java Object"---nothing but it is a java been
class Employee {
	private int eid;
	private String ename;
	private int esalary;

	public Employee(int eid, String ename, int esalary) {
		super(); //trying to call employee class, superclass with default
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}

	void displayInitial() {
		
		System.out.println("\nThe employee Id :" + eid);
		System.out.println("The Employee Name :" + ename);
		System.out.println("The Employee Salary :" + esalary);
	}
}

public class EmployeeConstructor {

	public static void main(String[] args) {
		Employee dh = new Employee(101, "Dharshu", 12000);
		dh.displayInitial();
		dh.setEsalary(23000);
		dh.getEsalary();
		dh.displayInitial();
	}

}

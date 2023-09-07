package com.shaji.Day12;

//Java Bean

public class Employee {

	// Variable
	private int eid;
	private String ename;
	private float esalary;

	// Constructor
	public Employee(int eid, String ename, float esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	// Method
	public void display() {
		System.out.println("Employee ID : " + eid);
		System.out.println("Employee Name : " + ename);
		System.out.println("Employee Salary : " + esalary);
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

	public float getEsalary() {
		return esalary;
	}

	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}
	public static void main(String[] args) {
		Employee obj = new Employee(11952, "Shaji", 8537.0f);
		obj.display();

		System.out.println("\n");

		obj.setEsalary(14000.0f);
		obj.display();

		System.out.println("\n");

		System.out.println(obj.getEsalary());

	}

}

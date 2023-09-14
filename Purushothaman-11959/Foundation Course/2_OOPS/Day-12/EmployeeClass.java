package com.purushoth.day12;

class Employee {
	private int eid;
	private String ename;
	private float esalary;

	public Employee(int eid, String ename, float esalary) {
		super();
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

	public float getEsalary() {
		return esalary;
	}

	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}

	void display() {
		System.out.println("Employee id: " + eid);
		System.out.println("Employee name: " + ename);
		System.out.println("Employee salary: " + esalary);
	}
}

public class EmployeeClass {

	public static void main(String[] args) {
		Employee obj = new Employee(123, "Magesh", 20000.0f);
		obj.display();

		obj.setEsalary(30000.0f);
		obj.display();
		
		obj.setEid(102);
		obj.display();

	}

}// Class creation for employee and using getter and setter.

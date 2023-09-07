package com.naveen.day12;

// Java Bean Program...
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
		System.out.println("The Employee ID : " + eid);
		System.out.println("The Employee Name : " + ename);
		System.out.println("The Employee Salary : " + esalary);
	}
}

public class Exercise01 {

	public static void main(String[] args) {

		Employee obj = new Employee(11958, "Naveenraj", 20000.0f);
		obj.display();

		obj.setEsalary(30000.0f);
		obj.setEid(11989);
		obj.setEname("Arun");
		obj.display();
		System.out.println(obj.getEsalary());

	}

}

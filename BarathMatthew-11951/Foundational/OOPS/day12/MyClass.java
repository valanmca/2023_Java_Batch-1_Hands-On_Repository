package com.matthew.day12;

//Java Bean - it act as a container to store the value

//Java Bean is a Java class, collection of private fields public getter setter.

// In framework the java bean is called POJO  - PLain old java object

class Employee {
	private int eid;
	private String eName;
	private int esalary;

	public Employee(int eid, String eName, int esalary) {
//		super();
		this.eid = eid;
		this.eName = eName;
		this.esalary = esalary;
	}
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}

	public void display() {
		System.out.println("Employee ID : " + eid);
		System.out.println("Employee name : " + eName);
		System.out.println("Employee Salary : " + esalary);
	}

}

public class MyClass {

	public static void main(String[] args) {

		Employee obj = new Employee(11951, "Matthew", 15000);
		obj.display();
		obj.setEsalary(25000);
		obj.display();
		obj.getEsalary();
	}

}

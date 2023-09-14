/*************** Getter and Setter Methods (Java Bean)... ******************/
package com.sara.day12;

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

	public float getEsalary() {
		return esalary;
	}

	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}



//	Employee(int eid, String ename, float esalary) {
//		this.eid = eid;
//		this.ename = ename;
//		this.esalary = esalary;
//	}
//
//	public void setEsalary(float esalary) { // Setter
//		this.esalary = esalary;
//
//	}
//
//	public float getEsalary() { // Getter
//		return this.esalary;
//
//	}

	
	void display() {
		System.out.println("The Employee ID is : " + eid);
		System.out.println("The Employee Name is : " + ename);
		System.out.println("The Employee Salary is : " + esalary);
	}


}

public class Oops_Practice01 {

	public static void main(String[] args) {
		Employee sara = new Employee(1011, "Sara", 10000.00f);
		sara.display();

		System.out.println(" ");

		sara.setEsalary(20000.0f);
		sara.display();

		System.out.println(sara.getEsalary());

	}

}

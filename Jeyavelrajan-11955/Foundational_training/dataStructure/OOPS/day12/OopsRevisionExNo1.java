
// core - java Bean, in framework - POJO-Plain Old Java Object [is a collection of private, fields, getter,setter]
//using get and set operations
package com.jeyavel.OOPS.day12;

class Employee {
	private int Eid;
	private String eName;
	private int esalary;

	public Employee(int eid, String eName, int esalary) {
		//we cannot use this and super that must be in the first line in constructor
		//we want to call a super class in the subclass use super.value
		super();
		Eid = eid;
		//this keyword refers to the current object 
		this.eName = eName;
		this.esalary = esalary;
	}
	

	public int getEid() {
		return Eid;
	}


	public void setEid(int eid) {
		Eid = eid;
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


	void display() {
		System.out.println("Employee Id" + Eid);
		System.out.println("Employee Name" + eName);
		System.out.println("Employee Salary" + esalary);

	}

//public int getEsalary() {//Getter
//	return esalary;
//}
//
//public void setEsalary(int esalary) {//Setter
//	this.esalary = esalary;
//}

}

public class OopsRevisionExNo1 {

	public static void main(String[] args) {

		Employee emp = new Employee(11955, "jeyavel", 20000);

		emp.display();// Print the default values that in object
		emp.getEsalary();// getting the salary value
		emp.setEsalary(25000);// setting the new salary value
		emp.display();// display the new updated salary value
		
		//geting name
		emp.geteName();
		//Setting new Name 
		emp.seteName("jeyavelrajan");
		//Displaying the New Name 
		emp.display();
		
		//grtting empid
		emp.getEid();
		emp.setEid(11951);

	}

}

//Automatically getting the Method (Source->Generate the somethings)
package com.pravinkumar.day13;
//This is a Pre-defined Packages(Default)
import java.lang.Object;
//Getting the Constructors and Getter and Setter Automatically

//What is Java Bean is a also a Java Class and it is a collections of private fields and public Setter and the public Getter

//Java Beans
class Employee5 {
	int eid;
	String ename;
	float esalary;

	public Employee5(int eid, String ename, float esalary) {
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
		System.out.println("Employee Id is : " + eid);
		System.out.println("Employee Name is : " + ename);
		System.out.println("Employee Salary is : " + esalary);
	}

}

public class OOPS_Exs_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee5 obj = new Employee5(1011111, "PravinKumar", 1.0f);
		obj.display();
		obj.setEid(101);
		obj.setEname("PravinKumar RajaSahayam ");
		obj.setEsalary(5.0f);
		obj.display();
	}

}

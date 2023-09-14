package com.gayathri.day12;

/*
java been is a collections of private fields public getter setters. 
it will act as a container 

when it is coming into framework it is called POJO->Plain Old Java Been
*/
class Person{
	private int eid;
	private String ename;
	private int esalary;
	
	/*
	 * public Person(int eid, String ename, int esalary) { this.eid = eid;
	 * this.ename = ename; this.esalary = esalary; }
	 */
	 public void display() {
		 System.out.println("\nEmployee Name 	: "+ename);
		 System.out.println("Employee ID 	: "+eid);
		 System.out.println("Empolyee Salary	: "+esalary);
	 }
		/*
		 * public void setEsalary(int esalary)//setter method {//setting the particular
		 * value this.esalary = esalary; }
		 * 
		 * public float getEsalary(float esalary) {//getter method //getting a
		 * particular value return this.esalary; }
		 */

	public Person(int eid, String ename, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public int getEid() {//to get the particular value
		return eid;
	}

	public void setEid(int eid) {//to set the particular value
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
}

public class EmployeeConstructor {

	public static void main(String[] args) {
		Person gayathri = new Person(11954,"Gayathri",10000);
		gayathri.display();
		gayathri.setEsalary(50000);
		gayathri.display();

	}

}


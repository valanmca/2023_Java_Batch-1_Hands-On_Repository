package com.jenish.day12;

//Using Getter And Setter 
class Employee {
	private int  eid;
	private String ename;
	private float esalary;
	
	public Employee(int eid, String ename, float esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		
	}
	public void setSalary(float esalary) { //Setter Method
		this.esalary = esalary;
	}
	public float getSalary() { //Getter method
		return this.esalary;
	}
	void display() {
		System.out.println("Employee Id : " +eid);
		System.out.println("Employee Name : " +ename);
		System.out.println("Employee Salary : " +esalary);
}
public class Constructor_Method_Ex2 {

	public static void main(String[] args) {
		Employee jenish = new Employee(101,"Jenish",10000);
		jenish.display();

	}
}
}

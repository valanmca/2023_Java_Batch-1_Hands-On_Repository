package com.jenish.day09;

class Employee1{
	//Variables
	int eid;
	String ename;
	static String org="Relevantz";

//Constructor
Employee1(int eid,String ename){
	System.out.println("");
	this.eid=eid;
	this.ename=ename;

}
//Methods
void display() {
	System.out.println("Employee id:" +eid);
	System.out.println("Employee Org:" +org);
	System.out.println("Employee Name:" +ename);
	}
}

public class Instance_Static_ClassCreation_Emp_Ex5 {

	public static void main(String[] args) {
		Employee1 jenish = new Employee1(101,"Jenish");
		//Method Calling
		jenish.display();
		Employee1 sara = new Employee1(102,"Sara");
		sara.display();

	}

}

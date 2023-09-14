package com.mahesh.Oops_day8;

class Employee {
	//variables
	int eid;      //
	String ename; //   instance variables | instance means -> inside of your object
	float esalary;//
	
	//constructor
	Employee(int eid,String ename,float esalary) //constructor with local variables
	{
		System.out.println("INSIDE THE CONSTRUCTOR\n------ --- -----------");
		this.eid =eid;
		this.ename=ename;
		this.esalary=esalary;
		
		
	}

	//method
	void display() { //method defination
		System.out.println("Employee id : " + eid);
		System.out.println("Employee name : " + ename);
		System.out.println("Employee salary : " + esalary);
		System.out.println("__________________________________");
		System.out.println();

	}
}

public class Human_Class {

	public static void main(String[] args) {

		Employee mahesh = new Employee(100,"Mahesh",2000.0f);//Object creation and calling the constructor.
		//method calling
		mahesh.display();
		
		Employee mani = new Employee(101,"Mani",2200.25f);
		mani.display();
		
		Employee rajan = new Employee(201,"Rajan",3000.50f);
		rajan.display();
		
		System.out.print("\t\t-*-");
	}

}

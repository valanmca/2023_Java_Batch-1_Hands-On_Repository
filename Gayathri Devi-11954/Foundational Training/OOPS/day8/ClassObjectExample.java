package com.gayathri.day8;

class Employee{
	
	//variables 	//instance variables
	int eid;
	String ename;
	float esalary;
	

	//constructor - same name as class name, never return any value using for initialization
	Employee(int id, String name, float salary)//local variable
	{
		eid = id;	//instance = local 
		ename = name;
		esalary = salary;
		
		/*
		 * //this keyword is used to point the current object this.eid = eid; this.ename
		 * = ename; this.esalary = esalary;
		 */
	}
	
	//method definition
	void display()	//instance method
	{
		System.out.println("\nEmployee ID : "+eid);
		System.out.println("\nEmployee name : "+ename);
		System.out.println("\nEmployee salary : "+esalary);
	}
}
public class ClassObjectExample {

	public static void main(String[] args) {
		
		Employee gayathri = new Employee(11,"g3",123.3f);
		gayathri.display();
		
		Employee devi = new Employee(22,"dv",345.6f);
		devi.display();
	}

}

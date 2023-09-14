//Method name can be any name but constructor name must be the class name
//Method return value constructor wont return value
//Constructor comes with arguments
//this. can be used to avoid name conflict in local and instance variable
// if we use two different variable name for instance and local then no need to use this.
package com.matthew.day08;
class Employee{
	//variable
	int eid ;
	String ename;
	float esalary;
	
	//constructor - initialize the value
	Employee(int eid,String ename,float esalary){
		System.out.println("Inside Constructor");
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	
	// methods
	void display() {
		System.out.println("Employee Id : "+eid);
		System.out.println("Employee name : "+ename);
		System.out.println("Employee salary : "+esalary);
	}
}

public class MainClass {

	public static void main(String[] args) {
		//creating object and calling the constructor
		Employee matthew = new Employee(100,"Matthew",20345.56f);
		// calling the method
		matthew.display();
		//creating a new object
		Employee barath = new Employee(102,"Barath",30284.34f);
		barath.display();
	}

}

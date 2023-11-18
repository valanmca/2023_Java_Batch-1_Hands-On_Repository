// Employee Details

package com.jeyandhan.day01;

public class Test {
	
	int empId; // Instance variable
	String name;
	float salary;
	
	Test(int empId, String name, float salary){ //constructor
		
		this.empId = empId; //Variable Initialization
		this.name = name;
		this.salary =salary;
		
	}
	
	void display() { 
		
		System.out.println("\n\t ***Employee Details***");
		System.out.println("\nEmployee Id..."+empId);
		System.out.println("\nEmployee Name..."+name);
		System.out.println("\nEmployee Salary..."+salary);
	}
	public static void main(String[] args) {
		
		Test emp = new Test(25, "Jeyandhan",15000.0f); //object creation
		Test emp1 = new Test(23, "Mahesh",20000.0f);
		Test emp2 = new Test(27, "Jeyavel",10000.0f);
		
		emp.display(); //method calling
		emp1.display();
		emp2.display();
	}

}

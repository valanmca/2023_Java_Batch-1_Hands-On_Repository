package com.jeyandhan.day03;


public class ArrayOfObjects {

	int empId; // Instance variable
	String name;
	float salary;
	
	
	ArrayOfObjects(int empId, String name, float salary){ //constructor
		
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
		ArrayOfObjects arr1 = new ArrayOfObjects(25, "Jeyandhan",15000.0f); //object creation
		ArrayOfObjects arr2 = new ArrayOfObjects(23, "Mahesh",20000.0f);
	
		
		ArrayOfObjects arr[] = new ArrayOfObjects[2];
		arr[0] = arr1;
		arr[1] = arr2;
		
		for(int i = 0; i<arr.length;i++) {
			arr[i].display();
		}
	}

}

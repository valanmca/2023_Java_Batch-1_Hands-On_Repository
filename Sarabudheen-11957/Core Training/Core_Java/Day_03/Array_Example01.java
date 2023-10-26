package com.sara.CoreJava.Day_03;

class Employee_Details{
	
	//variables
	int Employee_id;
	String Employee_Name;
	float Employee_Salary;

	//Constructor
	Employee_Details(int Employee_id,String Employee_Name,float Employee_Salary){
		this.Employee_id = Employee_id;
		this.Employee_Name = Employee_Name;
		this.Employee_Salary = Employee_Salary;
	}
	//Method
	void display() {
		System.out.println("Employee ID is : "+Employee_id);
		System.out.println("Employee Name is : "+Employee_Name);
		System.out.println("Employee Salary is : "+Employee_Salary);
		System.out.println(" ");
	}
}
public class Array_Example01 {

	public static void main(String[] args) {
		
		Employee_Details emp1 = new Employee_Details(101,"SARA",12000);
		
		Employee_Details emp2 = new Employee_Details(102,"VIRAT",20000);
		
		Employee_Details emp[] = new Employee_Details[2]; //int arr[] = new int[]
		
		emp[0]=emp1;
		emp[1]=emp2;
		
		for (int i=0;i<emp.length;i++) {
			emp[i].display();
		}
		
	}

}

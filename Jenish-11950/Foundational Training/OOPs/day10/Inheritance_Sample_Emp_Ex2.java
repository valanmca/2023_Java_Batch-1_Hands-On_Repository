package com.jenish.day10;

class Person{
	void DisplayName() {
		System.out.println("My Name is Jenish");
	}
}
 class Employee extends Person{
	 void DisplaySalary() {
		 System.out.println("My Salary is 1*,***");
		 
	 }
 }
public class Inheritance_Sample_Emp_Ex2 {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.DisplayName();
		employee.DisplaySalary();
		

	}

}

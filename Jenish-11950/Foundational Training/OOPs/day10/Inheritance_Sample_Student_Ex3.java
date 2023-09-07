package com.jenish.day10;

class Person1{
	void DisplayName() {
		System.out.println("My Student Name is Jenish");
	}
}
 class Employee1 extends Person1{
	 void DisplaySalary() {
		 System.out.println("My Salary is 1*,***");
		 
	 }
 }
 class Student1 extends Person1{
	 void DisplayRollNo() {
		 System.out.println("RollNo is 101");
	 }
 }
public class Inheritance_Sample_Student_Ex3 {

	public static void main(String[] args) {
		Employee1 employee = new Employee1();
		employee.DisplayName();
		//employee.DisplaySalary();
		
		Student1 student = new Student1();
		student.DisplayRollNo();

	}

}

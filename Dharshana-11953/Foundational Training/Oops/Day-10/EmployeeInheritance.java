package com.dharshu.day10;

class Human{
	void display() {
		System.out.println("Name: Dharshu");
	}
}

class Employee extends Human{
	void displaySalary() {
		System.out.println("The  Salary : 8,537 Only");
	}
}

public class EmployeeInheritance {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.display();
		emp.displaySalary();

	}

}

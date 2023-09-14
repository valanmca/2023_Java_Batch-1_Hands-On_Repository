package com.shaji.Day10;

class Person1{
	void display() {
		System.out.println("Name is Shaji");
	}
}

class Employee1 extends Person1{
	void salary() {
		System.out.println("Salary is RS.8537/-only...");
	}
}

class Student extends Person1{
	void displayEmpno() {
		System.out.println("Employee Id is 11952");
	}
}

public class Employee_Detail1 {

	public static void main(String[] args) {
		Employee1 emp = new Employee1();
		emp.display();
		emp.salary();
		
		System.out.println("\n");
		
		Student emp1 = new Student();
		emp1.display();
		emp1.displayEmpno();

	}

}

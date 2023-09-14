/********* Example for Inheritance Using Person1 Class... ********/
package com.sara.day10;

class Person1 {
	void displayName() {
		System.out.println("Name is Sara");

	}
}

class Employee1 extends Person1 {
	void displaySalary() {
		System.out.println("Salary is 8537.00");
	}
}

class Student extends Person1 {
	void displayRollNo() {
		System.out.println("Roll No is : 101");
	}
}

public class inheritance_Ex03 {

	public static void main(String[] args) {

		Employee1 emp = new Employee1();
		emp.displayName();
		emp.displaySalary();

		System.out.println(" ");

		Student stu = new Student();
		stu.displayName();
		stu.displayRollNo();

	}

}

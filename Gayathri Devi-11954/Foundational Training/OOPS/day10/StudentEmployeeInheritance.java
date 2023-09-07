package com.gayathri.day10;
//hierarchical inheritance
class Person {
	void displayName() {
		System.out.println("Name : Gayathri Devi");
	}
}

class Income extends Person {
	void displaySalary() {
		System.out.println("Salary : 8537");
	}
}

class Student extends Person{
	void displayRoll()
	{
		System.out.println("Roll no : 11954");
	}
}
public class StudentEmployeeInheritance {

	public static void main(String[] args) {
		Income salary = new Income();
		salary.displayName();
		salary.displaySalary();
		
		Student object = new Student();
		object.displayName();		
		object.displayRoll();

	}
}

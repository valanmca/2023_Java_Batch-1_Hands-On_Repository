package com.purushoth.day10;

class Person1{	
	void displayName() {
		System.out.println("My name is kumar");
	}
}

class Employee1 extends Person1{
	void displaySalary() {
		System.out.println("Salary is 20k");
	}
}

class Student extends Person1{
	void displayRollNo() {
		System.out.println("Roll Number is 20");
	}
}
public class PersonInheritanceHierarchicalLevel {

	public static void main(String[] args) {
		Employee1 obj=new Employee1();
		obj.displayName();
		obj.displaySalary();
		
		Student obj1=new Student();
		obj1.displayName();
		obj1.displayRollNo();

	}

}//Person inheritance with employee and student and it is hierarchical level.
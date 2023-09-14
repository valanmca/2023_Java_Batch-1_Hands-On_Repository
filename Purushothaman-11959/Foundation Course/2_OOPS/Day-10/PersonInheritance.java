package com.purushoth.day10;

class Person{	
	void displayName() {
		System.out.println("My name is kumar");
	}
}

class Employee extends Person{
	void displaySalary() {
		System.out.println("My salary is 20k");
	}
}
public class PersonInheritance {

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.displayName();
		obj.displaySalary();

	}

}//Person Inheritance and it is single inheritance.

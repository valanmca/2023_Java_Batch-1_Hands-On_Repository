package com.aravind.day10;// single inheritance

class Person {
	void DisplayName() {
		System.out.println("Name = " + "Aravind"); // person -superclass

		// employee-subclass
	}
}

class Employee extends Person {
	void DisplaySalary() {
		System.out.println("Salary = " + 50000);
	}
}

public class InheritanceExample2 {

	public static void main(String[] args) {
		Employee obj = new Employee();// it runs both obj.DisplayName() obj.DisplaySalary();
		// because employee extends person
		obj.DisplayName();
		obj.DisplaySalary();

	}

}

package com.shaji.Day10;

class Person{
	void display() {
		System.out.println("Name is Shaji");
	}
}

class Employee extends Person{
	void salary() {
		System.out.println("Salary is RS.8537/-only...");
	}
}

public class Emplyee_Details {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.display();
		emp.salary();
	}

}

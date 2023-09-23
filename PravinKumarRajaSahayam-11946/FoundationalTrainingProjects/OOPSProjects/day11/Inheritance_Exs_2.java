//Using Inheritance (extends) for super class and sub class
package com.pravinkumar.day11;
//Details of the Persons Details for the Single Level Inheritances
class Person {
	void displayName() {
		System.out.println("PravinKumar : ");
	}
}

class Employee extends Person {
	void displaySalary() {
		System.out.println("Salary is 10000 : ");
	}
}

public class Inheritance_Exs_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Details = new Employee();
		Details.displayName();
		Details.displaySalary();
	}

}

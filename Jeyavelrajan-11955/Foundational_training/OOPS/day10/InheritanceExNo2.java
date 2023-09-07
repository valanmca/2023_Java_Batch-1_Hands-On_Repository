

//Single INHERITANCE ex
package com.jeyavel.OOPS.day10;

//Parent class /super class
class person {
	void displayName() {
		System.out.println("Employee Name Is -> Jeyavelrajan");
	}

}

//child class /sub class
class Employee extends person {
	void displaySalary() {
		System.out.println("Employee Salary Is -> 15000");
	}
}

public class InheritanceExNo2 {

	public static void main(String[] args) {
		Employee jeyavel = new Employee();
		jeyavel.displayName();
		jeyavel.displaySalary();

	}

}

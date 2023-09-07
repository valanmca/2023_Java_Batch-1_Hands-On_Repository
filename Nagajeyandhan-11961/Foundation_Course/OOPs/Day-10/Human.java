//Getting name and salary details using inheritance (Single inheritance)

package com.jeyandhan.day10;

class Person{
	void displayName() {
		System.out.println("My name is: Jeyandhan");
		System.out.println("My name is: Shaji");
		System.out.println("My name is: Sara");
		System.out.println("My name is: Purusoth");
		System.out.println("My name is: Mahesh");
	}
}
class Employee extends Person{
	void displaySalary() {
		System.out.println("Salary : 10000");
		System.out.println("Salary: 5000");
		System.out.println("Salary: 20000");
		System.out.println("Salary: 8000");
		System.out.println("Salary: 12000");
	}
}

public class Human {

	public static void main(String[] args) {
		
		Employee obj = new Employee();
		
		obj.displayName();
		obj.displaySalary();

	}

}

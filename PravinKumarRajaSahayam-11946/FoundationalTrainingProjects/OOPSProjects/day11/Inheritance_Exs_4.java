//Using Inheritance (extends) from the three class and Calling the two objects 
package com.pravinkumar.day11;
//Display Name,Salary,Rollno for the Hierarchical Inheritances-
class Person1 {
	void displayName() {
		System.out.println("PravinKumar : ");
	}
}

class Employee1 extends Person1 {
	void displaySalary() {
		System.out.println("The Salary is : 10000 ");
	}
}

class Student1 extends Person1 {
	void displayRollno() {
		System.out.println("The Rollno is : 101 ");
	}
}

public class Inheritance_Exs_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 details = new Student1();
		details.displayName();
		details.displayRollno();
		Employee1 detail = new Employee1();
		detail.displaySalary();

	}

}

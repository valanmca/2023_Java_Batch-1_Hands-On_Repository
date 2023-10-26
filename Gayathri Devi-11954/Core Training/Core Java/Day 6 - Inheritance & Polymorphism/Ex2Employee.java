package com.gayathri.day5;

/*
 * 2. Write a Java program to create a class Employee with a method called calculateSalary(). 
 * Create two subclasses Manager and Programmer. In each subclass, override the calculateSalary() method 
 * to calculate and return the salary based on their specific roles.

 */
class Employee {
	public void calculateSalary() {
		System.out.println("All employees get their salary");
	}

}
class Manager extends Employee {
	public void calculateSalary() {
		System.out.println("All manager get 1,00,000 salary ");
	}

}
class Programmer extends Employee {
	public void calculateSalary() {
		System.out.println("All programmer get 10,000 salary");
	}

}
public class Ex2Employee {

	public static void main(String[] args) {
		
		Programmer obj = new Programmer();
		obj.calculateSalary();
		
		Employee obj1 = new Manager();//sub class based
		obj1.calculateSalary();
		
		Manager mg = new Manager();
		mg.calculateSalary();

	}

}

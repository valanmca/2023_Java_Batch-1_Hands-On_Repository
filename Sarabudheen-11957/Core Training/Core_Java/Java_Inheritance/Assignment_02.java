package com.sara.CoreJava.Day_06;

class Employee{
	void calculateSalary() {
		System.out.println(" ");
	}
}

class Manager extends Employee{
	
	void calculateSalary() {
		System.out.println("The Manager's salary is 25,000 ");
	}
}

class Programmer extends Employee{
	
	void calculateSalary() {
		System.out.println("The Programmer's salary is 20,000");
	}
}


public class Assignment_02 {

	public static void main(String[] args) {
		Employee manager = new Manager();
		manager.calculateSalary();
		
		Employee pro = new Programmer();
		pro.calculateSalary();
	}

}

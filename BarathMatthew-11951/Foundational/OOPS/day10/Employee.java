//Example of single inheritance

package com.matthew.day10;

	//Parent(Base) class
	class Person{
		void eName() {
			System.out.println("My name is : Matthew");
		}
	}
	//derived Class - has functionality of both person and esalary.
	class eSalary extends Person{
		void amount() {
			System.out.println("My salary is : 15000");
		}
	}
public class Employee{
	public static void main(String[] args) {
		eSalary obj = new eSalary();
		obj.eName();
		obj.amount();
	}

}

//Hierarchical level - one parent has two or more derived class 
package com.matthew.day10;

class Person1{
	void eName() {
		System.out.println("My name is : Matthew");
	}
}

class eSalary1 extends Person1{
	void amount() {
		System.out.println("My salary is : 15000");
	}
}

class Nstudent extends Person1{
	void rollNo() {
		System.out.println(11951);
	}
}
public class Student {

	public static void main(String[] args) {
		Nstudent obj = new Nstudent();
		obj.rollNo();
		obj.eName();

	}

}

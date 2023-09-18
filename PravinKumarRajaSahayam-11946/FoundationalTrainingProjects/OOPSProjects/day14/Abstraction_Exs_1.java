//Abstraction Class
package com.pravinkumar.day14;

//Using Herarircal Inheritance and Polymorphism Method Over Riding 
//Abstract Method we will over riding
abstract class Shape1 {
	// using abstract method for without declarating anything in the inside(any
	// definitions) the Method
	abstract void area();

	abstract void myMethod();

	void myMethod1() {

	}

	void myMethod2() {
		System.out.println("Its is a mymethod2 ");
	}
}

class Rectangle1 extends Shape1 {
	void area() {
		System.out.println("We can find the area through (L*B) ");
	}

	void myMethod() {
		System.out.println("Its is a Method");
	}
}

class Circle1 extends Shape1 {
	void area() {
		System.out.println("We can find the area through (3.14*r^2)");
	}

	void myMethod() {
		System.out.println("Its is a Method ");
	}
}

public class Abstraction_Exs_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * we can't calling the object in the abstract class Shape1 obj = new Shape1();
		 */

		// But we can calling this with the help of the Reference
		// Dynamic Method Dispatch
		// Calling the constructors with the help of the super class and the sub class
		Shape1 obj = new Rectangle1();
		obj.area();
		obj.myMethod2();

		Shape1 obj1 = new Circle1();
		obj1.myMethod();
		
		
		Shape1 obj10 = new Rectangle1();
		obj10.myMethod1();

	}

}

package com.jenish.day13;

abstract class Shape1 {
	abstract void area();
	abstract void myMethod();
	
	void myMethod2( ) {
		System.out.println("This is my Method2");
	}
	}
class Rectangle1 extends Shape1{
	int l, b;
	void area() {
		
		System.out.println("The area of rectangle: " +(l*b));
		
	}

	
	void myMethod() {
		
	}
	
}
class Circle1 extends Shape1{
	void area() {
		System.out.println("Area: 3.14*r*r");
	}
	void myMethod() {
		
	}
}
public class Abstraction_Method_Ex4 {

	public static void main(String[] args) {
		Shape1 obj = new Rectangle1(); //Dynamic method Dispatch[DNM]
		obj.area();			//Invoked by Rectangle Object because of Overloading.
		obj.myMethod2();	//Invoked by reference of Shape1.
		}
	}



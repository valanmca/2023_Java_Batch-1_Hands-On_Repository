package com.domnic.oopsday6;

abstract class Shape1 {
	abstract void area();

	abstract void myMethod();

	void myMethod2() {
		System.out.println("myMethod2");
	}

}

class Rectangle1 extends Shape1 {
	void area() {
		System.out.println("Area of rectangle = L*B");
	}

	void myMethod() {
	}
}

class Circle1 extends Shape1 {
	void area() {
		System.out.println("Area of circle = 3.14*r*r");
	}

	void myMethod() {
	}
}

public class AbstractClass1 {

	public static void main(String[] args) {
		Shape1 obj = new Rectangle1();
		obj.area();
		obj.myMethod2();

	}

}

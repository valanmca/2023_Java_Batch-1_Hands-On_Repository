package com.shaji.Day13;

abstract class Shape {
	abstract void area();

	abstract void myMethod();

	void concreteMethod() {
		System.out.println("We can use normal class to abstract class...");
	}
}

class rectangle extends Shape {

	void area() {

		System.out.println("Area of Rectangle = l*b ");
	}

	void myMethod() {

	}
}

class circle extends Shape {
	void area() {
		System.out.println("Area of Circle = 3.14*(r*r) ");
	}

	void myMethod() {

	}
}

public class Example3 {

	public static void main(String[] args) {

		Shape shape = new rectangle(); // Dynamic Method Dispatch(DMD)

		shape.concreteMethod();
		shape.area();

		Shape shape1 = new circle(); // Dynamic Method Dispatch(DMD)
		shape1.area();
	}

}

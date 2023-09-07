package com.jeyavel.OOPS.day13;

class Shape{
	void area() {
		System.out.println("No Formula for Shape");
	}
}

class Rectangle extends Shape {
	void area() {
		System.out.println("Rectangle Formula is l*b");
	}
	
}
class Circle extends Shape{
	void area() {
		System.out.println("Circle Formula is 3.14*r2");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Circle cir = new Circle();
		cir.area();

	}

}

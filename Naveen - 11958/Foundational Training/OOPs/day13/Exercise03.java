package com.naveen.day13;

//Method Overriding for method not defined.
class Shape {
	void area() {
		System.out.println("Area Can't be defined.");
	}
}

class Rectangle extends Shape {
	void area() {
		System.out.println("Area : L * B");
	}
}

class Circle extends Shape {
	void area() {
		System.out.println("Area : 3.14 * r * r");
	}
}

public class Exercise03 {

	public static void main(String[] args) {
		
		Circle obj = new Circle();
		obj.area();
		
		Rectangle obj2 = new Rectangle();
		obj2.area();
		
	}

}

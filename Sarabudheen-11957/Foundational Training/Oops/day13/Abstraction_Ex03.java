/***** Abstract class for Shapes... ******/
package com.sara.day13;

class Shapes {
	void area() {
		System.out.println("Area cannot Define");
	}
}

class Rectangle extends Shapes {
	void area() {
		System.out.println("Area of Rectangle is : Length * Breadth");
	}
}

class Circle extends Shapes {
	void area() {
		System.out.println("Area of Circle is : 3.14*r*r");
	}
}

public class Abstraction_Ex03 {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.area();

		Circle circle = new Circle();
		circle.area();

	}

}

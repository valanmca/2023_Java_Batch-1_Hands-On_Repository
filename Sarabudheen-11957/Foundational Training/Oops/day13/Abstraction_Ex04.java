/***** Find Area of the Shapes using Abstract class... *****/
package com.sara.day13;

abstract class Shapes1 {
	abstract void area();
}

class Rectangle1 extends Shapes1 {
	void area() {
		System.out.println("Area of Rectangle is : Length * Breadth");
	}
}

class Circle1 extends Shapes1 {
	void area() {
		System.out.println("Area of Circle is : 3.14*r*r");
	}
}

public class Abstraction_Ex04 {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.area();

		Circle circle = new Circle();
		circle.area();

	}

}

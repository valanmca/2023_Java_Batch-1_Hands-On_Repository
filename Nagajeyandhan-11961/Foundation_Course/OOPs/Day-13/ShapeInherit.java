//Method overriding(Shapes)

package com.jeyandhan.day13;

class Shape {

	void getArea() {
		System.out.println("No area defined for shape");
	}
}

class Rectangle extends Shape {
	void getArea() {
		System.out.println("Area of Rectangle: l * b");
	}

}

class Circle extends Shape {
	void getArea() {
		System.out.println("Area of circle: 3.14 * r * r");
	}
}

public class ShapeInherit {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.getArea();
	
	}

}

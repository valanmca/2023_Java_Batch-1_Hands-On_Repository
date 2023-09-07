package com.gayathri.day13;

class Shape {
	void area() {
		System.out.println("There is no formula for shape");
	}
}

class Rectangle extends Shape {
	int length, width;

	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	void area() {
		System.out.println("The area of rectangle : " + (length * width));
	}
}

class Circle extends Shape {
	float pi = 3.14f;
	float r;

	Circle(float r) {
		this.r = r;
	}

	void area() {
		System.out.println("The area of the circle : " + (3.14 * r * r));
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		Circle c = new Circle(5.0f);
		c.area();
		
		Rectangle rec= new Rectangle(3,7);
		rec.area();

	}

}

/********  Java program to create a class called "Shape" with abstract methods for 
 calculating area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".**********/
package com.sara.CoreJava.Day_04;

abstract class Shape {
	abstract void area();

	abstract void perimeter();

	int length;
	int breadth;
	int radius;
	int height;
	int side;
}

class Rectangle extends Shape {

	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	void area() {
		System.out.println("Area of Rectangle is : " + length * breadth);
		System.out.println(" ");
	}

	void perimeter() {
		System.out.println("Perimeter of Rectangle is : " + 2 * (length + breadth));
		System.out.println(" ");
	}
}

class Circle extends Shape {
	Circle(int radius) {
		this.radius = radius;
	}

	void area() {
		System.out.println("Area of Circle is :" + 3.14 * radius * radius);
		System.out.println(" ");
	}

	void perimeter() {
		System.out.println("Perimeter of Circle is : " + 2 * 3.14 * radius);
		System.out.println(" ");
	}
}

class Triangle extends Shape {

	Triangle(int breadth, int height, int side) {
		this.breadth = breadth;
		this.height = height;
		this.side = side;
	}

	void area() {
		System.out.println("Area of Triangle is : " + (breadth * height) / 2);
		System.out.println(" ");
	}

	void perimeter() {
		System.out.println("Perimeter of Triangle is : " + (breadth + height + side));
		System.out.println(" ");
	}
}

public class Assignment_01 {

	public static void main(String[] args) {

		Rectangle rect = new Rectangle(10, 20);
		rect.area();
		rect.perimeter();

		System.out.println("***********************************");

		Circle circle = new Circle(5);
		circle.area();
		circle.perimeter();

		System.out.println("***********************************");

		Triangle tri = new Triangle(10, 5, 5);
		tri.area();
		tri.perimeter();

		System.out.println("***********************************");

		Shape obj = new Rectangle(10, 20); // DMD
		obj.area();
		obj.perimeter();

		System.out.println("***********************************");

	}

}

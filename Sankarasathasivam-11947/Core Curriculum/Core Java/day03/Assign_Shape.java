
//Write a Java program to create a class called "Shape" with abstract methods for calculating area and perimeter, 
//and subclasses for "Rectangle", "Circle", and "Triangle".

package com.shiva.core.day03;

abstract class Shape {

	double pi = 3.14;

	public abstract void area();

	public abstract void perimeter();
}

// Subclass circle 
class Circle extends Shape {
	int radius;

	Circle(int r) {
		this.radius = r;

	}

	public void area() {
		System.out.println("Area of Circle : " + pi * (radius * radius));

	}

	public void perimeter() {
		System.out.println("Perimeter of Circle : " + 2 * pi * radius);

	}
}

class Rectangle extends Shape {
	int length, breadth;

	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void area() {
		System.out.println("Area of Rectangle : " + length * breadth);
	}

	public void perimeter() {
		System.out.println("Perimeter of Rectangle : " + 2 * (length + breadth));
	}
}

class Triangle extends Shape {
	int length;
	int breadth;
	int side1, side2, side3;

	Triangle(int length, int breadth, int side1, int side2, int side3) {
		this.length = length;
		this.breadth = breadth;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public void area() {
		System.out.println("Area of Triangle : " + length * breadth / 2);
	}

	public void perimeter() {
		System.out.println("Perimeter of Triangle: " + (side1 + side2 + side3));
	}

}

public class Assign_Shape {

	public static void main(String[] args) {
		Circle obj1 = new Circle(2);
		obj1.area();
		obj1.perimeter();
		Rectangle obj2 = new Rectangle(4, 4);
		obj2.area();
		obj2.perimeter();
		Triangle obj3 = new Triangle(2, 2, 1, 2, 3);
		obj3.area();
		obj3.perimeter();

	}

}

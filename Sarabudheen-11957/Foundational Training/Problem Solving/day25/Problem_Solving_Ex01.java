package com.sara.day25;

interface ShapePlan {
	void area();

	void perimeter();

	double PI = 3.14;
}

abstract class Shape implements ShapePlan {
	public abstract void area();

	public abstract void perimeter();
}

class Circle extends Shape {
	int radius;

	Circle(int radius) {
		this.radius = radius;
	}

	public void area() {
		double area = PI * (radius * radius);
		System.out.println("The area of circle is: " + area);
	}

	public void perimeter() {
		double perimeter = 2 * (PI * radius);
		System.out.println("The perimeter of circle is: " + perimeter);
	}
}

class Square extends Shape {

	int side;

	Square(int side) {
		this.side = side;
	}

	public void area() {
		double area = side * side;
		System.out.println("The area of square is: " + area);
	}

	public void perimeter() {
		double perimeter = 4 * side;
		System.out.println("The perimeter of square is: " + perimeter);
	}
}

class Rectangle extends Shape {

	int length;
	int breadth;

	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void area() {
		double area = length * breadth;
		System.out.println("The area of rectangle is: " + area);
	}

	public void perimeter() {
		double perimeter = 2 * (length * breadth);
		System.out.println("The perimeter of rectangle is: " + perimeter);
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
		double area = (length * breadth) / 2;
		System.out.println("The area of triangle is: " + area);
	}

	public void perimeter() {
		double perimeter = side1 + side2 + side3;
		System.out.println("The perimeter of triangle is: " + perimeter);
	}
}

public class Problem_Solving_Ex01 {

	public static void main(String[] args) {
		Circle circle = new Circle(8);
		circle.area();
		circle.perimeter();

		Square square = new Square(12);
		square.area();
		square.perimeter();

		Rectangle rect = new Rectangle(8, 10);
		rect.area();
		rect.perimeter();

		Triangle triangle = new Triangle(6, 8, 12, 14, 16);
		triangle.area();
		triangle.perimeter();
	}

}

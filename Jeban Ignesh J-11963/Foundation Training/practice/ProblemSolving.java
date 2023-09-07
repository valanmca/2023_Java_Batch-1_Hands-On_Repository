package com.jeban.practice;

interface ShapePlan {
	void area();

	void perimeter();

	final double PI = 3.14;
}

abstract class Shape implements ShapePlan {
	public void area() {

	}

	public void perimeter() {

	}

}

class Circle extends Shape {
	int radius;

	Circle(int radius) {
		this.radius = radius;
	}

	public void area() {
		double area = PI * radius * radius;
		System.out.println("Area of Circle is:"+area);
	}

	public void perimeter() {
		double perimeter = 2 * PI * radius;
		System.out.println("Perimeter of Circle is:"+perimeter);
	}
}

class Rectangle extends Shape {
	int length;
	int breath;

	Rectangle(int length, int breath) {
		this.length = length;
		this.breath = breath;
	}

	public void area() {
		double area = length * breath;
		System.out.println("Area of Rectangle is:"+area);

	}

	public void perimeter() {
		double perimeter = 2 * (length + breath);
		System.out.println("Perimeter for Rectangle is:"+perimeter);

	}

}

class Square extends Shape {
	int side;

	Square(int side) {
		this.side = side;
	}

	public void area() {
		double area = side * side;
		System.out.println("Area of Square is:"+area);
	}

	public void perimeter() {
		double perimeter = 4 * side;
		System.out.println("Perimeter of Square is:"+perimeter);
	}
}

class Triangle extends Shape {
	int side1;
	int side2;
	int side3;
	int hight;
	int breath;

	Triangle(int side1, int side2, int side3, int hight, int breath) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.hight = hight;
		this.breath = breath;
	}

	public void area() {
		double area = 1 / 2 * breath * hight;
		System.out.println("Area of Triangle is:"+area);

	}

	public void perimeter() {
		double perimeter = side1 + side2 + side3;
		System.out.println("Perimeter of Triangle is:"+perimeter);
	}
}

public class ProblemSolving {

	public static void main(String[] args) {
		Circle circ = new Circle(12);
		circ.area();
		circ.perimeter();
		Rectangle rect = new Rectangle(10, 20);
		rect.area();
		rect.perimeter();
		Square squ=new Square(4);
		squ.area();
		squ.perimeter();
		Triangle tri=new Triangle(10,12,4,6,7);
		tri.area();
		tri.perimeter();

	}

}

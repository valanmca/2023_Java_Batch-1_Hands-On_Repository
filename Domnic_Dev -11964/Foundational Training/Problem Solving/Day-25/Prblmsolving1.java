package com.domnic.problemSolving;

interface Shape_Plan {
	void area();

	void perimeter();

	double PI = 3.14;
}

abstract class Shape implements Shape_Plan {
	public abstract void area();

	public abstract void perimeter();
}

class Circle extends Shape {
	int radius;

	Circle(int radius) {
		this.radius = radius;
	}

	public void area() {
		double area = PI * (radius ^ 2);
		System.out.println("Area of circle is : " + area);
	}

	public void perimeter() {
		double perimeter = 2 * PI * radius;
		System.out.println("Perimeter of circle is : " + perimeter);
	}
}

class Square extends Shape {
	int side;

	Square(int side) {
		this.side = side;
	}

	public void area() {
		double area = side * side;
		System.out.println("Area of Square is : " + area);
	}

	public void perimeter() {
		double perimeter = 4 * side;
		System.out.println("Perimeter of Square is : " + perimeter);
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
		System.out.println("Area of Rectangle is : " + area);
	}

	public void perimeter() {
		double perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of Reactangle is : " + perimeter);
	}
}

class Triangle extends Shape {
	int height;
	int breadth;
	int side1;
	int side2;
	int side3;

	Triangle(int height,int breadth,int side1,int side2,int side3){
		this.height=height;
		this.breadth=breadth;
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}

	public void area() {
		double area=(height*breadth)/2;
		System.out.println("Area of Triangle is : " + area);
	}

	public void perimeter() {
		double perimeter=side1*side2*side3;
		System.out.println("Perimeter of Triangle is : " + perimeter);
	}
}

public class Prblmsolving1 {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
		circle.area();
		circle.perimeter();

		Square square = new Square(10);
		square.area();
		square.perimeter();

		Rectangle rectangle = new Rectangle(10, 8);
		rectangle.area();
		rectangle.perimeter();
		
		Triangle triangle=new Triangle(10,8,7,7,7);
		triangle.area();
		triangle.perimeter();

	}

}

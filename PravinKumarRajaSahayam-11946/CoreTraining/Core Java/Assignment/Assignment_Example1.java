//1. Write a Java program to create a class called "Shape" with abstract methods for calculating area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".
abstract class Shape {

	abstract void area();

	abstract void perimeter();
}

class Rectangle extends Shape {
	int width;
	int length;

	Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}

	void area() {
		System.out.println("Area of the Rectangle is : " + " " + (length * width));
	}

	void perimeter() {
		System.out.println("Perimeter of the Rectangle is : " + " " + (2 * (length + width)));
	}

}

class Circle extends Shape {
	int radius;

	Circle(int radius) {
		this.radius = radius;
	}

	void area() {
		System.out.println("Area of the Circle is : " + " " + (3.14 * (radius * radius)));
	}

	void perimeter() {
		System.out.println("Perimeter of the Circle is : " + " " + (2 * (3.14 * radius)));
	}

}

class Triangle extends Shape {
	int breadth;
	int height;
	int side;
	int base;

	Triangle(int breadth, int height, int side, int base) {
		this.breadth = breadth;
		this.height = height;
		this.side = side;
		this.base = base;
	}

	void area() {
		System.out.println("Area of the Triangle is : " + " " + (1 / 2 * (breadth * height)));
	}

	void perimeter() {
		System.out.println("Perimeter of the Triangle is : " + " " + (side + base + side));
	}
}

public class Assignment_Example1 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Shape rectangle = new Rectangle(10, 30);
		rectangle.area();
		rectangle.perimeter();
		Shape circle = new Circle(40);
		circle.area();
		circle.perimeter();
		Shape triangle = new Triangle(10, 20, 30, 50);
		triangle.area();
		triangle.perimeter();
	}

}
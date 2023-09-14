package com.matthew.day15;

interface ShapePlan{
	void area();
	void perimeter();
	float pi = 3.14f;
}

abstract class Shape implements ShapePlan{
	abstract public void area();
	abstract public void perimeter();	
}
class Circle extends Shape{
	float radius;
	Circle(float radius){
		this.radius = radius;
	}
	public void area() {
		System.out.println("Area : "+(pi*radius*radius));
	}
	public void perimeter() {
		System.out.println("Perimeter : "+(2*pi*radius));
	}
}

class Square extends Shape{
	float side;
	Square(float side){
		this.side = side;
	}
	public void area() {
		System.out.println("Area : "+(side*side));
	}
	public void perimeter() {
		System.out.println("Perimeter : "+(2*side));
	}
}

class Rectangle extends Shape{
	float length,breadth;
	Rectangle(float length,float breadth){
		this.length = length;
		this.breadth = breadth;
	}
	public void area() {
		System.out.println("Area : "+(length*breadth));
	}
	public void perimeter() {
		System.out.println("perimeter : "+(2*(length+breadth)));
	}

}

class Triangle extends Shape{
	float base,height,length;
	Triangle(float base,float height,float length){
		this.base = base;
		this.height = height;
		this.length = length;
	}
	public void area() {
		System.out.println("Area : "+(0.5*(base*height)));
	}
	public void perimeter() {
		System.out.println("perimeter : "+(length+base+height));
	}

}
public class formula {

	public static void main(String[] args) {
		Circle circle = new Circle(25);
		Square square = new Square(20);
		Rectangle rectangle = new Rectangle(10.34f,20.23f);
		Triangle triangle = new Triangle(12,13,14);
		System.out.println("Circle");
		circle.area();
		circle.perimeter();
		System.out.println("Square");
		square.area();
		square.perimeter();
		System.out.println("Rectangle");
		rectangle.area();
		rectangle.perimeter();
		System.out.println("Triangle");
		triangle.area();
		triangle.perimeter();

	}

}

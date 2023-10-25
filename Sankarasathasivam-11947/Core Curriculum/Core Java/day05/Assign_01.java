package com.shiva.core.day05;

class Shape{
	void calculateArea() {
		System.out.println("Area of Shapes");
	}
}
class Circle extends Shape{
	void calculateArea() {
		System.out.println("Area of Circle = 3.14*r*r");
	}
}
class Rectangle extends Shape{
	void calculateArea() {
		System.out.println("Area of Rectangle = l*b");
	}
}
class Triangle extends Shape{
	void calculateArea() {
		System.out.println("Area of Triangle = 1/2*b*h");
	}
}
public class Assign_01 {

	public static void main(String[] args) {
		Shape obj1=new Circle();
		obj1.calculateArea();
		Shape obj2=new Rectangle();
		obj2.calculateArea();
		Shape obj3=new Triangle();
		obj3.calculateArea();

	}

}

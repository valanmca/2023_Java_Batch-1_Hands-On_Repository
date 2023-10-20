package com.jenish.day5;


 class Shape{
	double calculateArea() {
		return 0;
	}
 }
 class Circle extends Shape {
	double radius;
	Circle(double radius) {
		this.radius = radius;
	}
	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return 3.14 * radius * radius;
	}
	
}
 class Rectangle extends Shape{
	double width;
	double height;
	
	Rectangle (double width, double height){
		this.width = width;
		this.height = height;
	}

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return width * height;
	}
	
}
 class Triangle extends Shape {
	double b;
	double h;
	
	Triangle(double b, double h){
		this.b = b;
		this.h = h;
	}

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return 0.5 * b * h;
	}
}

	public class Ex_01_Shape {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(4);
		System.out.println("Area of Circle:" +circle.calculateArea());
		
		
		Rectangle rect = new Rectangle(14, 28);
		System.out.println("Area of Rectangle:" +rect.calculateArea());
		
		Triangle tri = new Triangle(5, 5);
		System.out.println("Area of Triangle:" +tri.calculateArea());
	}

	}
	

package com.mahesh.core_java_day_06;

class Shape {
	float calculateArea() {
		float shape_res = 0.0f;
		return shape_res;

	}
}

class Circle extends Shape {
	float radious = 2.3f;

	float calculateArea() {

		return (float) (2 * Math.PI * Math.sqrt(radious));
	}
}

class Rectangle extends Shape {
	float width = 6.5f, height = 3.4f;

	float calculateArea() {

		return (float) (width * height);
	}
}

class Triangle extends Shape {
	float side1 = 2.4f, side2 = 3.4f, side3 = 3.2f;

	float calculateArea() {

		return (float) (side1 + side2 + side3);
	}
}

public class Assignment_Shape {

	public static void main(String[] args) {
		
		Shape ball =new Circle();
		System.out.println("Area of Circle : "+ball.calculateArea());
		
		Shape box = new Rectangle();
		System.out.println("Area of Rectangle : "+box.calculateArea());
		
		Shape cone = new Triangle();
		System.out.println("Area of Triangle : "+cone.calculateArea());
	}
	}
	


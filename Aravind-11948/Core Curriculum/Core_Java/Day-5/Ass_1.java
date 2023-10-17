package com.core.day_05;

class Shape {

	void calculate_Area() {
		System.out.println("Area of the Shapes ");
	}

}

class Circle extends Shape {
	 void calculate_Area() {
		System.out.println("Area of the Circle ");
	}

}

class Rectangle extends Shape {
	void calculate_Area() {
		System.out.println("Area of the Rectangle");
	}

}

class Triangle extends Shape {
	void calculate_Area() {
		System.out.println("Area of the Triangle");
	}

}

public class Ass_1 {

	public static void main(String[] args) {
		Circle obj=new Circle();
		obj.calculate_Area();

		Rectangle obj1=new Rectangle();
		obj1.calculate_Area();
		
		Triangle obj2=new Triangle();
		obj2.calculate_Area();
		
		
	}

}

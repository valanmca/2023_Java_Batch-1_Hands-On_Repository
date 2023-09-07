package com.gayathri.assignment;

class Circle {
	private double radius = 1.0;
	private String colour = "red";

	Circle() {

	}

	Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius(int diameter) {
		radius = diameter / 2;
		return radius;
	}

	public double getArea() {
		double area = 3.14 * radius * radius;
		return area;
	}

	void display() {
		System.out.println("The colour of the Circle is : " + colour);
		System.out.println("The Radius is : " + getRadius(4));
		System.out.println("The Area is : " + getArea());
	}

}

public class Assignment1 {

	public static void main(String[] args) {
		Circle obj = new Circle(4);
		obj.display();
	}

}

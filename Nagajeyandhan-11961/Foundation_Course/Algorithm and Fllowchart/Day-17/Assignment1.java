package com.jeyandhan.assignment;

class Circle {

	private double radius = 1.0;
	private String color = "red";

	Circle() {

	}

	Circle(double radius) {
		this.radius = radius;
	}

	double getRadius() {
		return radius;
	}
	String getColor() {
		return color;
	}

	public double getArea() {
		double area = 3.14 * radius * radius;
		return area;
	}
}

public class Assignment1 {
	public static void main(String[] args) {
		Circle obj = new Circle(2);
		System.out.println("\t *****Circle*****");
		System.out.println("Area: " + obj.getArea());
		System.out.println("Radius: " + obj.getRadius());
		System.out.println("Radius: " + obj.getColor());
	}
}
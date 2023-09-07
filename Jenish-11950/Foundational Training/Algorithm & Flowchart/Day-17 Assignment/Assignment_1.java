package com.jenish.assignment;

class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		radius=1.0;
		color="red";
	}
	public Circle(double radius) {
		this.radius= radius;
		
	}
	public double getRadius() {
		return radius;
		
	}
	public double getArea() {
		double area = 3.14*radius*radius;
		return area;
	}
}

public class Assignment_1 {

	public static void main(String[] args) {
		Circle circle = new Circle(4.0d);
		double radius = circle.getRadius();
		double area = circle.getArea();
		System.out.println("The Radius is :" +radius);
		System.out.println("The Area is :" +area);

	}

}

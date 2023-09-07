package com.domnic.assignment;

//Assignment 1
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

	double getArea() {
		double area=(3.14*(radius*radius));
		return area;
	}

}

public class TestCircle {

	public static void main(String[] args) {
      Circle obj=new Circle(2);
      System.out.println("Area :"+obj.getArea());
      System.out.println("Radius :"+obj.getRadius());
	}

}

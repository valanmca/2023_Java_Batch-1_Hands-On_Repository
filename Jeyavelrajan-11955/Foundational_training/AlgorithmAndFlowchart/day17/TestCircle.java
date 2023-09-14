package com.jeyavel.Assignment;

class Circle {
	private double radius = 1.0;
	private String Color = "red";

	Circle() {

	}

	Circle(double radius) {
		this.radius = radius;

	}

	public double getRadius() {
		double getRadius = radius ;
		return getRadius;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		double getArea =Math.PI*radius*radius;
		return getArea;

	}

}

public class TestCircle {

	public static void main(String[] args) {
		Circle cir = new Circle();
		System.out.println(" Default value of Radius    ->"+cir.getRadius());
		System.out.println(" Default Color of the Circle->"+cir.getColor());
		cir.setRadius(4.8);
		System.out.println(" After change in Radius     ->"+cir.getRadius());
		System.out.println(" Area of the Circle         ->"+cir.getArea());
		

	}

}

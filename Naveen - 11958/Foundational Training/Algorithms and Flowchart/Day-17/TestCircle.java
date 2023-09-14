package com.naveen.day17;

class Circle {
	private double radius;
	private String color;

	public Circle() {
		radius = 1.0;
		color = "red";
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double r, String c) {
		this.radius = r;
		this.color = c;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setColor(String newColor) {
		this.color = newColor;
	}

	public double getRadius() {
		return this.radius;
	}

	public String getColor() {
		return this.color;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public String toString() {
		return "Circle[radius=" + radius + " color=" + color + "]";
	}
}

public class TestCircle { 
	public static void main(String[] args) { 
		Circle c1 = new Circle(); 
		System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());    
		Circle c2 = new Circle(2.0); 
		System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());    
		Circle c4 = new Circle();
        System.out.println("radius is: " + c4.getRadius()); 
       
        System.out.println("color is: " + c4.getColor());   
       
        Circle c3 = new Circle(3.5,"blue");  
        System.out.println("radius is: " + c3.getRadius());  
        System.out.println("color is: " + c3.getColor());  c3.setRadius(2.5); c3.setColor("black");  
        System.out.println("radius is: " + c3.getRadius());  
        System.out.println("color is: " + c3.getColor()); 
        } 
}

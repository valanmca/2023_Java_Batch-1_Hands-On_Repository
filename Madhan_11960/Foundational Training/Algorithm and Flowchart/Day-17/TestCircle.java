package com.madhan.day17;

class Circle
{
	private double radius;
	private String color;
	
	
	public Circle()
	{
		System.out.println("Default Constructor");
		radius=1.0;
		color="red";
	}
	
	public Circle(double radius)
	{
		System.out.println("Parameterized constructor");
		this.radius=radius;
		color="red";
	}

	public double getRadius() {
		return radius;
	}
    
//	public String getColor()
//	{
//		return color;
//	}
	
	public double getArea() {
		return radius*radius*3.14;
	}
	
}

public class TestCircle {

	public static void main(String[] args) {
		Circle c1=new Circle();
		System.out.println("The circle has radius of : " + c1.getRadius() + " and area of circle is : " + c1.getArea());
//        System.out.println(c1.getColor());
		Circle c2=new Circle(12.0);
		System.out.println("The circle has radius of : " + c2.getRadius() + " and area of circle is : " + c2.getArea());
//		 System.out.println(c2.getColor());
	}

}

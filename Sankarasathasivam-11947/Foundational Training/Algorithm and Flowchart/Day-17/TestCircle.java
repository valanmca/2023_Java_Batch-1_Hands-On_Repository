package com.shiva.day17;

class Circle
{
	private double radius=1.0;
	private String color="Red";
	double area;
	
	Circle()
	{
		System.out.println("Default value = 1.0");
		System.out.println("Color = Red");
	}
	
	Circle(double radius)
	{
		this.radius=radius;
	}
	
	public double getradius()
	{
		radius=2*radius;
		return radius;
	}
	
	public double getArea()
	{
		area=3.14*radius*radius;
		return area;
	}
	
	void display()
	{
		System.out.println("radius of the circle : "+getradius());
		System.out.println("Area of the circle : "+getArea());
	}
}
public class TestCircle {

	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.display();

	}

}

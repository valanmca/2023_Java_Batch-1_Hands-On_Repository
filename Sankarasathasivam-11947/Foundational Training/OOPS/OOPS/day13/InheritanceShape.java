package com.shiva.day13;

class Shape
{
	void area()
	{
		System.out.println("No area is available");
	}
}

class Rectangle extends Shape
{
	void area()
	{
		System.out.println("Area of Rectangle is l*b");
	}
}

class Circle extends Rectangle
{
	void area()
	{
		System.out.println("Area of circle is 3.14*r^2");
	}
}
public class InheritanceShape {

	public static void main(String[] args) {
		
		Rectangle shape=new Circle();
		shape.area();
		

	}

}

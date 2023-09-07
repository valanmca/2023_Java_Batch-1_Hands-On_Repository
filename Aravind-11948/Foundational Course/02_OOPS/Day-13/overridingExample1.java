package com.aravind.day13;
class Shape
{
	void area()
	{
		System.out.println("we cannot define area");
	}
}
class Rectangle extends Shape
{
	void area()
	{
	System.out.println("we can perform using length and breadth");
		
	}
}
class Circle extends Shape
{
	void area()
	{
		System.out.println("we can perform using pi*r^2");
	}
}

public class overridingExample1 {

	public static void main(String[] args) {
		
		Rectangle obj=new Rectangle();
		obj.area();
		
		Circle obj1=new Circle();
		obj1.area();
		

	}

}

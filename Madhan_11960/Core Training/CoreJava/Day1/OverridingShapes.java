package com.madhan.coreday1;

class Shape
{
	int length=10;
	int breadth=20;
	
	void getArea()
	{
		System.out.println("All shapes have different");
	}
}

class Rectangle extends Shape
{
	void getArea()
	{
		System.out.println("Area of Rectangle :"+(length* breadth));
	}
}

public class OverridingShapes {

	public static void main(String[] args) {
		Rectangle obj=new Rectangle();
		obj.getArea();

	}

}

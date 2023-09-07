package com.madhan.day10;

class Rectangle
{
	float length;
	float breadth;
	float area;
	float Perimeter;
	
	Rectangle(float length,float breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	void Area()
	{
		 area=length*breadth;
		System.out.println("Area of Rectangle :" +area);
	}
	
	void Perimeter()
	{
		 Perimeter=2*(length+breadth);
		System.out.println("Area of Perimeter :" +Perimeter);
	}
	
	
}

class Square extends Rectangle
{
	float s;
	Square(float length,float breadth,float s)
	{
		super( length, breadth);
		this.s=s;
	}
	
	void display()
	{
		System.out.println("Area of Rectangle :" +area);
		System.out.println("Area of Perimeter :" +Perimeter);
	}
	
	
	
}

public class Ass2usingShapes {

	public static void main(String[] args) {
		
		
		Square obj2=new Square(2.0f,2.0f,2.0f);
		obj2.Area();
		obj2.Perimeter();
		obj2.display();

	}

}

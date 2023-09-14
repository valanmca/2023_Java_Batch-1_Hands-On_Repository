package com.shiva.day10;

class Rectangle
{
	float length;
	float breadth;
	float area;
	float perimeter;
	
	Rectangle(float length,float breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	void area()
	{
		area=length*breadth;
		System.out.println("Area of the Rectangle : "+area);
	}
	
	void perimeter()
	{
		perimeter=2*(length*breadth);
		System.out.println("Area of the perimeter : "+perimeter);
	}
	
}
class Square extends Rectangle
	{
		int s;
		Square(float length,float breadth,int s)
		{
			super(2,2);
			this.s=s;
		}
		
		void display()
		{
			System.out.println("Area of Rectangle:"+area);
			System.out.println("Area of Perimeter:"+perimeter);
		}
	}	

public class Assign2 {

	public static void main(String[] args) {
		
		Square obj=new Square(2.0f,2.0f,2);
		obj.area();
		obj.perimeter();
		obj.display();
		
	}

}

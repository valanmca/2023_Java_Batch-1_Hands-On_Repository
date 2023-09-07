package com.aravind.day10;
class Rectangle{
	float length;
	float breadth;
	float area;
	float perimeter;
	Rectangle(float length,float breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	void Area()
	{
		area=length*breadth;
		//System.out.println("Area ="+area);
	}
	void Perimeter()
	{
		perimeter=2*(length+breadth);
		//System.out.println("Perimeter ="+perimeter);
	}
}

class Square extends Rectangle{

	float s;
	Square(float length,float breadth,float s)
	{
		super(length,breadth);
		
		this.s=s;
	}
	
	
	void display()
	{
		
		System.out.println("Area ="+area);
		System.out.println("Perimeter ="+perimeter);
		System.out.println(area);
		System.out.println(perimeter);
		
	}
	
	
}



public class Ass2shapes {

	public static void main(String[] args) {
		//Rectangle obj=new Rectangle(12.0f,2.0f);
		//obj.Area();
		//obj.Perimeter();
		Square obj2=new Square(4.0f,9.35f,3.35f);
		obj2.Area();
		obj2.Perimeter();
		obj2.display();
		

	}

}

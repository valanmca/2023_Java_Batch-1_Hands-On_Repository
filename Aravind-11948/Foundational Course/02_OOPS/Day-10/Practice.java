package com.aravind.day10;
class Rectangle1
{
	int length;
	int breadth;
	int area;
	int perimeter;
	Rectangle1(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	void print()
	{
		System.out.println("class rectagle"); 
	}
	int Area()
	{
		int area=length*breadth;
		return area;
	}
	int Perimeter()
	{
		 int perimeter=2*(length+breadth);
		return perimeter;
		
	}
	
	
	
	
}

class Square1 extends Rectangle 
{ 
	int s;
	Square1(int length,int breadth,int s)
	{
		super(length,breadth);
		this.s=s;
	}
	void area ()
	{
		System.out.println(s*s);
		System.out.println(2*(s+s));
		
	}
	void display()
	{
		System.out.println(area);
		System.out.println(perimeter);
	}
	
	
}

public class Practice {

	public static void main(String[] args) {
		//Rectangle1 obj=new Rectangle1(2,2);
		//obj.display();
		Square1 obj1=new Square1(2,2,2);
		obj1.Area();
		obj1.Perimeter();
		obj1.display();
		obj1.area();
		
		

	}

}

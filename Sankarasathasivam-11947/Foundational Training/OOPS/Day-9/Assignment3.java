package com.shiva.day09;

class Box
{
	//Variable
	float height;
	float width;
	float breadth;
	float volume;
	float area;
		
	//constructor
	Box(float height,float width, float breadth)
	{
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	
	//Method
	float getvolume()
	{
		volume=height*width*breadth;
		return volume;
	}
	
	float getarea()
	{
		area=2*breadth*height;
		return area;
	}
	
	void display()
	{
		System.out.println("Volume : "+getvolume());
		System.out.println("Area : "+getarea());
	}
}


public class Assignment3 {
	

	public static void main(String[] args) {
		Box obj1=new Box(2.0f,2.0f,2.0f);
		obj1.display();
		Box obj2=new Box(2,2,2);
		obj2.display();

	}

}

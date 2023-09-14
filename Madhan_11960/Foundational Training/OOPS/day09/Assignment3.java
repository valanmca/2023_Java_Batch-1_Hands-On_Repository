package com.madhan.day09;

class Box
{
	float height;
	float width;
	float breadth;
	float volume;
	float area;
	
	Box(float height,float width,float breadth)
	{
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	
	float getVolume()
	{
		volume=height*width*breadth;
		return volume;
	}
	
	float getArea()
	{
		area=2*breadth*height+width*height;
		return area;
	}
	
	void display()
	{
		System.out.println("Volume:"+getVolume());
		System.out.println("Area:"+getArea());
	}
}

public class Assignment3 {

	public static void main(String[] args) {
		Box obj1=new Box(4.0f,4.0f,4.0f);
		obj1.display();
        Box obj2=new Box(2,2,2);
        obj2.display();
	}

}

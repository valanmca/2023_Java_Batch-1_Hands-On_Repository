package com.aravind.day9;
class Box{
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
	
	float  getVolume()
	{
		 volume=height*width*breadth;
		return volume;
		
	}
	float getArea()
	{
		area=2*(breadth*width+breadth*height+width*height);
		return area;
	}
	void display()
	{
		System.out.println("volume="+getVolume());
		System.out.println("area ="+getArea());
	}
	
}

public class Ass3 {

	public static void main(String[] args) {
		Box obj=new Box(2.0f,2.0f,2.0f);
		obj.display();
		Box obj2=new Box(3.0f,3.0f,3.0f);
		obj2.display();
		
		

	}

}

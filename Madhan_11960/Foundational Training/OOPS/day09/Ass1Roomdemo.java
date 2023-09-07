package com.madhan.day09;

class Room
{
	float height=2.0f;
	float width=2.0f;
	float breadth=2.0f;
	
//	Room(float height,float width,float breadth)
//	{
//		this.height=height;
//		this.width=width;
//		this.breadth=breadth;
//	}
	
	void volume()
	{
		float volume=height*width*breadth;
		System.out.println(volume);
	}
}

public class Ass1Roomdemo {
	

	public static void main(String[] args) {
		Room obj=new Room();
		obj.volume();

	}

}

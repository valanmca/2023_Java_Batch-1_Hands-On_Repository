package com.shiva.day09;

class Room
{
	//Variable
	float height=2.0f;
	float width=2.0f;
	float breadth=2.0f;
		
	//constructor
//	Room(float height,float width, float breadth)    if we use constructor the value will be given to main function
//	{
//		this.height=height;
//		this.width=width;
//		this.breadth=breadth;
//	}
	
	//Method
	void volume()
	{
		float volume=height*width*breadth;
		System.out.println("The height : "+height);
		System.out.println("The width : "+width);
		System.out.println("The breadth : "+breadth);
		System.out.println("volume of the Room : "+volume);
	}
}

public class RoomDemo {

	public static void main(String[] args) {
		
		Room obj=new Room();
		obj.volume();

	}

}

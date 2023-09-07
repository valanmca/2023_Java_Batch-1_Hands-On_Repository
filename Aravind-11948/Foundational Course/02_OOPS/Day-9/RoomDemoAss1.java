package com.aravind.day9;
class Room{
	float height;
	float width;
	float breadth;
	
	Room(float height,float width,float breadth)
	{
		this.height=height;
		this.width=width;
		this.breadth=breadth;
		
	}
	
	void Volume()
	{
		float volume=height*width*breadth;
		System.out.println("volume ="+volume);
		
	}
}

public class RoomDemoAss1 {

	public static void main(String[] args) {
		Room obj=new Room(12.0f,34.0f,56.0f);
		obj.Volume();
		

	}

}

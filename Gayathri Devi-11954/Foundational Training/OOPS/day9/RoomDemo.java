package com.gayathri.day9;

class Room
{
	int height;
	int width;
	int breath;
	
	Room(int height,int width, int breath)
	{
		this.height = height;
		this.breath = breath;
		this.width = width;
	}
	void volume()
	{
		int ans = height*width*breath;
		System.out.println("The volume of the room : "+ans);
	}
}
public class RoomDemo {

	public static void main(String[] args) {
		Room obj = new Room(5,5,5);
		obj.volume();

	}

}

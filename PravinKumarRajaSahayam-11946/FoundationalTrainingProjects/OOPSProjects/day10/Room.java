//OOPS_Exs_11
/*Create a class "Room" which will hold the "height" , "width" , and , "breadth" , of the room in three fields.
This class also has a method "volume()" to calculate the volume of this room.Create another class 
"RoomDemo" which will use the earlier class,create instance of rooms, and, display the volume of room*/
package com.pravinkumar.day10;

public class Room {
	// Variables
	float height;
	float width;
	float breadth;
	float total;

	// Constructors
	Room(float height, float width, float breadth) {
		this.height = height;
		this.width = width;
		this.breadth = breadth;
		this.total = (height * width * breadth);
	}

	// Method
	void volume() {
		System.out.println("The height is : " + height);
		System.out.println("The width is : " + width);
		System.out.println("The breadth is : " + breadth);
		System.out.println("The Volume of the Room : " + total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room RoomDemo = new Room(1.1f, 2.1f, 3.1f);
		RoomDemo.volume();

	}

}

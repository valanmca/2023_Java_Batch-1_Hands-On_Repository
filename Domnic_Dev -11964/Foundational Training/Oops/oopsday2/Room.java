package com.domnic.day9;

class RoomDemo{
	// variables
	int height;
	int width;
	int breadth;

	// constructors
	RoomDemo(int height, int width, int breadth) {
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}

	void volume() {
		int volume = (height * width * breadth);
		System.out.println(volume);
	
}
public class Room {
}


		public static void main(String[] args) {
               RoomDemo obj=new RoomDemo(14,10,20);
               obj.volume();
		
	}
}

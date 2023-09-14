package com.domnic.day9;

class Room{
	// variables
	int height;
	int width;
	int breadth;

	// constructors
	Room(int height, int width, int breadth) {
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}

	void volume() {
		int volume = (height * width * breadth);
		System.out.println(volume);
	
}
public class RoomDemo {
}


		public static void main(String[] args) {
               Room obj=new Room(14,10,20);
               obj.volume();
		
	}
}


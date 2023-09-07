package com.naveen.day9;

class Room {
	// Variables
	int height;
	int width;
	int breadth;

	// Constructor
	Room(int height, int width, int breadth) {
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}

	// Method
	void volume() {
		int volume = height * width * breadth;
		System.out.println("The Volume of the room is :" + volume);
	}

}

public class RoomDemo {

	public static void main(String[] args) {
		Room volume = new Room(12, 22, 10);
		volume.volume();

	}

}

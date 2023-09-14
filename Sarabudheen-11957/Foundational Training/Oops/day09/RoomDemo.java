/***** Creating Method for volume of the Room... *****/
package com.sara.day09;

class Room {
	int height;
	int width;
	int breadth;

	void volume(int height, int width, int breadth) {
		int volume = height * width * breadth;
		System.out.println("The volume of the Room is : " + volume);
	}
}

public class RoomDemo {

	public static void main(String[] args) {
		Room obj1 = new Room();
		obj1.volume(10, 20, 20);
	}

}

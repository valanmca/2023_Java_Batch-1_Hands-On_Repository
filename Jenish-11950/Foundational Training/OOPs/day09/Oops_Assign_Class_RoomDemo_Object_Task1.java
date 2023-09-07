package com.jenish.day09;

class Room{
	float height;
	float width;
	float breath;

	Room(float height,float width,float breath) {
		this.height=height;
		this.width=width;
		this.breath=breath;
	}
	void volume(){
		float volume=height*width*breath;
		System.out.println("Volume: "+volume);
	}
}
public class Oops_Assign_Class_RoomDemo_Object_Task1 {

	public static void main(String[] args) {
		Room obj =new Room(75.7f, 50.2f, 32.3f);
		obj.volume();

	}

}

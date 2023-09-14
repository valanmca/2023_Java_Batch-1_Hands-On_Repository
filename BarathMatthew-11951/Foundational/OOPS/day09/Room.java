package com.matthew.day09;

public class Room {
	float height;
	float width;
	float breadth;
	
	Room(float height,float width,float breadth){
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	} 
	void volume() {
		System.out.println("The volume of the classRoom is : "+ (height*width*breadth));
	}
	public static void main(String[] args) {
		  
		//creating an object
		Room RoomDemo = new Room(12.3f,53.2f,67.7f);
		RoomDemo.volume();

	}

}

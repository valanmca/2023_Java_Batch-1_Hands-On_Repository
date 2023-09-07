package com.shaji.Day09;

class Room{
	//Variables
		float height, width, breadth;
		
		//Constructor
		Room(float height, float width, float breadth){
			this.height = height;
			this.width = width;
			this.breadth = breadth;
		}
		void display() {
			System.out.println("Height of the Room : "+height);
			System.out.println("Width of the Room : "+width);
			System.out.println("Breadth of the Room : "+breadth);
		}
		void volume(){
			System.out.println("The Volume of the Room is "+(height*width*breadth));
		}
}

public class RoomDemo {

	public static void main(String[] args) {
		Room obj = new Room(64.0f, 70.0f, 97.0f);
		obj.display();
		
		obj.volume();

	}

}

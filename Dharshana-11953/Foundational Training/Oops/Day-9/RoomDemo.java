package com.dharshu.day9;

class Room{
	int height;
	int width;
	int breadth;
	
	Room(int height,int width,int breadth){
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	
	
	//public class RoomDemo{
		void volume() {
			System.out.println("Room Height:"+height);
			System.out.println("Room width:"+width);
			System.out.println("Room Breadth:"+breadth);
			int res=height*width*breadth;
			System.out.println("The Volume of the room is:"+res);
			}
	//}
}

public class RoomDemo {

	public static void main(String[] args) {
		Room obj=new Room(2,2,2);
		obj.volume();
		

	}

}

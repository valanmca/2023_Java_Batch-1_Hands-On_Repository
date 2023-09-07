package com.swetha.day9;
class Room {
	int height;
	int width;
	int breadth;
	
	//constructor
	Room(int height,int breadth,int width){
		this.height=height;
		this.breadth=breadth;
		this.width=width;
	}
	void Volume() {
		int vol=height*breadth*width;
		System.out.println(vol);
	}
}
public class RoomDemo{
	public static void main(String[] args) {
		Room obj=new Room(2,3,4);
		obj.Volume();
		
		
	}

}

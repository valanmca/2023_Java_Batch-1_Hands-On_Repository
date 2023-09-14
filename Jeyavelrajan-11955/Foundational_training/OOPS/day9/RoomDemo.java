package com.jeyavel.OOPS.day9;


class Room{
	 int height ;
	 int width;
	 int weight;
	 
	 //constructor
	 Room(int height,int width,int weight){
		 this.height=height;
		 this.weight=weight;
		 this.width=width;
	 }
	
	
	
	void volume() {
		int vol=height*width*weight;
		System.out.println("The volume of the Room is ->`"+vol);
	}
}

public class RoomDemo {

	public static void main(String[] args) {
		
		Room Obj1=new Room(2,2,2);
		System.out.println("The Volume Of The Room is ");
		Obj1.volume();
		
		
		

	}

}

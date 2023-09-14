package com.jeban.OOPsday2;


class Room{
	int hight;
	int widht;
	int breadth;
	
	Room(int hight,int widht,int breadth){
		this.hight=hight;
		this.widht=widht;
		this.breadth=breadth;
		
	}
	void volume() {
		int volume=hight*widht*breadth;
		System.out.println("Volume:"+volume);
		
	}
}

public class RoomDemo {

	public static void main(String[] args) {
		Room obj1=new Room(2,2,2);
		obj1.volume();
		

	}

}




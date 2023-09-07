package com.mahesh.Oops_day9;

class Room
{
	int length,width,height;

Room(int length,int width,int height)
{
	this.length = length;
	this.height=height;
	this.width = width;
}

int volume()
{
	int volume = (this.height*this.length*this.width);
	return volume;
}

void disp()
{
	System.out.println("ROOM HEIGHT IS: "+height);
	System.out.println("ROOM WIDTH IS: "+width);
	System.out.println("ROOM LENGTH IS: "+length);
	System.out.println("ROOM VOLUME IS: "+volume()+"\n\n");
}
}

public class RoomDemo {

	public static void main(String[] args) {
		
		Room mahesh = new Room(3,3,3);
		mahesh.disp();
		
		Room mathew = new Room(8,7,6);
		mathew.disp();
		
		
	}

}

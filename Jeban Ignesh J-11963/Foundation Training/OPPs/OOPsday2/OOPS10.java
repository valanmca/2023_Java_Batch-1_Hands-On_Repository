package com.jeban.OOPsday2;

class Box{
	int height;
	int width;
	int breadth;
	
	Box(int height,int width,int breadth){
		this.height=height;
		this.width=width;
		this.breadth=breadth;
		
	}
	int getvolume(){
		int volume=height*width*breadth;
		return volume;
	}
	int getarea() {
		int area=height*breadth;
		return area;
	}
	void display() {
		System.out.println("Hight:"+height);
		System.out.println("Widhth:"+width);
		System.out.println("Breadth:"+breadth);
		System.out.println("Volume:"+getvolume());
		System.out.println("Area:"+getarea());
		
	}
}

public class OOPS10 {

	public static void main(String[] args) {
		Box obj1=new Box(155,100,155);
		obj1.display();


	}

}

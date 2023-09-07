package com.purushoth.day9;

class Box{
	int height;
	int width;
	int breadth;
	
	Box(int height,int width,int breadth){
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	
	int getVolume() {
		int volume=height*width*breadth;
		return volume;
		
	}
	
	int getArea() {
		int area=height*width;
		return area;
	}
	
	void display() {
		System.out.println("Height is: "+height);
		System.out.println("Width is: "+width);
		System.out.println("Breadth is: "+breadth);
		System.out.println("Volume is: "+getVolume());
		System.out.println("Area is: "+getArea());
	}
}
public class BoxClass {

	public static void main(String[] args) {
		Box obj=new Box(15,3,4);
		obj.display();
		
		}

}//Create Box class and find volume,box.

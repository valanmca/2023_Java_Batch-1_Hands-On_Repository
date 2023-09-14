package com.shaji.Day09;

public class Box {
	
	//Variables
	float height,width,breadth,volume,area;
	
	//Constructor
	Box(float height, float width, float breadth){
		this.height=height;
		this.width=width;
		this.breadth=breadth;                                                                                            
	}
	
	//Method
	float getVolume() {
		volume = height*width*breadth;
		return volume;
	}
	
	float getArea() {
		area = ((2*(breadth*width)+(2*(breadth*width))+(2*(height*width))));
		return area;
	}
	void display() {
		System.out.println("Height of the Box : "+height);
		System.out.println("Width of the Box : "+width);
		System.out.println("Breadth of the Box : "+breadth);
		System.out.println("Volume of the Box : "+getVolume());
		System.out.println("Area of the Box : "+getArea());
	}

	public static void main(String[] args) {
		Box obj = new Box(78.5f, 90.3f, 76.4f);
		obj.display();

	}

}

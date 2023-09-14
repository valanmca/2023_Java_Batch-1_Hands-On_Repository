/******* Height,Width,Breadth,Volume and Area of the Box...********/
package com.sara.day09;

class box {
	//Variables
	int height;
	int width;
	int breadth;

	box(int height, int width, int breadth) {
		//Constructor
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}

	//Methods
	int getVolume() {
		int volume = height * width * breadth;
		return volume;
	}

	int getArea() {
		int area = height * breadth;
		return area;
	}

	void display() {
		System.out.println("Height of the Box is : " + height);
		System.out.println("Width of the Box is : " + width);
		System.out.println("Breadth of the Box is : " + breadth);
		System.out.println("Volume of the Box is : " + getVolume());
		System.out.println("Area of the Box is : " + getArea());
	}
}

public class Day9_Assignment03 {

	public static void main(String[] args) {
		box obj1 = new box(20, 20, 10);
		obj1.display();

	}

}

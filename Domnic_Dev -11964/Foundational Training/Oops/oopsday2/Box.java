package com.domnic.day9;

public class Box {
	int height;
	int width;
	int breadth;

	Box(int height, int width, int breadth) {
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}

	int getVolume() {
		int volume = height * width * breadth;
		return volume;
	}

	int getArea() {
		int area = height * breadth;
		return area;
	}
	
	void display() {
		System.out.println("Height is :"+height);
		System.out.println("Width is :"+width);
		System.out.println("breadth is :"+breadth);
		System.out.println("Volume is :"+getVolume());
		System.out.println("Area is :"+getArea());
		
	}

	public static void main(String[] args) {
		Box obj = new Box(20,10,15);
		obj.getVolume();
		obj.getArea();
		obj.display();
		
	}

}

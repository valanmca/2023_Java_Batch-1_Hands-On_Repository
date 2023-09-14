package com.naveen.day9;

class Box {
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
		int area = (2 * height) + (2 * width) + (2 * breadth);
		return area;
	}

	void display() {
		System.out.println("The height is : " + height);
		System.out.println("The Width is : " + width);
		System.out.println("The Breadth is : " + breadth);
		System.out.println("The Volume of Box : " + getVolume());
		System.out.println("The Area of Box : " + getArea());
	}
}

public class BoxClass {

	public static void main(String[] args) {
		Box obj = new Box(12, 22, 10);
		obj.display();

	}

}

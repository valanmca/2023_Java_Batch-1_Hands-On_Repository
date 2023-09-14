//Volume and area of box

package com.jeyandhan.day09;

public class Box {

	int height, width, breadth, volume, area;

	Box(int height, int width, int breadth) {
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}

	int getVolume() {
		volume = height * width * breadth;
		System.out.println("Volume:" + volume);
		return volume;
	}

	int getArea() {
		area = ((2 * (breadth * width)) + (2 * (breadth * height)) + (2 * (height * width)));
		System.out.println("Area:" + area);
		return area;

	}

	void disp() {
		System.out.println("");
		System.out.println("Height" + height);
		System.out.println("Width: " + width);
		System.out.println("Breadth: " + breadth);
		System.out.println("Breadth: " + getVolume());
		System.out.println("Breadth: " + breadth);

	}

	public static void main(String[] args) {
		Box box1 = new Box(5, 2, 6);

		box1.disp();

		Box box2 = new Box(4, 7, 9);
		box2.disp();

	}

}

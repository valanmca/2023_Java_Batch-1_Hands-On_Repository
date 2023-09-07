package com.jeyavel.OOPS.day9;

class Box {
	int height, width,bredth;

	Box( int height, int width, int bredth) {
		this.bredth = bredth;
		this.height = height;
		this.width = width;
	}

	int getarea() {
		int getarea = bredth * height;

		return getarea;

	}

	int getvolume() {
		int getvolume = bredth * height * width;
		return getvolume;

	}
	
	void display() {
		System.out.println("Box length"+bredth);
		System.out.println("Box bredth"+height);
		System.out.println("Box Width "+width);
		System.out.println("Area   of the Box ->"+getarea());
		System.out.println("Volume of the Box ->"+getvolume());
	}
}

public class Boxcc {

	public static void main(String[] args) {
		Box obj = new Box(12,12,12);
		obj.display();

	}

}

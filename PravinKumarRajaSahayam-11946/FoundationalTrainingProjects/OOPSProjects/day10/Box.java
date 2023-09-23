/*Write a class "Box" that with three member - variables "height" , "width" , and , "breadth" , write suitable
 * Constructors to initialize them.Add functions like "getVolume" and "getArea" that will return volume and surface 
 * area respectively.Instantiate two arbitary boxes and them print thier volume and surfaces arealsi*/

package com.pravinkumar.day10;

public class Box {

	// Variables
	float height;
	float width;
	float breadth;

	// Constructors
	Box(float heigth, float width, float breadth) {
		this.height = heigth;
		this.width = width;
		this.breadth = breadth;
	}

	float getVolume() {
		float volume = (height * width * breadth);
		return volume;
	}

	float getArea() {
		float area = (2 * (breadth * width) + 2 * (breadth * height) + 2 * (height * breadth));
		return area;
	}

	// Method
	void detail() {
		System.out.println("The height is : " + height);
		System.out.println("The width is : " + width);
		System.out.println("The breadth is : " + breadth);
		System.out.println("The volume is : " + getVolume());
		System.out.println("The area is : " + getArea());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box obj = new Box(1.1f, 2.1f, 3.1f);
		obj.detail();

	}

}

package com.gayathri.day1;
/*
 Write a java program to create a class called shape with a method called getArea().
 Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
 
 */
 
class Shape {
	
	void getArea() {
		System.out.println("All shapes has its own area formula.");
	}
}

class Rectangle extends Shape {
	int l, b;

	Rectangle(int l, int b) {
		this.l = l;
		this.b = b;
	}

	void getArea() {
		//super.getArea();
		System.out.println("Area of rectangle : " + (l * b));
	}
}

public class ShapeCalssEx3 {

	public static void main(String[] args) {
		Rectangle obj = new Rectangle(5, 5);
		obj.getArea();

	}

}

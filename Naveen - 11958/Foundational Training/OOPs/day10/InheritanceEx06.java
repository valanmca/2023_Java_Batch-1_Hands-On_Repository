package com.naveen.day10;

class Rectangle {
	int length;
	int breadth;

	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	int getArea() {
		int area = length * breadth;
		return area;
	}

	int getPerimeter() {
		int perimeter = 2 * (length + breadth);
		return perimeter;
	}

}

class Square extends Rectangle {

	Square(int side) {
		super(side, side);
	}

	int getArea1() {
		int area = (getArea() * getArea());
		return area;
	}

	int getPerimeter1() {
		int perimeter = 4 * getArea();
		return perimeter;
	}

	void display() {
		System.out.println("Area of the Rectangle : " + getArea());
		System.out.println("Perimeter of the Rectangle : " + getPerimeter());
		System.out.println("Area of Square :" + getArea1());
		System.out.println("Perimeter of the Square : " + getPerimeter1());

	}

}

public class InheritanceEx06 {

	public static void main(String[] args) {

		Square obj1 = new Square(12);
		obj1.display();
	}

}

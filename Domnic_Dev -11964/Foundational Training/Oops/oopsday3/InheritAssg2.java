package com.domnic.oopsday3;

class Rectangle {
	int length;
	int breadth;

	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	int Area() {
		int area = length * breadth;
		return area;
	}

	int Perimeter() {
		int perimeter = 2 * (length + breadth);
		return perimeter;
	}

}

class Square extends Rectangle {
	int side;

	Square(int length, int breadth, int side) {
		super(length, breadth);
		this.side = side;
	}

	void display() {
		System.out.println("Area of square :" + (side * side));
		System.out.println("Perimeter of square :" + (4 * side));
		System.out.println("Area of rectangle :" + Area());
		System.out.println("Perimeter of rectangle :" + Perimeter());

	}
}

public class InheritAssg2 {

	public static void main(String[] args) {
		Square obj1 = new Square(10, 20, 5);
		obj1.display();
	}

}

/******** Area and Perimeter of Rectangle and Square... ********/
package com.sara.day10;

class rectangle {
	int length;
	int breadth;

	rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	int area() {
		int area = length * breadth;
		return area;
	}

	int perimeter() {
		int perimeter = 2 * (length + breadth);
		return perimeter;
	}

}

class square extends rectangle {
	int side;

	square(int length, int breadth, int side) {
		super(length, breadth);
		this.side = side;
	}

	void diaplay() {
		System.out.println("Area of Square:" + (side * side));
		System.out.println("Perimeter of Square:" + (4 * side));
		System.out.println("The Area is : " + area());
		System.out.println("The Perimeter is : " + perimeter());

	}

}

public class Inheritance_Assignment02 {

	public static void main(String[] args) {
		square sq = new square(10, 20, 8);
		sq.diaplay();

	}

}

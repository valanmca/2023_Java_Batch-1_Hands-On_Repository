
//Single Inheritance
package com.jeyavel.OOPS.day10;

class Rectangle {
	int length;
	int breadth;

	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	int area() {
		int area = length * breadth;
		return area;
	}

	int areaPremeter() {
		int areaPremeter = 2*(length+breadth);
		return areaPremeter;
	}

}

class Square extends Rectangle{
	int side;
	
	Square(int length, int breadth,int side){
		super(length,breadth);
		this.side=side;
		
	}
	int area1() {
		int area1 = side * side;
		return area1;
	}

	int areaPremeter1() {
		int areaPremeter1 = (4*side);
		return areaPremeter1;
	}
	void display() {
		System.out.println("Area of the Square is         ->"+area1());
		System.out.println("Parameter of the Square is    ->" + areaPremeter1());
		System.out.println("Area of the rectangle is      ->"+area());
		System.out.println("Parameter of the rectangle is ->" + areaPremeter());
	}
	
	
}

public class OopsTask2 {

	public static void main(String[] args) {
		
		
		Square obj2 =new Square(12,18,8);
		obj2.display();

	}

}

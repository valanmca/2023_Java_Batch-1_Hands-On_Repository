package com.purushoth.day10;

class Rectangle{
	int length;
	int breadth;
	
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	int area() {
		int area=length*breadth;
		return area;
	}
	
	int perimeter() {
		int perimeter=2*(length+breadth);
		return perimeter;
		}
}

class Square extends Rectangle{
	 int side;
	Square(int length,int breadth,int side){
	super(length,breadth);
	this.side=side;
	}
	
	int area1() {
		int area1=(side*side);
		return area1;
	}
	
	int perimeter1() {
		int perimeter1=4*side;
		return perimeter1;
	}
	
	void display() {
		System.out.println("Area of rectangle: "+area());
		System.out.println("Perimeter of rectangle: "+perimeter());
		System.out.println("Area of Square: "+area1());
		System.out.println("Perimeter of Square: "+perimeter1());
		
	}
	
}
public class RectangleInheritance {

	public static void main(String[] args) {
		Square sq=new Square(8,12,8);
		sq.display();

	}

}//Inheritance for square and rectangle.

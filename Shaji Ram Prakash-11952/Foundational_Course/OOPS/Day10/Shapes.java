package com.shaji.Day10;

class Rectangle{
	
	int length,breadth,area,perimeter;
	
	Rectangle(int length, int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	int getArea() {
		area = length*breadth;
		return area;
	}
	
	int getPerimeter() {
		perimeter = 2*(length+breadth);
		return perimeter;
	}
	
	void displayRect() {
		System.out.println("Area of Rectangle : "+getArea());
		System.out.println("Perimeter of Rectangle : "+getPerimeter());
	}
}

class Square extends Rectangle{
	int s;
	Square(int length, int breadth, int s){
	super(length,breadth);
	this.s=s;
	}
	
	int getArea1() {
		area = s*s;
		return area;
	}
	
	int getPerimeter1() {
		perimeter = 4*s;
		return perimeter;
	}
	
	void displaySquare(){
		System.out.println("Area of Square : "+getArea1());
		System.out.println("Perimeter of Square : "+getPerimeter1());
	}
}

public class Shapes {

	public static void main(String[] args) {
		Square shape = new Square(14,24,10);
		shape.displayRect();
		
		System.out.println("\n");
		
		shape.displaySquare();

	}

}

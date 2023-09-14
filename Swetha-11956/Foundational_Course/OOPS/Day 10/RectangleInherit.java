package com.swetha.day10;
class Rectangle{
	int length;
	int breadth;
	
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	
}
	int area() {
		int a=length*breadth;
		return a;
		
	}
	int perimeter() {
		int perimeter=2*(length+breadth);
		return perimeter;
			
	}		
	}
class Square extends Rectangle{

	Square(int side) {
		super(side,side);
		
	}
	int area1() {
		int a1=area()*area();
		return a1;
	}
	int perimeter1() {
		int perimeter1=4*area();
		return perimeter1;
	}
	void display() {
		System.out.println("Area of square is :"+area1());
		System.out.println("Perimeter of square is :"+perimeter1());
		System.out.println("Area of Rectangle is :"+area());
		System.out.println("Perimeter of Rectangle is :"+perimeter());
	}
	
	
}

public class RectangleInherit {

	public static void main(String[] args) {
		Square obj=new Square(3);
		obj.display();
	}

}

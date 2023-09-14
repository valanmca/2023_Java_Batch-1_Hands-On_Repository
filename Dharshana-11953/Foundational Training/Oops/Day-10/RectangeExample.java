package com.dharshu.day10;

class Rectangle{
	int length;
	int breadth;
	
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	void area() {
		int result=length*breadth;
		System.out.println("\nThe area  is:"+result);
		
	}
	void perimeter() {
		int peri=2*(length+breadth);
		System.out.println("The perimeter is:"+peri);
	}
	
}

class Square extends Rectangle{
	int side;
	Square(int side) {
		super(side,side);
		this.side=side;
	}	
		
	}


public class RectangeExample {

	public static void main(String[] args) {
		Rectangle rec=new Rectangle(23,56);
		rec.area();
		rec.perimeter();
		
		Square sq=new Square(8);
		sq.area();
		sq.perimeter();
	}

}

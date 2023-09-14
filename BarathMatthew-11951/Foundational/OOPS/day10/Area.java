package com.matthew.day10;

class Rectangle{
	int length;
	int breadth;
	
	Rectangle(int length,int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	void area() {
		System.out.println("Area: "+(length*breadth));
	}
	
	void perimeter() {
		System.out.println("perimeter: "+(2*(length+breadth)));
	}
}
 
class Square extends Rectangle{
	 int s; 
	 Square(int s){
		 super(s,s);
		 this.s = s;
	 }	
	 
}
public class Area {

	public static void main(String[] args) {
		Rectangle shape1 = new Rectangle(23,56);
		shape1.area();
		shape1.perimeter();
		System.out.println("----------------------------------------------");
		Square shape2 = new Square(8);
		shape2.area();
		shape2.perimeter();
	}

}

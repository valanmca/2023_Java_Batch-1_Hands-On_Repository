package com.jeban.OOPsday3;

class Rectangle{
	int length;
	int breadth;
	
//	Rectangle(int length,int breadth){
//		this.length=length;
//		this.breadth=breadth;
//	}
	
	int getArea(){
		int area=length*breadth;
		return area;
		
	}
	int getPerimeter(){
		int Perimeter=2*(length+breadth);
		return Perimeter;
	
		
	}
	
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
		
	}
}

class Square extends Rectangle{
	int side;
	Square(int length,int breadth,int side){
	super(length,breadth);
	
	this.side=side;
	}
	
	void display2() {
		System.out.println("Area of Square:"+(side*side));
		System.out.println("Perimeter of square:"+(4*side));
		System.out.println("Area of Rectangle:"+getArea());
		System.out.println("Perimeter of Rectangle:"+getPerimeter());

	}
	
	
}

public class inheritance6 {

	public static void main(String[] args) {
		Square obj=new Square(10,20,8);
		obj.display2();

	}

}

//Area and perimeter of shapes

package com.jeyandhan.day10;

class Rectangle{
	int length;
	int breadth;
	Rectangle(int length,int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	void areaOfRectangle() {
		System.out.println("Area of Rectangle: "+length*breadth);
	}
	void perimeterofRectangle() {
		System.out.println("Perimeter of Rectangle: "+(length+breadth)*2);
	}
}

class Square extends Rectangle{
    int s;
	Square(int length ,int breadth,int s) {
		super(length,breadth);
		this.s=s;
		
	}
	void areaOfSquare() {
		System.out.println("Area of Square: "+s*s);
	}
	void perimeterOfSquare() {
		System.out.println("Perimeter of Square: "+4*s);
	}
}

public class Shapes {

	public static void main(String[] args) {
		
		Square obj = new Square(12,14,4);
		System.out.println("\n\t ***** Area of Shapes*****");
		obj.areaOfRectangle();
		obj.areaOfSquare();
		System.out.println("\n\t ***** Perimeter of Shapes*****");
		obj.perimeterofRectangle();
		obj.perimeterOfSquare();
		

	}

}

package com.dharshu.OopsRecap;

class Shape{
	
	int length=10;
	int breadth=5;
	public void getArea() {
		System.out.println("Area of a Shapes");
	}
}
class Rectangle extends Shape{
	
	public void getArea() {
		//int length=23;
		//int breadth=13;
		System.out.println("Area of Rectangle:"+(length*breadth));
	}
}
public class ShapeOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect=new Rectangle();
		rect.getArea();

	}

}

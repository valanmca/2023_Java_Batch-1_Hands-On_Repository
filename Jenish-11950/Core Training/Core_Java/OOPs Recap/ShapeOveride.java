package com.jenish.OopsRecap;

class Shape{
	int length = 30;
	int breath = 15;
	public void getArea() {
		System.out.println("Area");
	}
}
class Rectangle extends Shape{
	public void getarea() {
		System.out.println("Area of a Rectangle:" +(length*breath));
	}
}

public class ShapeOveride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		rect.getarea();

	}

}

package com.naveen.day1;
/*Write a java program to create a class called Shape with a getArea(). create a subclass
 * called Rectangle that overrides the getArea() method to calculate the area of a triangle.*/

class Shape{
	public void getArea() {
		System.out.println("Area can't be defined");
	}
}

class Rectangle extends Shape{
	int l,b;
	
	Rectangle(int l, int b){
		this.l = l;
		this.b = b;
	}
	public void getArea() {
		System.out.println("Area of Triangle : " +(l*b));
	}
}
public class Ex03 {

	public static void main(String[] args) {
		
		Rectangle obj = new Rectangle(15,10);
		obj.getArea();
	}
}

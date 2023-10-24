package com.purushoth.day_04;

class Shape{
	void calculateArea(){
		System.out.println("We need to calculate area of all shapes.");
	}
}

class Circle extends Shape{
	void calculateArea() {
		System.out.println("Area of Circle=(Pi)*radius (Pi=3.14)");
	}
}

class Rectangle extends Shape{
	void calculateArea() {
		System.out.println("Area of Rectangle=Length*width");
	}
}

class Triangle extends Shape{
	void calculateArea() {
		System.out.println("Area of Triangle =(Breadth*height)/2");
	}
}
public class ShapeClass {

	public static void main(String[] args) {
		Shape obj=new Circle();
		obj.calculateArea();
		Shape obj1=new Rectangle();
		obj1.calculateArea();
		Shape obj2=new Triangle();
		obj2.calculateArea();
		

	}

}

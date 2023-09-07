package com.purushoth.day13;

class Shape{
	void area() {
		System.out.println("We can't show the area");
	}
}

class Rectangle extends Shape{
	void area() {
		System.out.println("The area of rectangle: +(l*b)");
	}
}

class Circle extends Shape{
	void area() {
		System.out.println("The area of circle: +(3.14*(r*r))");
	}
}
public class ShapeOverriding {

	public static void main(String[] args) {
	
		
		Rectangle rc=new Rectangle();
		rc.area();
		
		Circle c=new Circle();
		c.area();

	}

} // Overriding for shape.

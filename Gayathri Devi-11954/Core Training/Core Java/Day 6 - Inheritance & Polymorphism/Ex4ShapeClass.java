package com.gayathri.day5;
/*
 *  Write a Java program to create a class Shape with methods getArea() and getPerimeter(). 
 *  Create three subclasses: Circle, Rectangle, and Triangle.
 *   Override the getArea() and getPerimeter() methods in each subclass to calculate and 
 *   return the area and perimeter of the respective shapes.
 */
class ShapeCls{
	void getArea() {
		System.out.println("Shapes Area");
	}
	void getPerimeter() {
		System.out.println("Shapes Perimeter");
	}
}
class CircleShape extends ShapeCls{
	double pi;
	double r;
	public CircleShape(double pi, double r) {
		this.pi = pi;
		this.r = r;
	}
	void getArea() {
		System.out.println("Area of circle : "+(pi*r*r));
	}	
	void getPerimeter() {
		System.out.println("Perimeter of circle : "+(2*pi*r));
	}
}
class RectangleShape extends ShapeCls{
	int length ;
	int breadth;
	public RectangleShape(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	void getArea() {
		System.out.println("Area of Rectangle : "+(length*breadth));
	}
	void getPerimeter() {
		System.out.println("Perimeter of rectangle : "+(length + breadth));
	}
}
class TriangleShape extends ShapeCls{
	float height;
	float base;
	public TriangleShape(float height, float base) {
		this.height = height;
		this.base = base;
	}
	void getArea() {
		System.out.println("Area of triangle : "+(0.5*height*base));
	}
	void getPerimeter() {
		System.out.println("Perimeter of Triangle : "+(base * height * base));
	}
}
public class Ex4ShapeClass {

	public static void main(String[] args) {
		ShapeCls c = new CircleShape(3.14, 5.55);//override based on objects
		c.getArea(); 
		c.getPerimeter();
		
		TriangleShape t =  new TriangleShape(5.4f,8.9f);
		t.getArea(); 
		t.getPerimeter();
		
		RectangleShape r = new RectangleShape(2,3);
		r.getArea(); 
		r.getPerimeter();

	}

}


package com.gayathri.day5;
class Shape{
	void calculateArea() {
		System.out.println("Every shapes can contain their area value");
	}
}
class Circle extends Shape{
	double pi;
	double r;
	public Circle(double pi, double r) {
		this.pi = pi;
		this.r = r;
	}
	void calculateArea() {
		System.out.println("Area of circle : "+(pi*r*r));
	}	
}
class Rectangle extends Shape{
	int length ;
	int breadth;
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	void calculateArea() {
		System.out.println("Area of Rectangle : "+(length*breadth));
	}
}
class Triangle extends Shape{
	float height;
	float base;
	public Triangle(float height, float base) {
		this.height = height;
		this.base = base;
	}
	void calculateArea() {
		System.out.println("Area of triangle : "+(0.5*height*base));
	}
	
}
public class Ex1Shape {

	public static void main(String[] args) {
		Shape c = new Circle(3.14, 5.55);//override based on objects
		c.calculateArea();
		Triangle t =  new Triangle(5.4f,8.9f);
		t.calculateArea();
		Rectangle r = new Rectangle(2,3);
		r.calculateArea();

	}

}

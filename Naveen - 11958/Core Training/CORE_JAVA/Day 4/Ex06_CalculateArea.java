package com.naveen.day4;
/*1. Write a Java program to create a base class Shape with a method called calculateArea(). Create three 
 * subclasses: Circle, Rectangle, and Triangle. Override the calculateArea() method in 
 * each subclass to calculate and return the shape's area.
*/
class Shape{
	 
	public double CalculateArea() {
		return 0;
	}
}
class Circle extends Shape{
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	public double CalculateArea() {
	  return Math.PI * radius * radius;
	}
}

class Rectangle extends Shape{
	double l,b ;
	
	Rectangle(double l, double b){
		this.l = l;
		this.b = b;
	}
	
	@Override
	public double CalculateArea() {
	  return l * b;
	}
}

class Triangle extends Shape{
	double b,h ;
	
	Triangle(double b, double h){
		this.b = b;
		this.h = h;
	}
	
	@Override
	public double CalculateArea() {
	  return 0.5 * b * h;
	}
}


public class Ex06_CalculateArea {

	public static void main(String[] args) {
		
		Circle obj1 = new Circle(4);
		System.out.println("Area of Circle is :" +obj1.CalculateArea());
		
		Rectangle obj2 = new Rectangle(4,8);
		System.out.println("Area of Rectangle is :" +obj2.CalculateArea());
		
		Triangle obj3 = new Triangle(4,8);
		System.out.println("Area of Triangle is :" +obj3.CalculateArea());
	}

}

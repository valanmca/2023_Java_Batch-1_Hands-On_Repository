package com.jenish.day5;

abstract class Shape1{
	abstract double getArea();
	abstract double getPerimeter();
}
class Circle1 extends Shape{
	private double radius;
	Circle1(double radius) {
		this.radius = radius;
	}
	double getArea() {
		return 3.14 * radius * radius;
	}
	double getPerimeter() {
		return 2 * 3.14 * radius;
	}
}
class Rectangle1 extends Shape{
	private double width;
	private double length;
	
	Rectangle1 (double width, double height){
		this.width = width;
		this.length = length;
	}
	double getArea() {
		return length * width;
	}
	double getPerimeter() {
		return 2 * (length + width);
	}
}
class Triangle1 extends Shape {
	double S1;
	double S2;
	double S3;
	Triangle1(double S1, double S2, double S3) {
		this.S1 = S1;
		this.S2 = S2;
		this.S3 = S3;
	}
	double getArea() {
		double s = (S1 + S2 + S3)/2;
		return s * (s-S1) * (s-S2) * (s-S3);
	}
	double getPerimeter() {
		return S1 + S2 + S3;
	}
}
public class Ex_04_Shape_Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r = 4.0;
		double r1 = 4.0, r2 = 6.0;
		double t1 = 3.0, t2 = 4.0, t3 = 5.0;
		
		
		Circle1 circle = new Circle1(r);
		System.out.println("Radius of the Circle"+r);
        System.out.println("Area of the Circle: " + circle.getArea());
        System.out.println("Perimeter of the Circle: " + circle.getPerimeter());
        
        Rectangle1 rect = new Rectangle1(r1, r2);
		System.out.println("\nSides of the rectangle are: "+r1+','+r2);
        System.out.println("Area of the Rectangle: " + rect.getArea());
        System.out.println("Perimeter of the Rectangle: " + rect.getPerimeter());
        
        Triangle1 tri = new Triangle1 (t1, t2, t3);
		System.out.println("\nSides of the Traiangel are: "+t1+','+t2+','+t3);
        System.out.println("Area of the Triangle: " + tri.getArea());
        System.out.println("Perimeter of the Triangle: " + tri.getPerimeter());
	}

}

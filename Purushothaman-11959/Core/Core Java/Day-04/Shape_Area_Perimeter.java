package com.purushoth.day_04;

class Shape1{
	void getArea(){
		System.out.println("Different area values for every shapes");
	}
	void getPerimeter() {
		System.out.println("Different perimeter values for every shapes");
	}
}

class Circle1 extends Shape1{
	float Pi=3.14f;
	void getArea(int radius) {
		double Area=Pi*radius;
		System.out.println("Area of Circle "+Area);
	}
	void getPerimeter(int radius) {
		double Perimeter=2*(Pi)*(radius);
		System.out.println("Perimeter of Circle "+Perimeter);
	}
}

class Rectangle1 extends Shape1{
	void getArea(int length,int width) {
		int Area=length*width;
		System.out.println("Area of Rectangle "+Area);
	}
	void getPerimeter(int length,int width) {
		int Perimeter=2*(length + width);
		System.out.println("Perimeter of Rectangle "+Perimeter);
	}
}

class Triangle1 extends Shape1{
	void getArea(int breadth,int height) {
		int Area=(breadth*height)/2;
		System.out.println("Area of Triangle "+Area);
	}
	void getPerimeter(int side1,int side2,int side3) {
		int Perimeter=side1*side2*side3;
		System.out.println("Perimeter of Triangle "+Perimeter);
	}
}
public class Shape_Area_Perimeter {

	public static void main(String[] args) {
		Shape1 obj=new Circle1();
		obj.getArea();
		
		

	}

}

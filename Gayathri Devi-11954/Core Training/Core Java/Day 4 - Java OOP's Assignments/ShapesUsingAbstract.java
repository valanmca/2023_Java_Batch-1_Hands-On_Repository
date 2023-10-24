package com.gayathri.day4;

abstract class Shapes{
	abstract void area();
	abstract void perimeter();
}
class Rectangle extends Shapes{
	int lengt,breath;

	public Rectangle(int lengt, int breath) {
		this.lengt = lengt;
		this.breath = breath;
	}
	public void area() {
		System.out.println("Area of Rectangle : "+(lengt*breath));
	}
	public void perimeter() {
		System.out.println("Perimeter of Rectangle : "+(lengt+breath)+"\n");
	}
}
class Triangle extends Shapes{
	float height,base;
	Triangle(float height, float base){
		this.base = base;
		this.height = height;
	}
	public void area() {
		System.out.println("Area of triangle : "+(0.5*height*base));
	}
	public void perimeter() {
		System.out.println("Perimeter of triangle : "+(height+base+height)+"\n");
	}
}
class Circle extends Shapes{
	double r;
	Circle(double r){
		this.r = r;
	}
	public void area() {
		System.out.println("Area of circle : "+(3.14*r*r));
	}
	public void perimeter() {
		System.out.println("Perimeter of circle : "+(2*3.14*r)+"\n");
	}
}
public class ShapesUsingAbstract {

	public static void main(String[] args) {
		Shapes rectanglereference = new Rectangle(5, 5);
		rectanglereference.area();
		rectanglereference.perimeter();
		
		Shapes trianglereference = new Triangle(5.5f, 5.5f);
		trianglereference.area();
		trianglereference.perimeter();
		
		Shapes circlereference = new Circle(5.55d);
		circlereference.area();
		circlereference.perimeter();

	}

}

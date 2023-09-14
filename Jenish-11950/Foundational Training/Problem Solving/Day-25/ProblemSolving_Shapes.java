package com.jenish.day25;

interface ShapePlan {
	void display();
	void area();
	void perimeter();
	
}

abstract class Shape implements ShapePlan {
	public void display() {
		System.out.println();
	}
	public abstract void area();
	public abstract void perimeter();
}

class Circle extends Shape {
	float R;
	Circle(float R) {
		this.R = R;
	}
	public void area() {
		System.out.println(" Area of Circle : " +(3.14*R*R));
	}
	public void perimeter() {
		System.out.println(" Perimeter of Circle : " +(2*3.14*R));
	}
}

class Square extends Shape {
	int side;
	Square(int side){
		this.side=side;
	}
	public void area() {
		System.out.println(" Area of Square : " +(side*side));
	}
	public void perimeter() {
		System.out.println(" Perimeter of Square : " +(4*side));
	}
}

class Rectangle extends Shape {
	int Length, Breadth;
	Rectangle(int Length, int Breadth) {
		this.Length = Length;
		this.Breadth = Breadth;
		
	}
	public void area() {
		System.out.println(" Area of Rectangle : " +(Length*Breadth));
	}
	public void perimeter() {
		System.out.println(" Perimeter of Rectangle : " +(2*(Length*Breadth)));
	}
}

class Triangle extends Shape {
	float Length1, Length2, Base;
	Triangle (float Length1, float Length2, float Base) {
		this.Length1 = Length1;
		this.Length2 = Length2;
		this.Base = Base;
	}
	public void area() {
		System.out.println(" Area of Triangle : " +(0.5*Length1*Length2*Base));
	}
	public void perimeter() {
		System.out.println(" Perimeter of Triangle : " +(Length1+Length2+Base));
	}
}
public class ProblemSolving_Shapes {

	public static void main(String[] args) {
		
		Circle cir = new Circle(5.0f);
		cir.area();
		cir.perimeter();
		
		Square sq = new Square(4);
		sq.area();
		sq.perimeter();
		
		Rectangle rect = new Rectangle(6, 4);
		rect.area();
		rect.perimeter();
		
		Triangle tri = new Triangle(6.0f,5.0f, 40.f);
		tri.area();
		tri.perimeter();
		

	}

}

package com.sara.day26;

interface Shape_Plan {
	void area();

	void perimeter();

	double PI = 3.14;
}

abstract class Shapes implements Shape_Plan {
	public abstract void area();

	public abstract void perimeter() ;
}

class Circle extends Shapes {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public void area() {
		double area = PI * (radius * radius);
		System.out.println("The Area of Circle is" + area);
	}

	public void perimeter() {
		double perimeter = PI * radius * radius;
		System.out.println("The perimeter of Circle is" + perimeter);
	}

	public class Problem_Solving_Ex02 {

		public static void main(String[] args) {

			Circle circle = new Circle(4);
			circle.area();
		}

	}

}

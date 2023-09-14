package com.dharshu.day13;


class Shape {
	void area() {
		System.out.println("There is no formula for Area");
	}
}

class Rectangle extends Shape {
	int length;
	int breadth;

	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	void area() {
		int result = length * breadth;
		System.out.println("\nThe area of the rectangle is:" + result);

	}
}

	class Circle extends Shape {
		float r;
		float pi=3.14f;

		Circle(float r) {
			this.r=r;
			
		}

		void area() {
			
			System.out.println("\nThe area of circle is:" + (3.14*r*r));

		}
	}

public class InheritanceExample {

	public static void main(String[] args) {
		Rectangle rec=new Rectangle(23,56);
		rec.area();
		
		Circle cir=new Circle(5);
		cir.area();

	}

}
	

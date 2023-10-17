package com.core.day_05;
class Shape1 {

	void calculate_Area() {
		System.out.println("Area of the Shapes ");
	}
	
	void calculate_Perimeter() {
		System.out.println("Perimeter of the Shapes ");
	}

}

class Circle1 extends Shape1 {
	void calculate_Area() {
		System.out.println("Area of the Circle ");
	}
	void calculate_Perimeter() {
		System.out.println("Perimeter of the Circle ");
	}

}

class Rectangle1 extends Shape1 {
	void calculate_Area() {
		System.out.println("Area of the Rectangle");
	}

	void calculate_Perimeter() {
		System.out.println("Perimeter of the Rectangle ");
	}
}
class Triangle1 extends Shape1 {
	void calculate_Area() {
		System.out.println("Area of the Triangle");
	}
	void calculate_Perimeter() {
		System.out.println("Perimeter of the Triagle ");
	}

}


public class Ass_4 {

	public static void main(String[] args) {
		Circle1 obj=new Circle1();
		obj.calculate_Area();
		obj.calculate_Perimeter();

		Rectangle1 obj1=new Rectangle1();
		obj1.calculate_Area();
		obj1.calculate_Perimeter();
		
		Triangle1 obj2=new Triangle1();
		obj2.calculate_Area();
		obj2.calculate_Perimeter();
		
		

	}

}

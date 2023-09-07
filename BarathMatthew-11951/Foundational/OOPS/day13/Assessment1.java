package com.matthew.day13;

class Shape{
	void area() {
		System.out.println("We cannot define area ");
	}
}

class Rectangle extends Shape{
	void area() {
		System.out.println("Area of rectangle is l*b");
	}
}

class Circle extends Shape{
	void area() {
		System.out.println("Area of circle is 3.14*(r*r)");
	}
}
public class Assessment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

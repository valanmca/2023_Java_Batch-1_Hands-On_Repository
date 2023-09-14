package com.jeban.OOPsday6;

abstract class Shape1 {
	abstract void area();

	abstract void myMethod();
	
	void myMethod2() {
		System.out.println("This is my method 2");
	}

}

class Rectangle1 extends Shape1 {
	void area() {
		System.out.println("Area::L*B");
	}

	void myMethod() {

	}

}

class Circle1 extends Shape1 {
	void area() {
		System.out.println("Area:3.14*r*r");
	}

	void myMethod() {

	}

}

public class Abstract1 {

	public static void main(String[] args) {
			Rectangle1 rect = new Rectangle1();
			rect.area();
			
			Circle1 Circ=new Circle1();
			Circ.area();
	
		Shape1 obj;
	
		
		Shape1 obj1=new Rectangle1();
		obj1.area();
		obj1.myMethod2();
		Shape1 obj2=new Circle1();
		obj2.area();		
		
//		

	}

}

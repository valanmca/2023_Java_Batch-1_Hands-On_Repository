package com.jeban.OOPsday6;
//Shape we cannot define a area
class Shape{
	
	void area() {
		System.out.println("Area of Shape");
	}
	
	
}

class Rectangle extends Shape {
	void area() {
		System.out.println("Area::L*B");
	}

	
	
	
}

class Circle extends Shape{
	void area() {
		System.out.println("Area:3.14*r*r");
	}
	
}

public class basicinheritance2 {

	public static void main(String[] args) {
		Rectangle area=new Rectangle();
		area.area();
	

	}

}

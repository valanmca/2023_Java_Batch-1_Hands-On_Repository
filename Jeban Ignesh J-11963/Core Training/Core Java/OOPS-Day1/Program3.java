package com.jeban.oops;
 
class Shape{
	void getarea() {
		System.out.println("Area of Rectangle");
	}
}
class Rectangle extends Shape{
	
	void getarea(int width,int length) {
		System.out.println("Area of Rectangle:"+(width*length));
	}
}
class Square extends Rectangle{
	void getarea(int a) {
		System.out.println("Area of Square:"+(a*a));
	}
}

public class Program3 {

	public static void main(String[] args) {
	Rectangle obj =new Rectangle();
	obj.getarea(10,20);
	Square obj1=new Square();
	obj1.getarea(10);

	}

}

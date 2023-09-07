package com.dharshu.day13;


abstract class Shapes {
	abstract void area();
	abstract void myMethod();
	void myMethod2() {
		System.out.println("This is method 2");
	}
}

class Rectangles extends Shapes {
	int length;
	int breadth;

	Rectangles(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	void area() {
		int result = length * breadth;
		System.out.println("\nThe area of the rectangle is:" + result);

	}
	void myMethod() {
		
	}
}

public abstract class AbstarctExample2 {//even main class also be a abstract.
	

	public static void main(String[] args) {
		Shapes obj;//cannot declare the object because it is partially completed class bt we can create the reference of the object
		
		Shapes obj1=new Rectangles(2,2);//DMD[Dynamic Method Dispatch]
		obj1.area();
		obj1.myMethod2();

	}

}
	

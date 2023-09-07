//Abstract method and concrete method 
//alaways method without body
// we can'not craete objct class abstract
//main  i have define ,i have declarcation.
package com.muthu.day13;
abstract class Shape1{
	abstract void area();
	abstract void myMethod();
	void myMethod2() {//concrete method
	
	System.out.println("This is my method");
	}
}
class Rectangle1 extends Shape1{
	void area() {
		System.out.println("Area:L*b");
	}
	void myMethod() {}
	
}

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape1 Rectangle=new Rectangle1(); //[Dynamic method Dispatch] Referance method 
		Rectangle.area();
		Rectangle.myMethod2();
	}

}

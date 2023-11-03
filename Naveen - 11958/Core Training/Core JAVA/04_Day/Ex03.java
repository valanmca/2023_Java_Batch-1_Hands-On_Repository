package com.naveen.day4;
// Method Overriding
class A2{
	int a = 10;
	static void display() {               //Non overriding method.
		System.out.println("A");		  //Only method can override variable can't override.
	}
}

class B2 extends A2{
	int a =20;
	static void display() {
		//super.display();
		System.out.println("B");
	}

}
public class Ex03 {

	public static void main(String[] args) {
		//Non OR
		A2 obj = new B2();
		obj.display();
		System.out.println(obj.a);
	}

}

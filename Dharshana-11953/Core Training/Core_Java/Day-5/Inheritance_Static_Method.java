package com.dharshu.day5;

class A3{
	int a =10;
	static void display() {
		System.out.println("A");
	}
}

class B3 extends A3{
	int a =20;
	static void display() {
		System.out.println("B");
	}
}

public class Inheritance_Static_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A3 obj = new B3();
		obj.display();// it display 'A' because static can not be override.
		System.out.println(obj.a);
	}

}

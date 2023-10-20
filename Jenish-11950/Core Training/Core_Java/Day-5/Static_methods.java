package com.jenish.day5;

class A2 {
	int a = 10;
	static void display() {
		System.out.println("A");
	}
}
class B2 extends A2 {
	int a = 20;
	static void display() {
		System.out.println("B");
	}
 }
public class Static_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 obj = new B2();
		obj.display();
		System.out.println(obj.a);

	}

}

package com.purushoth.day_04;

class A3{
	void display() {
		System.out.println("A");
	}
}

class B3 extends A3{
	void display() {
		super.display();
		System.out.println("B");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		A3 obj=new B3();
		obj.display();

	}

}// MethodOverriding

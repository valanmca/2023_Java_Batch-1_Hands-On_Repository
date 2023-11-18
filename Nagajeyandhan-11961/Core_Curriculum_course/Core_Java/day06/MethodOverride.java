package com.jeyandhan.day06;

class A{
	void display() {
		System.out.println("A");
	}
}

class B extends A{
	void display() {
		System.out.println("B");
	}
}
public class MethodOverride {

	public static void main(String[] args) {
	
		B obj = new B();
		obj.display();

	}

}

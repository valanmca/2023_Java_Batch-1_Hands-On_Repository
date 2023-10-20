package com.jeban.Inheritance;

//Non over riding based on reference and Over riding based on object.

class X {
	int a=10;
	static void display() {
		System.out.println("A");
	}
}
class Y extends X{
	int a=20;
	static void display() {
		System.out.println("B");
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		X obj=new Y();
		obj.display();
		System.out.println(obj.a);

	}

}

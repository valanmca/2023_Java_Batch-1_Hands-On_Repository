/****** Usage of Super Keyword... ******/
package com.sara.day11;

class superClass {
	int a;

	superClass(int a) {
		this.a = a;
	}

	void display() {
		System.out.println("Value of A :" + a);
	}
}

class SubClass extends superClass {
	SubClass() {
		super(10);
		super.display();
		System.out.println("Value of A :" + super.a);
	}
}

public class Polymorphism_Ex09 {

	public static void main(String[] args) {
		SubClass obj = new SubClass();

	}

}

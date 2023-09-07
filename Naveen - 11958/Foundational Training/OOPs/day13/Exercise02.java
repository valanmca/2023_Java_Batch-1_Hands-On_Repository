package com.naveen.day13;

//Method Overriding using getValue().
class Animal1 {
	int a =10;
	String s = getValue();

	String getValue() {
		return "A";
	}
}

class Dog1 extends Animal1 {
	int a = 20;
	String getValue() {
		return "B";
	}
	void m() {
		System.out.println(super.s +super.a);
	}
}

public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final int a =0;
		//a=20;

		Dog1 dog = new Dog1();
		dog.m();
		System.out.println(dog.s);
		
		
		
	}

}

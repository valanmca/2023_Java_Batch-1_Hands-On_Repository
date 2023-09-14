package com.domnic.oopsday6;

class Animal {
	String s = getValue();;

	String getValue() {
		return "A";
	}
}

class Dog extends Animal {
	String getValue() {
		return "B";
	}
}

public class Overriding {

	public static void main(String[] args) {
		Dog dog = new Dog();

		System.out.println(dog.s);
	}

}

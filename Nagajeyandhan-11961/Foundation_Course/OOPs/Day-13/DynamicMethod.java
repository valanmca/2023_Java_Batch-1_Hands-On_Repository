//Dynamic Method Dispatch [DMD]

package com.jeyandhan.day13;

class Animal { // super class
	int a = 10;
	String s = getValue();

	void eat() {
		System.out.println("All Animals Eat");
	}

	private String getValue() {
		return "A";
	}

}

class Dog extends Animal { // sub class of animal
	int a = 20;

	public void eat() {
		System.out.println("Dog eat Bone");
	}

	String getValue() {
		return "B";
	}

}

public class DynamicMethod {

	public static void main(String[] args) {
		// object Creation
		Animal animal = new Dog(); // Dynamic Method Dispatch [DMD]
		// Method overloading
		animal.eat();
		System.out.println(animal.a); // 10 [variables can't be override]
		System.out.println(animal.s); // B [Here we are calling the method not the variable so it return B]

	}

}

/******* Example for Reduce the Visibility of the Inherited Method********/
package com.sara.day12;

class Animal {
	void eat() {
		System.out.println("All animals Eat...");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("Dog will Eat Chicken...");
	}
}

public class Polymorphism_Ex11 {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.eat();

	}

}

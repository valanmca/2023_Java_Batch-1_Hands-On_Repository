package com.naveen.day12;

//Method Overriding - identified during run time. Overriding happens between super class and sub class.
// Override means rewriting the common functionalities.
class Animal {
	void eat() {
		System.out.println("All Animals eat");
	}

}

class Dog extends Animal {
	void eat() { // default, protected, public
		System.out.println("Dog eat Chicken");
	}
}

public class Exercise03 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();

	}

}

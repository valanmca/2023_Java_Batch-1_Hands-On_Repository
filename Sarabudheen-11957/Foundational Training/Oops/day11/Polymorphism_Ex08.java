/*************** Example for Overriding Using Animal Class ...***************/
//Runtime Polymorphism
package com.sara.day11;

class Animal {
	void eat() {
		System.out.println("All animals Eat...");
	}

	void speak() {
		System.out.println("All animals will make sounds...");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("Dog Eat Chicken...");
	}

	void speak() {
		System.out.println("Dog Will Bark...");
	}
}

class Cat extends Animal {
	void eat() {
		System.out.println("Cat Eat Fish...");
	}

	void speak() {
		System.out.println("Cat Will Meow...");
	}
}

public class Polymorphism_Ex08 {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.eat();
		dog.speak();

		Cat cat = new Cat();
		cat.eat();
		cat.speak();

	}

}

package com.naveen.day11;

//Method Overriding - identified during run time. Overriding happens between super class and sub class.
// Override means rewriting the common functionalities.
class Animal {
	public void eat() {
		System.out.println("All Animals eat");
	}

	public void speak() {
		System.out.println("All Animals make sound");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("Dog eat Chicken");
	}

	public void speak() {
		System.out.println("Dog will bark");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("Cat eat Fish");
	}

	public void speak() {
		System.out.println("Meow");
	}
}

public class PolymorphismEx09 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.speak();
		Cat cat = new Cat();
		cat.eat();
		cat.speak();
	}

}

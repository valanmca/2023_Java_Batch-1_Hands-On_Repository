package com.jeban.OOPsday4;//Overriding polymorphism 

//Re-Writing the functionality

class Animal {
	public void eat() {
		System.out.println("All animals eat");
	}

	public void speak() {
		System.out.println("All animals will make sound");

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

public class polymorphism7 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.speak();

		Cat cat = new Cat();
		cat.eat();
		cat.speak();

	}

}

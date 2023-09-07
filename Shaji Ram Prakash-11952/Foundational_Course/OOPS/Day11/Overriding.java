package com.shaji.Day11;

class Animal {
	public void eat() {
		System.out.println("All Animal can Eat");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("Dog eats Chicken");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("Cats eats Fish");
	}
}

public class Overriding {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();

		Cat cat = new Cat();
		cat.eat();

	}

}

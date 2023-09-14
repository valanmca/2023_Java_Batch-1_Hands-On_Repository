package com.domnic.oopsday4;
//Overriding is used for rewriting the functionality...
class Animal {
	public void eat() {
		System.out.println("All Animal Eat");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("Dog eats chicken");

	}
	public void speak() {
		System.out.println("Dog will bark");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("Cat eats Fish");
	}
	public void speak() {
		System.out.println("Cat will Meeowww");
	}
}

public class OverRiding {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.eat();
		dog.speak();
		Cat cat = new Cat();
		cat.eat();
		dog.speak();
	}

}

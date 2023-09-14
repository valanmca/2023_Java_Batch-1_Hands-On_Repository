package com.naveen.day13;

//Method Overriding using DMD
class Animal {
	int a = 10;

	public void eat() {
		System.out.println("All animals eat");

	}
}

class Dog extends Animal {
	int a = 20;

	public void eat() {
		System.out.println("Dog eat chicken");
	}
}

public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog();
		dog.eat();
		System.out.println(dog.a);		
		Animal animal = new Dog(); // Dynamic method dispatch
		animal.eat();
		

		System.out.println(animal.a);
	}

}

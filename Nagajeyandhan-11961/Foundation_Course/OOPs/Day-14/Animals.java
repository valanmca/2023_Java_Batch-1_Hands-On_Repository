//AnimalInfo using interface, abstract and concrete class

package com.jeyandhan.day14;

interface AnimalPlan { // interface
	void eat();

	void food();

	void move();

	void wayOfMove();
}

abstract class Animal implements AnimalPlan { // abstract class
	public void eat() {
		System.out.print("I will eat");
	}

	public abstract void food();

	public void move() {
		System.out.print("I will move from one place to another, by");
	}

	public abstract void wayOfMove();
}

class Dog extends Animal { // concrete class
	public void food() {
		System.out.println(" bone.");
	}

	public void wayOfMove() {
		System.out.println(" walk.");
	}

}

class Bird extends Animal {// concrete class
	public void food() {
		System.out.println(" worms.");
	}

	public void wayOfMove() {
		System.out.println(" fly.");
	}

}

class Fish extends Animal {// concrete class
	public void food() {
		System.out.println(" algae.");
	}

	public void wayOfMove() {
		System.out.println(" swim.");
	}

}

public class Animals {

	public static void main(String[] args) {

		System.out.println("\tDog");
		Dog dog = new Dog();// object creation

		dog.eat(); // method calling
		dog.food();

		dog.move();
		dog.wayOfMove();

		System.out.println("\n\t Bird");
		Bird bird = new Bird();// object creation

		bird.eat();// method calling
		bird.food();

		bird.move();
		bird.wayOfMove();

		System.out.println("\n\t Fish");
		Fish fish = new Fish();// object creation

		fish.eat();// method calling
		fish.food();

		fish.move();
		fish.wayOfMove();
	}

}

package com.naveen.day14;

// AnimalPlan implementation using interface, abstract and Normal class.
interface AnimalPlan {
	void eat();

	void food();

	void move();

	void wayOfMove();
}

abstract class Animal implements AnimalPlan {
	public void eat() {
		System.out.print("I will eat,");
	}

	public abstract void food();

	public void move() {
		System.out.print("I will move from one place to another,");
	}

	public abstract void wayOfMove();
}

class Dog extends Animal {
	public void food() {
		System.out.println("  Chicken.");
	}

	public void wayOfMove() {
		System.out.println(" by walk.");
	}
}

class Bird extends Animal {
	public void food() {
		System.out.println(" nuts.");
	}

	public void wayOfMove() {
		System.out.println(" by fly.");
	}
}

class Fish extends Animal {
	public void food() {
		System.out.println(" worms.");
	}

	public void wayOfMove() {
		System.out.println(" by swim.");
	}
}

public class InterfaceEx06 {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.eat();
		dog.food();
		dog.move();
		dog.wayOfMove();

		Bird bird = new Bird();
		bird.eat();
		bird.food();
		bird.move();
		bird.wayOfMove();

		Fish fish = new Fish();
		fish.eat();
		fish.food();
		fish.move();
		fish.wayOfMove();
	}

}

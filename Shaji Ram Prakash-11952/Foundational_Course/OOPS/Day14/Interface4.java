package com.shaji.Day14;

interface AnimalPlan {
	void eat();

	void food();

	void move();

	void wayofMove();
}

abstract class Animal implements AnimalPlan {
	public void eat() {
		System.out.print("I will Eat, ");
	}

	public void move() {
		System.out.print("I will move ");
	}
}

class Dog extends Animal {
	public void food() {
		System.out.println("Chicken...");
	}

	public void wayofMove() {
		System.out.println("by Walk...");
	}
}

class Bird extends Animal {
	public void food() {
		System.out.println("Nuts...");
	}

	public void wayofMove() {
		System.out.println("by Fly...");
	}
}

class Fish extends Animal {
	public void food() {
		System.out.println("Fish Food...");
	}

	public void wayofMove() {
		System.out.println("by Swim...");
	}
}

public class Interface4 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.food();
		dog.move();
		dog.wayofMove();
		
		System.out.println("\n");

		Bird bird = new Bird();
		bird.eat();
		bird.food();
		bird.move();
		bird.wayofMove();
		
		System.out.println("\n");

		Fish fish = new Fish();
		fish.eat();
		fish.food();
		fish.move();
		fish.wayofMove();
	}

}

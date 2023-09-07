package com.domnic.oopsday7;

interface Plan {
	void eat();
    void food();

	void move();
    void wayOfMove();
}

abstract class LivingThings implements Plan {
	public void eat() {
		System.out.print("I Will eat, ");
	}

	public abstract void food();// optional

	public void move() {
		System.out.print("I will move from place to place ");
	}

	public abstract void wayOfMove();// optional
}

class Dog extends LivingThings {
	public void food() {
		System.out.println("chicken ");
	}

	public void wayOfMove() {
		System.out.println("by walking with four legs ");
	}
}

class Bird extends LivingThings {
	public void food() {
		System.out.println("nuts ");
	}

	public void wayOfMove() {
		System.out.println("by flying ");
	}
}

class Fish extends LivingThings {
	public void food() {
		System.out.println("sea creatures ");
	}

	public void wayOfMove() {
		System.out.println("by Swimming ");
	}
}

class Humans extends LivingThings {
	public void food() {
		System.out.println("food ");
	}

	public void wayOfMove() {
		System.out.println("by walking with two legs ");
	}
}

public class Interface4 {

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

		Humans humans = new Humans();
		humans.eat();
		humans.food();
		humans.move();
		humans.wayOfMove();
	}

}

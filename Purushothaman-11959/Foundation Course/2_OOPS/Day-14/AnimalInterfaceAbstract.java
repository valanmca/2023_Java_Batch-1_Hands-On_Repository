package com.purushoth.day14;

interface AnimalPlan {
	void eat();
	void food();
	
	void move();
	void wayOfMove();
}

abstract class Animal implements AnimalPlan {
	public void eat() {
		System.out.print("I will eat, ");
	}
	public abstract void food();
		
	public void move() {
		System.out.print("I will travel from one place to another");
	}
	public abstract void wayOfMove();
}

class Dog extends Animal {
	public void food() {
		System.out.println("Chicken");
	}
	public void wayOfMove() {
		System.out.println(" by Walk");
	}
}

class Bird extends Animal {
	public void food() {
		System.out.println("Nuts");
	}
	public void wayOfMove() {
		System.out.println(" by fly");
	}
}

class Fish extends Animal {
	public void food() {
		System.out.println("Worm");
	}
	public void wayOfMove() {
		System.out.println(" by Swim");
	}
}
public class AnimalInterfaceAbstract {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.eat();
		dog.food();
		dog.move();
		dog.wayOfMove();
		
		Bird bird=new Bird();
		bird.eat();
		bird.food();
		bird.move();
		bird.wayOfMove();
		
		Fish fish=new Fish();
		fish.eat();
		fish.food();
		fish.move();
		fish.wayOfMove();
		
	}

}// Multiple inheritance for animal.

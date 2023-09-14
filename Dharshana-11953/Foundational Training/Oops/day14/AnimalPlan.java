package com.dharshu.day14;

interface Animal{
	void eat();
	void food();
	
	void move();
	void wayofMove();
}

abstract class Animals implements Animal{
	public void eat() {
		System.out.println("\nI will eat");
	}
	
	public abstract void food();
	
	public void move() {
		System.out.println("I will move frome one place to another place");
	}
	
	public abstract void wayofMove();
}

class Dog extends Animals{
	public void food() {
		System.out.println("Dog eat chicken");	
	}

	public void wayofMove() {
		System.out.println("by walk");	
	}
	
}

class Birds extends Animals{
	public void food() {
		System.out.println("Birds eat nuts");	
	}

	public void wayofMove() {
		System.out.println(" by fly");	
	}
	
}

class Fish extends Animals{
	public void food() {
		System.out.println("Fish eat Small Fish");	
	}

	public void wayofMove() {
		System.out.println("by swim");	
	}
	
}
public class AnimalPlan {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.food();
		dog.move();
		dog.wayofMove();
		
		Birds bird = new Birds();
		bird.eat();
		bird.food();
		bird.move();
		bird.wayofMove();
		
		Fish fish = new Fish();
		fish.eat();
		fish.food();
		fish.move();
		fish.wayofMove();


	}

}

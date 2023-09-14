package com.matthew.day14;

interface AnimalPlan{
	void eat();
	void food();
	void move();
	void wayOfMove();
}

abstract class Animal implements AnimalPlan{
	public void eat() {
		System.out.print("I will eat ,");
	}
	// food is optional because its same as animalPlan 
	abstract public void food();
	
	public void move() {
		System.out.print("I will move from one place to another by ,");
	}
	
	//defining wayofmove is optional here
} 

class Dog extends Animal{
	public void food() {
		System.out.println("Chicken");
	}
	
	public void wayOfMove() {
		System.out.println("by walk");
	}
}

class Bird extends Animal{
	public void food() {
		System.out.println("nuts");
	}
	
	public void wayOfMove() {
		System.out.println(" by fly");
	}
}
public class Assessment2 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.food();
		dog.move();
		dog.wayOfMove();
		System.out.println("------------------------------------------------");
		//bird
		
		Bird bird = new Bird();
		bird.eat();
		bird.food();
		bird.move();
		bird.wayOfMove();
	}

}

package com.gayathri.day14;
//interface,abstract,class,inheritance

interface AnimalBehaviour{
	void eat();
	void food();
	void move();
	void wayOfMove();
}

abstract class Animal implements AnimalBehaviour
{
	public void eat()
	{
		System.out.print("I will eat, ");
	}
	public abstract void food();//not need
	public void move()
	{
		System.out.print("I move one place to another, ");
	}
	public abstract void wayOfMove();
}

class Dog extends Animal{
	public void food()
	{
		System.out.println("\n\tDog eat chicken");
	}
	public void wayOfMove() {
		System.out.println("\n\tDog using 4 legs");
	}
}

class Cat extends Animal{
	public void food()
	{
		System.out.println("\n\tCat eat Fish");
	}
	public void wayOfMove() {
		System.out.println("\n\tCat using 4 legs");
	}
}

class Bird extends Animal{
	public void food()
	{
		System.out.println("\n\tBirds are eat fruits");
	}
	public void wayOfMove() {
		System.out.println("\n\tBirds are fly using their feathers");
	}
}
public class AnimalPlan {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.food();
		dog.move();
		dog.wayOfMove();
		
		Cat meow = new Cat();
		meow.eat();
		meow.food();
		meow.move();
		meow.wayOfMove();
		
		Bird bird = new Bird();
		bird.eat();
		bird.food();
		bird.move();
		bird.wayOfMove();

	}

}

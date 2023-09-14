package com.jenish.day14;

interface AnimalPlan {
	void eat();
	void food();
	
	void move();
	void wayOfMove();
	
}
abstract class Animal implements AnimalPlan {
	public void eat() {
		System.out.print("I Will Eat, ");
	}
	public abstract void food();
	
	public void move() {
		System.out.print("I Will Move Here and There to Other Place, ");
	}
	public abstract void wayOfMove();
	
}
class Dog extends Animal {
	public void food () {
		System.out.println(" Chicken, ");
	}
	public void wayOfMove () {
		System.out.println(" By Walk ");
	}
}
class Bird extends Animal {
	public void food () {
		System.out.println(" Grains, ");
	}
	public void wayOfMove () {
		System.out.println(" By Fly ");
	}
}
class Fish extends Animal {
	public void food () {
		System.out.println(" Algae, ");
	}
	public void wayOfMove () {
		System.out.println(" By Swim ");
	}
}
public class Interface_UsingInheritance_AnimalPlan_Ex6 {

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

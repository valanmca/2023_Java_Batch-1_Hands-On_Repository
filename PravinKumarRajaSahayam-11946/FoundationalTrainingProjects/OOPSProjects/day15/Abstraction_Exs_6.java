//Abstraction Interfaces
package com.pravinkumar.day15;

//Interfaces
interface AnimalsPlan {
	//we can only declarating the method(But not body definitions)
	void eat();

	void food();

	void move();

	void wayOfMove();
}
//Abstract class or Sub class
abstract class Animals implements AnimalsPlan {
	public void eat() {
		System.out.println("I will eat");
	}

	// It is a Optimal (Because we already declaraing this in the interfaces
	public abstract void food();

	public void move() {
		System.out.println("I will move from one place to other place ");
	}

	public abstract void wayOfMove();
}
//Normal class or Sub class
class Dog extends Animals {
	public void food() {
		System.out.println("Chickens");
	}

	public void wayOfMove() {
		System.out.println(" by walk ");
	}
}
//Normal class or Sub class
class Bird extends Animals {
	public void food() {
		System.out.println(" nuts ");
	}

	public void wayOfMove() {
		System.out.println(" by fly ");
	}
}
//Normal class or Sub class
class Fish extends Animals {
	public void food() {
		System.out.println(" FishFood ");
	}

	public void wayOfMove() {
		System.out.println(" by swim " );
	}
}

public class Abstraction_Exs_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

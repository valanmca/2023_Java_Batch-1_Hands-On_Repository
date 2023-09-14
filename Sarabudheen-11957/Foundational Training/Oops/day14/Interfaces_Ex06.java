/***** Creating Interface for AnimalPlan... *****/
package com.sara.day14;

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

	public void move() {
		System.out.print("I Will Move One Place to Another Place, ");
	}
}

class Dogs extends Animal {
	public void food() {
		System.out.println(" Chicken ...");
	}

	public void wayOfMove() {
		System.out.println(" By Walk ...");
	}
}

class Birds extends Animal {
	public void food() {
		System.out.println(" Nuts ...");
	}

	public void wayOfMove() {
		System.out.println(" By Fly ...");
	}
}

class Fish extends Animal {
	public void food() {
		System.out.println(" Worm ...");
	}

	public void wayOfMove() {
		System.out.println(" By Swim ...");
	}
}

public class Interfaces_Ex06 {

	public static void main(String[] args) {

		Birds bird = new Birds();
		bird.eat();
		bird.food();
		bird.move();
		bird.wayOfMove();

		System.out.println(" ");

		Dogs dog = new Dogs();
		dog.eat();
		dog.food();
		dog.move();
		dog.wayOfMove();

		System.out.println(" ");

		Fish fish = new Fish();
		fish.eat();
		fish.food();
		fish.move();
		fish.wayOfMove();

	}

}

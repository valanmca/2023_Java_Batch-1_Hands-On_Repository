package com.jeban.OOPsday7;//Interface with abstract class.

interface AnimalPlan {
	void eat();

	void food();

	void move();

	void wayofmove();

}

abstract class Animal implements AnimalPlan {// Abstract class
	public void eat() {
		System.out.println("I Will Eat");
	}

	public abstract void food();

	public void move() {
		System.out.println("I will move from one place to another place");
	}

	public abstract void wayofmove();
}

class Dog extends Animal {// class 1
	public void food() {
		System.out.println("Chicken");

	}

	public void wayofmove() {
		System.out.println("by walk");
	}
}

class Bird extends Animal {// class 2
	public void food() {
		System.out.println("nuts");

	}

	public void wayofmove() {
		System.out.println("by fly");
	}
}

class Cat extends Animal {// class 3
	public void food() {
		System.out.println("Milk");

	}

	public void wayofmove() {
		System.out.println("by Walk");
	}

}

class Human extends Animal {// class 4
	public void food() {
		System.out.println("Briyani");

	}

	public void wayofmove() {
		System.out.println("by Walk");
	}

}

public class interface7 {

	public static void main(String[] args) {

		Dog obj = new Dog();
		obj.eat();
		obj.food();
		obj.move();
		obj.wayofmove();

		System.out.println(" ");

		Bird obj1 = new Bird();
		obj1.eat();
		obj1.food();
		obj1.move();
		obj1.wayofmove();

		System.out.println(" ");

		Cat obj2 = new Cat();
		obj2.eat();
		obj2.food();
		obj2.move();
		obj2.wayofmove();

		System.out.println(" ");

		Human obj3 = new Human();
		obj3.eat();
		obj3.food();
		obj3.move();
		obj3.wayofmove();

	}

}

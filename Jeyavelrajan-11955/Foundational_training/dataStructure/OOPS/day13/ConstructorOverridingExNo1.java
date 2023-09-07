package com.jeyavel.OOPS.day13;

class Animals {

	int a = 10;

	public void eat() {

		System.out.println("All Animals eat");

	}

}

class Dog extends Animals {

	int a = 20;

	public void eat() {

		System.out.println("Dog eat Chicken");

	}

}

public class ConstructorOverridingExNo1 {

	public static void main(String[] args) {

		Dog dog = new Dog();

		dog.eat();

		Animals animals = new Dog();// Dynamic Method Dispatch [DMMD]

		animals.eat();

		// Overriding has impact only on method not on constructor and data types

		System.out.println(animals.a);// the output will be '10' because the overriding does not has impact on
										// variables

		// Dog dog = new Animal; -- this will show error because all Dogs are Animals
		// but not all Animals are Dog

	}

}

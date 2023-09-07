package com.shaji.Day13;

class Animal {// Super class
	int a = 10;

	void eat() {
		System.out.println("All Animal can Eat");
	}
}

class Dog extends Animal { // Sub class
	int a = 20;

	public void eat() { // default, protected , public
		System.out.println("Dog eats Chicken");
	}
}

public abstract class Non_Overriding {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();

		Animal animal = new Dog(); // Dynamic Method Dispatch(DMD)
		animal.eat();
		System.out.println(animal.a); // 10
	}

}

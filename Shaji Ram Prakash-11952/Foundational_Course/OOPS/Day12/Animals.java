package com.shaji.Day12;

// Using Access specifiers in Overriding

class Animal {// Super class
	 void eat() {
		System.out.println("All Animal can Eat");
	}
}

class Dog extends Animal { //Sub class
	public void eat() { // default, protected , public
		System.out.println("Dog eats Chicken");
	}
}

public class Animals {

	public static void main(String[] args) {
	
		Dog dog = new Dog();
		dog.eat();
	}

}

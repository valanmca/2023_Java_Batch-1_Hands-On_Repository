package com.domnic.oopsday5;

class Animal {
	void eat() {
		System.out.println("All Animals Eat Food");
	}
}

class Dog extends Animal {//the overridden method access specifier should have more visibility than the super class
							
	void eat() { // can use default,protected and public
		System.out.println("Dog will eat Chicken");
	}

}

public class Oopsprac3 {

	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.eat();

	}

}

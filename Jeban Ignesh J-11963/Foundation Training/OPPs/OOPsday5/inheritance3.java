package com.jeban.OOPsday5;

class Animal {
	void eat() {
		System.out.println("Animal can eat");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("Dog eat chicken");
	}
}

public class inheritance3 {

	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.eat();

	}

}

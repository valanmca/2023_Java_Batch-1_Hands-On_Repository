package com.jenish.day12;

class Animal {
	void eat() {
		System.out.println("All animals will eat");
		
	}
}
class Dog extends Animal {
	void eat() {
		super.eat();
		System.out.println("Dog eat Chicken");
	}
}

public class Method_OverRiding_Assign_Ex2 {

	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.eat();

	}

}

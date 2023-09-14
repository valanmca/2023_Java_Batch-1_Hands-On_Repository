package com.shaji.Day11;

class Animals {
	public void eat() {
		System.out.println("All Animal can Eat");
	}
	public void speak() {
		System.out.println("All Animals will make Sound");
	}
}

class Dogs extends Animals {
	public void eat() {
		System.out.println("Dog eats Chicken");
	}
	public void speak() {
		System.out.println("Dog will Bark");
	}
}

class Cats extends Animals {
	public void eat() {
		System.out.println("Cats eats Fish");
	}
	public void speak() {
		System.out.println("Cat Will Meow");
	}
}

public class Overriding1 {

	public static void main(String[] args) {
		Dogs dog = new Dogs();
		dog.eat();
		dog.speak();
		
		Cats cat = new Cats();
		cat.eat();
		cat.speak();

	}

}

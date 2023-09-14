package com.dharshu.day11;

class Animal{
	public void eat() {
		System.out.println("All Animals are eat");
	}
	
	public void speak() {
		System.out.println("All Animals will make sound");
	}
}

class Dog extends Animal{
	public void eat() {
		System.out.println("Dog eat Chicken");
	}
	
	public void speak() {
		System.out.println("Dog make lol lol Lolllllllllllll");
	}
}

class Cat extends Animal{
	public void eat() {
		System.out.println("Cat eat Fish");
	}
	
	public void speak() {
		System.out.println("Cat make Meow meow meowwwwwwwwwww");
	}
}

public class OverRiding {

	public static void main(String[] args) {
		Dog lol=new Dog();
		lol.eat();
		lol.speak();
		
		Cat meow=new Cat();
		meow.eat();
		meow.speak();

	}

}

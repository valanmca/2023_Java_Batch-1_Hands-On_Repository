package com.dharshu.OopsRecap;

class Animal{
	
	public void makeSound() {
		System.out.println("Every animal make a sound");
	}
}
class Cat extends Animal{
	public void makeSound() {
		System.out.println("Cat make Meow meow meowwwwwwwwwww");
	}
}

public class AnimalOverride {
	
	public static void main(String[] args) {
	Cat meow = new Cat();
	meow.makeSound();
	}

}

package com.gayathri.day1;
/*
Write a java program to create a class called Animal with a method called makeSound().
Create a subclass called cat that overrides the makeSound() method to bark.

*/
class Animal{
	void makeSound() {
		System.out.println("All Animal makes sound");
	}
}
class Cat extends Animal{
	void makeSound() {
		//super.makeSound();
		System.out.println("Cat makes sound as meow");
	}
}
public class AnimalClassEx1 {

	public static void main(String[] args) {
		Cat obj = new Cat();
		obj.makeSound();
	}

}

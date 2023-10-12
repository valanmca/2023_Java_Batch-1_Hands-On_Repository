package com.naveen.day1;
/*Write a Java Program to create a class called Animal with a method makeSound().
 * Create a subClass called Cat that overrides the makeSound() method to bark.*/

class Animal{
	
	public void makeSound() {
		System.out.println("All Animals makes sound!");
	}
}

class Cat extends Animal{
	
	public void makeSound() {
		//super.makeSound();
		System.out.println("Cat sounds 'Meow'");
	}
}
public class Ex01 {

	public static void main(String[] args) {
		Cat obj = new Cat();
		obj.makeSound();
	
	}

}

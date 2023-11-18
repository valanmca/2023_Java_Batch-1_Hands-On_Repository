//Method Overriding

package com.jeyandhan.day01;

class Animal{
	
	public void makeSound() { // method
		
		System.out.println("All animals bark");
	}
}

class Cat extends Animal{ 
	
	public void makeSound() { // method overriding
		
		System.out.println("Cat Meows");
	}
}

public class Animals{

	public static void main(String[] args) {
		
		Cat cat = new Cat(); // object creation
		
		cat.makeSound(); // method calling
	}

}

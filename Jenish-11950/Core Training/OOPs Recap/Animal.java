package com.jenish.OopsRecap;

class Animals{
	public void makeSound() {
		System.out.println("All animals make Sounds");
	}
}
class Cat extends Animals{
	public void makeSound() {
		System.out.println("meow");
	}
}
public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat meow = new Cat();
		meow.makeSound();

	}

}

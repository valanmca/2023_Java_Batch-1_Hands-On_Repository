package com.madhan.coreday1;

class Animal
{
	void makeSound()
	{
		System.out.println("Animal make sound");
	}
}

class Cat extends Animal
{
	void makeSound()
	{
//		super.makeSound();
		System.out.println("Cat will make sound meow");
	}
}

public class OverridingAnimal {

	public static void main(String[] args) {
		Animal obj1=new Cat(); //DMD
		obj1.makeSound();
		

	}

}

package com.shiva.day11;

//Method Overriding

class Animal
{
	public void eat()
	{
		System.out.println("All animals eat");
	}
	
	public void speak()
	{
		System.out.println("All animals will make sound");
	}
}

class Dog extends Animal
{
	public void eat()
	{
		System.out.println("Dog eat Chicken");
	}
}
class Cat extends Animal
{
	public void eat()
	{
		System.out.println("Cat eat Fish");
	}
}
public class Overriding {

	public static void main(String[] args) {
		
		Dog dog=new Dog();
		dog.eat();
		
		Cat cat=new Cat();
		cat.eat();

	}

}

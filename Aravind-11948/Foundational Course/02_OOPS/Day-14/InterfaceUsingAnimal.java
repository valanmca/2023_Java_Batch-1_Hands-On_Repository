package com.aravind.day14;

interface AnimalPlan {
	void eat();

	void food();

	void move();

	void wayofMove();

}

abstract class Animal implements AnimalPlan {
	public void eat() {
		System.out.print("I will eat");

	}

	public abstract void food();// optional because we implements animalPlan in Animal it have an copy of all
								// objects

	public void move() {
		System.out.print("I will move");
	}
	
	public abstract void wayofMove();

}

class Dog extends Animal
{
	public void food()
	{
		System.out.println(" chicken");
	}
	public void wayofMove()
	{
		System.out.println("by walk and run");
	}
	
}

class Bird extends Animal
{
	public void food()
	{
		System.out.println("nuts ");
	}
	public void wayofMove()
	{
		System.out.println("by fly");
	}
}
class Fish extends Animal
{
	public void food()
	{
		System.out.println("worms ");
	}
	public void wayofMove()
	{
		System.out.println("by Swim");
	}
}

public class InterfaceUsingAnimal {

	public static void main(String[] args) {
		//System.out.println("Animal class implements the interface AnimalPlan so it have the all four methods in Animal Abstract class"+'\n'+"dog extends Animal it also have all methods but it over ride the eat method and walk method");
		 Dog obj=new  Dog();
		 obj.eat();
		 obj.food();
		 obj.move();
		 obj.wayofMove();
		 
		 
		 System.out.println("Bird");
		Bird obj1=new  Bird();
		 obj1.food();
		 obj1.wayofMove();
		 System.out.println("Fish");
		 Fish obj2=new  Fish();
		 obj2.food();
		 obj2.wayofMove();
		 

	}

}

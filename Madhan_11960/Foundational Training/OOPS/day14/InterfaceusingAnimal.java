package com.madhan.day14;
interface AnimalPlan
{
	int a=10;
	void eat();
	void food();
	void move();
	void wayofMove();
}

 abstract class Animal implements AnimalPlan
{
	public void eat()
	{
		System.out.println("All animals will eat");
	}
	public abstract void food();
	
	public void move()
	{
		System.out.println("All animals  will move ");
	}
	public abstract void wayofMove();
}

 class Dog extends Animal
{
	public void food()
	{
		System.out.println("chicken");
	}
	public void wayofMove()
	{
		System.out.println("Walking around street");
	}
}

class Fish extends Animal
{
	public void food()
	{
		System.out.println("I will eat pori");
	}
	public void wayofMove()
	{
		System.out.println("I will Move in water");
	}
}

public class InterfaceusingAnimal {

	public static void main(String[] args) {
		System.out.println("\t Fish ");
		Fish f=new Fish();
		f.eat();
		f.food();
		f.move();
		f.wayofMove();
		System.out.println(AnimalPlan.a);
		
		

	}

}

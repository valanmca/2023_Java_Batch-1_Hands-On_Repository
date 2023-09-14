package com.mahesh.Oops_day14;

interface Animal_Plan
{
	void eat();
	void food();
	void move();
	void wayofMove();
}

abstract class Animals implements Animal_Plan
{
	public void eat()
	{
		System.out.print("\nI can eat");
	}
	

	public abstract void food();
	public void move()
	{
		System.out.print("I can move one place to another place ");
	}
	
	public abstract void wayofMove();
}
class Lion extends Animals
{
	public void food()
	{
		System.out.print(" meat, ");
	}
	
	public void wayofMove()
	{
		System.out.println(" by walk\n");
	}
}

class Dogie extends Animals
{
	public void food()
	{
		System.out.print(" chicken, ");
	}
	
	public void wayofMove()
	{
		System.out.println(" by walk\n");
	}
}

class Dove extends Animals
{
	public void food()
	{
		System.out.print(" nuts and seeds, ");
	}
	
	public void wayofMove()
	{
		System.out.println(" by fly\n");
	}
}


public class Animal_Class {

	public static void main(String[] args) {
		Lion leo = new Lion();
		leo.eat();
		leo.food();
		leo.move();
		leo.wayofMove();
		
		Dogie dog = new Dogie();
		dog.eat();
		dog.food();
		dog.move();
		dog.wayofMove();

		
		Dove dove = new Dove();
		dove.eat();
		dove.food();
		dove.move();
		dove.wayofMove();
	}

}

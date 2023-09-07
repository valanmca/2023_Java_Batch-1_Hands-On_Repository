package com.madhan.day12;

class Animal
{
	void eat()
	{
		System.out.println("All animal eat");
	}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("Dogs eat chicken");
	
	}
}
class Cat extends Dog
{
	void eat()
	{
		System.out.println("cat drink milk");
	}
}
public class Overridingrevision {

	public static void main(String[] args) {
		Dog c=new Cat();
		c.eat();

	}

}

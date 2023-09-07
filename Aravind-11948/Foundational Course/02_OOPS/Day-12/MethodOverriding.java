package com.aravind.day12;// identify the method using 
class Animal
{
	void eat()
	{
		System.out.println("All animals eat");
	}
}
class Dog extends Animal
{
	void eat()
	{
		this.hai();
		super.eat();
		System.out.println("Dog eat chicken");
	}
	
	void hai()
	{
		
		System.out.println("hai");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Animal obj=new Dog ();
		obj.eat();
		

	}

}

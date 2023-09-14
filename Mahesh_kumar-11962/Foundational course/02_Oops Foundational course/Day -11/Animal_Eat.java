package com.mahesh.Oops_day11;

class Animal
{
	void eat()
	{
		System.out.println("All Animals can eat");
	}
}
class Dog extends Animal
{
	void eat()
	{
	System.out.println("Dog can eat Chicken");
	}
	
}
class Cat extends Animal
{
	void eat()
	{
	System.out.println("Cat can eat Fish");
	}
	
}
public class Animal_Eat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog= new Dog();
		dog.eat();
		
		Cat cat = new Cat();
		cat.eat();
	}

}

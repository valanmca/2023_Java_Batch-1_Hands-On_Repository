package com.shiva.day13;
//Overriding Methods

class Animal
{
	String s=getValue();
	
	String getValue()
	{
		return "A";
	}
}

class Dog extends Animal
{
	String getValue()
	{
		return "B";
	}
}
public class OverridingMethods {

	public static void main(String[] args) {
		
		final int a =0;//the value can't be changed by replacing
		
		Dog dog= new Dog();
		System.out.println(dog.s);
	}

}

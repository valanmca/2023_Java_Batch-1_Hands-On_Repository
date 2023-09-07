package com.aravind.day13;
class Animal
{
	String s=getValue();
	  String getValue()
	{
		return "A";
	}
}

class Dog extends Animal{
	 String getValue()
	{
		return "B";
	}
}

public class OverridingMethodExample {

	public static void main(String[] args) {
		Dog dog=new Dog();
		System.out.println(dog.s);// it is method overriding so it completely based on object
		// so method name is overload it return b.

	}

}

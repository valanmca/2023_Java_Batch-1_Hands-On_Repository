package com.mahesh.core_java;

class Dog{
	void makesound()
	{
		System.out.print("Dog sound bark");
	}
}

class cat extends Dog{
	void makesound()
	{
		System.out.println("Cat sound meow");
	}
}

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cat sound= new cat();
		sound.makesound();

	}

}

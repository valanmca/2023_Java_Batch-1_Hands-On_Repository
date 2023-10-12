package com.oops;
class animal{
	int a=10;
	void makeSound()
	{
		System.out.println("Animal make sound");
	}

}

class cat extends animal{
	
	void makeSound()
	{
//		super.makeSound();
		System.out.println("meow");
	}
}

public class methodOverridingAnimal {

	public static void main(String[] args) {
//		animal obj=new animal();
//		obj.makeSound();
//		
//		cat obj1=new cat();
//		obj1.makeSound();
		
		animal obj3=new cat();
		obj3.makeSound();
		System.out.println(obj3.a);
				
		
	}

}

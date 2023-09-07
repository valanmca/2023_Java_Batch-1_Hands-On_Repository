package com.madhan.day11;
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
//		super.eat();
		System.out.println("All dogs eat");
	}
}

//class Cat extends Dog
//{
//	void eat()
//	{
//		super.eat();
//		System.out.println("All cats eat");
//	}
//}
public class OverridingEx1 {

	public static void main(String[] args) {
//		Cat c=new Cat();
//		c.eat();
		Dog d=new Dog();
		d.eat();
		

	}

}

package com.madhan.day13;

abstract class Parent
{
	 Parent(int a)
	{
		System.out.println(a);
	}
	 void message()
	 {
		 System.out.println("This is Abstract1 class");// In abstract method
	 }
	
	void message1()
	{
		System.out.println("This is Abstract class");
	}
}

class Child1 extends Parent
{
	Child1()
	{
		super(10);
	}
	void message()
	{
		System.out.println("This is First subclass");
	}
	
}

class Child2 extends Parent
{
	Child2()
	{
		super(20);
	}
	void message()
	{
		System.out.println("This is Abstract subclass");
	}
}
public class Abstractionpractice1 {

	public static void main(String[] args) {
//		Child2 ch=new Child2();
//		ch.message();
//		Child1 c=new Child1();
//		c.message();
//		c.message1();
//		
		Parent p=new Child1();
		p.message1();
		

	}

}

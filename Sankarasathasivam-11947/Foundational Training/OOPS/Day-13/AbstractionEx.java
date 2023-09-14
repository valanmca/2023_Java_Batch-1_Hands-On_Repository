package com.shiva.day13;

//Self learning-codesdope

abstract class Parent
{
	abstract void message();//Abstract method
	
	void message1()//Concrete class
	{
	System.out.println("This is Concrete class");
	}
}

class Child extends Parent
{
	void message()
	{
	System.out.println("This is First Sub class");
	}
}

class Child1 extends Child
{
	void message()
	{
	System.out.println("This is Second Sub class");
	}
}

public class AbstractionEx {

	public static void main(String[] args) {
		
		Parent obj=new Child1();
		obj.message();
		
		Child p=new Child();
		p.message();
		p.message1();
	}

}

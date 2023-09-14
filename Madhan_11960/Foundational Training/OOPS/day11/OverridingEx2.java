package com.madhan.day11;

class SuperClass
{
	int a=20; //Instance variable
	int b=20;
	SuperClass(int a) //constructor
	{
		this.a=a;
	}
	
	void display()
	{
		System.out.println(" " +a);
	}
}

class SubClass extends SuperClass
{
	SubClass(int a) //constructor
	{
		
		super(a); //super can be called in different class
		
		super.display();
		System.out.println("Value of a:"+super.a);
	}
}

public class OverridingEx2 {

	public static void main(String[] args) {
		SubClass obj=new SubClass(10);
	}

}

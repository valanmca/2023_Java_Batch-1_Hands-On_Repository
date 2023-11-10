package com.madhan.coreday5;

class A
{
	A() // Default constructor
	{
		System.out.println("A");
	}
	A(int a)
	{
		System.out.println("A1");
	}
}

class B extends A
{
	B()
	{
		super(5); //It will not consider default constructor, it will find parameterized constructor.
		System.out.println("B");
	}
	
}

class C extends A
{
	C()
	{
		System.out.println("C");
	}
	C(int c)
	{
		System.out.println("C1");
	}
}

public class InheritanceConstructor {

	public static void main(String[] args) {
		B obj=new B();
		C obj1=new C(2);

	}

}

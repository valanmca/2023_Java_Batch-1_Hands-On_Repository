package com.shiva.day14;

//Multiple Inheritance Using Interfaces

interface One
{
	int a=10;//Public, static, final
}

interface Two
{
	int a=20;//Public, static, final
}

interface Three
{
	int a=20;//Public, static, final
}

interface Four extends One,Two//Multiple Inheritance
{
	void addition();//public abstract
}

class Calculator2 implements Four
{
	public void addition()
	{
		System.out.println("Addition : "+(One.a+Two.a+Three.a));//To resolve ambiguity issue 
	}
}
public class Interface04 {

	public static void main(String[] args) {
		
		Calculator2 obj=new Calculator2();
		obj.addition();
	}

}

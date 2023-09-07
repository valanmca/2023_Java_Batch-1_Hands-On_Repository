package com.shiva.day14;

//Interfaces
interface MyInterface
{
	void addition(int a,int b);//abstract,public
	void subtraction(int a,int b);
}

class Calculator implements MyInterface
{
	public void addition(int a,int b)
	{
		System.out.println("Addition : "+(a+b));
	}
	public void subtraction(int a,int b)
	{
		System.out.println("Subtraction : "+(a-b));
	}
}

public abstract class Interface01 {

	public static void main(String[] args) {
		MyInterface obj=new Calculator();
		obj.addition(10, 20);
		obj.subtraction(100, 50);

	}

}

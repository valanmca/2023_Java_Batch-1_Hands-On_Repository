package com.madhan.coreday6;

interface One
{
	void addition(int a, int b);
}
interface Two extends One
{
	void subtraction(int a, int b);
}

class Calculator implements Two
{
	public void addition(int a, int b)
	{
		System.out.println("Addition :" +(a+b));
	}
	
	public void subtraction(int a, int b)
	{
		System.out.println("Subtraction :" +(a-b));
	}
}

public class InterfaceEx2 {

	public static void main(String[] args) {
		Calculator calci=new Calculator();
		calci.addition(10,20);
		calci.subtraction(10,20);

	}

}

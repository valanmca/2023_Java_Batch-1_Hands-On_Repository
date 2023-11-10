package com.madhan.coreday6;

interface One1
{
	int a1=10;
}
interface Two1 
{
	int a1=20;
}

interface Three1 extends One1,Two1  //Multiple inheritance
{
	void sum();
}

class Sum implements Three1
{
	public void sum()
	{
		System.out.println("Sum:"+(One1.a1 + Two1.a1));
	}
}

public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		Sum cal=new Sum();
		cal.sum();

	}

}

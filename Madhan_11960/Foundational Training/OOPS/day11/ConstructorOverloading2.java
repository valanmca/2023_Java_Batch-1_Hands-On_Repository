package com.madhan.day11;

class MyClass2
{
	 MyClass2(String name)
	{
		this(5,10);
		System.out.println("Welcome " +name);	
	}
	
	MyClass2(int a)
	{
		this("Madhan");
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial:"+fact);
				
	}
	
	MyClass2(int a,int b)
	{
		int sum=a+b;
		System.out.println("Sum:"+sum);
	}
}


public class ConstructorOverloading2 {

	public static void main(String[] args) {
		MyClass2 obj=new MyClass2(5);

	}

}

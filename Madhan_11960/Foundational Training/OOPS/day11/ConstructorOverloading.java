package com.madhan.day11;

class MyClass1
{
	   MyClass1( String name)
	{
		 
		System.out.println("Welcome " +name);	
	}
	
	 MyClass1(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial:"+fact);
				
	}
	
	MyClass1(int a,int b)
	{
		int sum=a+b;
		System.out.println("Sum:"+sum);
	}
}


public class ConstructorOverloading {

	public static void main(String[] args) {
		MyClass1 obj1=new MyClass1("Madhan");
		MyClass1 obj2=new MyClass1(5);
		MyClass1 obj3=new MyClass1(2,3);
		

	}

}

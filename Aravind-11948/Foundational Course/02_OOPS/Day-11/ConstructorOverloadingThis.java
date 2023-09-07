package com.aravind.day11;
class MyClass2
{
	 MyClass2(String name)
	{
		 this(5);// it will call second constructor fact 
		System.out.println("welcome"+name);
		}
	 MyClass2(int n)
	{
		this(5,10);// it will call third constructor add 
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("factorial ="+fact);
	}
	 MyClass2(int n,int b)
	{
		int c=n+b;
		System.out.println(c);
	}
}

public class ConstructorOverloadingThis {

	public static void main(String[] args) {
		MyClass2 obj1=new MyClass2("aravind");
		
	}

}

package com.aravind.day11;
//for constructor we have to create different object to call constructor


class MyClass1
{
	 MyClass1(String name)
	{
		System.out.println("welcome"+name);
		}
	 MyClass1(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("factorial ="+fact);
	}
	 MyClass1(int n,int b)
	{
		int c=n+b;
		System.out.println(c);
	}
}

// for constructor we have to create different object to call constructor
public class ConstructorOverloading {

	public static void main(String[] args) {
		MyClass1 obj=new MyClass1(5);
		MyClass1 obj1=new MyClass1("aravind");
		MyClass1 obj2=new MyClass1(4,5);
		
		
		

	}

}

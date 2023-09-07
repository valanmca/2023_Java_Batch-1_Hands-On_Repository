package com.madhan.day11;

// overloading means same method name with different arguments
// compile time polymorphism

class MyClass
{
	void myMethod(String name)
	{
		System.out.println("Welcome " +name);	
	}
	
	void myMethod(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial:"+fact);
				
	}
	
	void myMethod(int a,int b)
	{
	    int sum=a+b;
		System.out.println("Sum:"+sum);
	}
}

public class PolymorphismEx1 {

	public static void main(String[] args) {
	    MyClass obj=new MyClass();
	    obj.myMethod(5);
	    obj.myMethod("Madhan");
	    obj.myMethod(2,3);

	}

}

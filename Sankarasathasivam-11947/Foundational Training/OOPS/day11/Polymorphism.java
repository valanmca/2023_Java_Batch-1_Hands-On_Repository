package com.shiva.day11;

//Method Overloading
// here the method name is same but the arguments must be different

class MyClass
{
	void myMethod(String name)
	{
		System.out.println("Welcome : "+name);
	}
	
	void myMethod(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial : "+fact);
	}
	
	void myMethod(int a, int b)
	{
		int sum=a+b;
		System.out.println("Sum of a and b : "+sum);
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		
		MyClass obj=new MyClass();
		obj.myMethod("Shiva");
		obj.myMethod(5);
		obj.myMethod(5,10);

	}

}

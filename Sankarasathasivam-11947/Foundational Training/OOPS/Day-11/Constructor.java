package com.shiva.day11;

//Constructor Overloading

public class Constructor //--(class name)
	{
	Constructor(String name)
	{
		System.out.println("Welcome : "+name);
	}
	
	Constructor(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial : "+fact);
	}
	
	Constructor(int n, int a)
	{
		int sum=n+a;
		System.out.println("Addition : "+sum);
	}
	
	public static void main(String[] args) {
		
		Constructor obj1=new Constructor("Shiva");
		Constructor obj2=new Constructor(5);
		Constructor obj3=new Constructor(50,50);
	}

}

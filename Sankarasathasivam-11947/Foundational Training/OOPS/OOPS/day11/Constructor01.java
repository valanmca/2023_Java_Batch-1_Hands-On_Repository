package com.shiva.day11;

//Using one Object creation - using this()//(keyword)

public class Constructor01 {

	Constructor01(String name)
	{
		this(5);
		System.out.println("Welcome : "+name);
	}
	
	Constructor01(int n)
	{
		this(10,20);
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial : "+fact);
	}
	
	Constructor01(int n, int a)
	{
		int sum=n+a;
		System.out.println("Addition : "+sum);
	}
	
	public static void main(String[] args) {
		
		Constructor01 obj1=new Constructor01("Shiva");
	}

}

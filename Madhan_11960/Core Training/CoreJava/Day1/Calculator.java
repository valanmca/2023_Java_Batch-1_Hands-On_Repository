package com.madhan.coreday1;

class Cal
{
	 int a,b;
	static  int c,d;
	
	Cal(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	int add()
	{
		int c=a+b;
		return c;
	}
	
	int sub()
	{
		int c=a-b;
		return c;
	}
	static void mul(int c,int d)
	{
	
		System.out.println("multiplication :"+c*d);
	
	}
	static void div(int c,int d)
	{
		System.out.println("Division :"+c/d);
		
	
	}
}

public class Calculator {

	public static void main(String[] args) {
	Cal obj1=new Cal(10,20);
	System.out.println("Addition : "+obj1.add());
	System.out.println("Subtraction: "+obj1.sub());
	Cal.mul(5,2);
	Cal.div(10,2);

	}

}

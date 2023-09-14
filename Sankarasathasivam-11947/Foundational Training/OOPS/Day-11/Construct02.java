package com.shiva.day11;

public class Construct02 {
	
	int n;
	
	Construct02()
	{
		this(5);//pointing the n
	}
	
	Construct02(int n)
	{
		this.n=n;//assigning n=5
		this.findFactorial();//finding fact for 5
	}
	
	public void findFactorial()
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial : "+fact);
	}
	public static void main(String[] args) {
		
		Construct02 obj=new Construct02();
	}

}

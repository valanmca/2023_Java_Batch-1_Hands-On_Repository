package com.madhan.day11;

public class ThisKeyExample {
	int n;
	ThisKeyExample()
	{
		this(5);
	}
	ThisKeyExample(int n)
	{
		this.n=n;
		this.findFactorial();
	}
	
	public void findFactorial()
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		ThisKeyExample th=new ThisKeyExample();
		

	}

}

package com.aravind.day11;
public class ThisKey
{
	int n;
	ThisKey()
	{
		this(5);
	}
	ThisKey(int n)
	{
		this.n=n;
		this.findFactorial();
	}
	void findFactorial()
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Fcactorial ="+fact);
	}
	
	
	



	public static void main(String[] args) {// this keyword doent use in static menthod  main method 
		
		ThisKey obj=new ThisKey();
		

	}

}

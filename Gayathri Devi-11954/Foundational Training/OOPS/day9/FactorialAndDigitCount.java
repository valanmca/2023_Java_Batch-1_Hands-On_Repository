package com.gayathri.day9;

public class FactorialAndDigitCount {
	
	int ans=1;
	void factorial(int n)
	{
		for(int i=1;i<=n;i++) {
			ans = ans*i;
		}
		System.out.println("Factorial of "+n+" : "+ans);
	}
	
	static	void digitCount(int n)
	{	int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println("Total digit: "+count);
		
	}

	public static void main(String[] args) {
		FactorialAndDigitCount obj = new FactorialAndDigitCount();
		obj.factorial(5);
		//obj.digitCount(55);

		FactorialAndDigitCount.digitCount(555);
	}
}

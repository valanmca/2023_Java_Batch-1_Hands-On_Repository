package com.dharshu.day9;

public class FactorialAndDigitCount {
	
	void factorial(int n) 
	{	
		int i,fact=1;
		
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("The Factorial of " + n + " is:"+fact);
	}
	
	static void digitCount(int n)
	{
		int count=0;
		while (n > 0) {
			n = n / 10;
			count++;

		}
		System.out.println("Total no.of digits------:" + count);
	}

	public static void main(String[] args) {
		FactorialAndDigitCount obj=new FactorialAndDigitCount();
		obj.factorial(5);
		
		FactorialAndDigitCount.digitCount(12345);

	}

}

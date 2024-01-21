package com.calc;

public class Factorial {
	
	int fact=1;
	
	public int Fact(int n) {
		
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		
		return fact;
	}

}

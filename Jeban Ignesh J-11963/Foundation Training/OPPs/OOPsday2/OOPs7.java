package com.jeban.OOPsday2;

public class OOPs7 {
	
	void factorial(int n) {
		
			int fact = 1;
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
				
			}
			System.out.println(fact);
			
	
		
	}
	
	static void digitcount(int n) {
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		OOPs7 jeban=new OOPs7();
		jeban.factorial(5);
		
		OOPs7.digitcount(675);
		
		

	}

}

package com.jeyavel.OOPS.day9;

public class OopsFactorial {
	
	
	void Factorial(int n) {
		int temp =1;
		for (int i=2;i<=temp ;i++) {	
			temp= n*i;
			
			}
			System.out.println(n);
		}
	
	static void DigitCount(int n) {
		@SuppressWarnings("unused")
		int count=0;
		while(n!=0) {
			count++;
			n/=10;
			
		}
		System.out.println(n);
		
	}

	public static void main(String[] args) {
		OopsFactorial Fact =new OopsFactorial();
		Fact.Factorial(34);
		OopsFactorial.DigitCount(89456);

	}

}

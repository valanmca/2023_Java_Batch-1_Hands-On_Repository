package com.shaji.Day09;

public class Methods1 {

	void factorial(int n) {
		int fact = 1;

		for (int i = 1; i < n + 1; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is " + fact);
	}
	
	static void digitCount(int n) {
		int count = 0;
		while(n!=0) {
			n/=10; // (n = n/10)
			count++;
		}
		System.out.println("Number of Digits: " + count);
	}

	public static void main(String[] args) {
		Methods1 obj = new Methods1();
		obj.factorial(5);
		
		Methods1.digitCount(30);

	}

}

package com.matthew.day09;

public class OopsFactorial {
	//creating an instance for factorial
	void factorial(int n) {
		int temp = 1;
		for (int i = 2;i<n+1;i++) {
			temp*=i;
		}
		System.out.println("Factorial : "+temp);
	}
	
	//creating an static method for digit count
	static void digitCount(int n) {
		int count = 0;
		while(n !=0) {
			count ++;
			n/=10;
		}
		System.out.println("Digit count :"+count);
	} 
	
	public static void main(String[] args) {
		//creating an object for accessing factorial
		OopsFactorial fact = new OopsFactorial();
		fact.factorial(5);
		
		//calling the static digit count by class name 
		OopsFactorial.digitCount(123);

	}

}

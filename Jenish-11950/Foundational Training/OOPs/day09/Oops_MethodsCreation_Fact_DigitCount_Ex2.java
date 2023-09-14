package com.jenish.day09;

public class Oops_MethodsCreation_Fact_DigitCount_Ex2 {
	void factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial " +num+ " is:" +fact);
	}
	static void digitcount(int num) {
		int count=0;
		while (num!=0) {
			num/=10;
			count++;
		}
		System.out.println("DigitCount " +num+ " of:" +count);
	}

	public static void main(String[] args) {
		Oops_MethodsCreation_Fact_DigitCount_Ex2 obj = new Oops_MethodsCreation_Fact_DigitCount_Ex2();
		obj.factorial(6);
		obj.factorial(5);
		
		Oops_MethodsCreation_Fact_DigitCount_Ex2.digitcount(12345);

	}

}

package com.shaji.Day09;

public class SumofVar {
	int a = 10; //Instance Variable
	
	static int b = 20; //Static Variable

	public static void main(String[] args) {
		SumofVar sum = new SumofVar();
		System.out.println("Sum is "+(sum.a + SumofVar.b));

	}

}

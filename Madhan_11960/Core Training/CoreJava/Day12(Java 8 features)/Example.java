package com.madhan.lambda;

@FunctionalInterface
interface MyInterface {
	int calc(int a, int b);	
}

/*class NormalClass implements MyInterface {  //Addition
	public int calc(int a, int b) {
		return a + b;
	}
}

class NormalClass1 implements MyInterface {  //Subtraction
	public int calc(int a, int b) {
		return a - b;
	}
} */
public class Example {

	public static void main(String[] args) {
		MyInterface sum = (a, b) ->  a + b ;
		System.out.println("Additon : " + sum.calc(10, 20));
		
		MyInterface sub = (a, b) ->  a - b ;
		System.out.println("Subtraction : " + sub.calc(10, 20));
	
	}

}

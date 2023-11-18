package com.purushoth.day_14;

interface MyInterface {
	int calc(int a,int b);
}
public class lamda {

	public static void main(String[] args) {
		MyInterface sum=(a,b) -> a + b;
		System.out.println("Sum : "+sum.calc(40, 15));
		MyInterface sub=(a,b) -> a - b;
		System.out.println("Sub : "+sub.calc(30, 10));

	}

}

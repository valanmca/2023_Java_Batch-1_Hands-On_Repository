package com.aravind.day1;

import java.util.*;

public class CalulatorClass {
	public static void main(String[] args) {
		// simple calculator;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the value of a=");

		int a = sc.nextInt();
		System.out.println("enter the value of b=");

		int b = sc.nextInt();
		int add = a + b;
		int sub = b - a;
		int mul = a * b;
		int div = a / b;
		int mod = a % b;
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mod);

	}

}

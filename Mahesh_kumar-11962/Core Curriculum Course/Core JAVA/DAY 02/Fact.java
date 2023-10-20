package com.mahesh.core_java_day_02;

import java.util.*;

public class Fact {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the value : ");
		int val = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= val; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial value is : " + fact);
	}

}

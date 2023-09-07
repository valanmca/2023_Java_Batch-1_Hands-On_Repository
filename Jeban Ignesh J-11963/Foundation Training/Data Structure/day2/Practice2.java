package com.jeban.day2;

import java.util.*;
import java.util.LinkedList;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Factorial of Number:");
		int n = sc.nextInt();

		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;

			System.out.println(" \t" + fact);
		}
		System.out.println("Factorial:" + fact);

	}

}

package com.aravind.day1;

import java.util.*;

public class primeClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag = 0;
		if (n == 0 || n == 1) {
			flag = 1;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				flag = 1;

			}
		}
		if (flag == 1) {
			System.out.println("not a prime");
		} else {
			System.out.println("prime");
		}

	}

}

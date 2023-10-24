package com.gayathri.day2;

import java.util.LinkedList;
import java.util.Scanner;

public class SumOfPrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> primelist = new LinkedList<Integer>();
		int flg;
		int ans=0;
		System.out.println("Enter a limit of number : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i == 1 || i == 0)
				continue;
			flg = 1;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flg = 0;
					break;
				}
			}
			if (flg == 1) {
				// System.out.print(i + " ");
				primelist.add(i);
			}
		}
		System.out.print("Prime numbers are : "+primelist);
		for(int start=0; start<primelist.size();start++) {
			ans = ans + primelist.get(start);
		}
		System.out.println("\nSum of prime numbers : "+ans);
		sc.close();
	}
}

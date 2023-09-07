package com.dharshu.ass;

import java.util.Scanner;

public class Assignment3_3 {

	public static void main(String[] args) {
		int n, count=0, x;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of elements in an array");
		n = sc.nextInt();

		int a[] = new int[n];
		System.out.println("Enter the  elements in an array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("Enter the element of which you want to count number of occurrences:");
        x = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                count++;
            }
        }
        System.out.println("Number of occurence of an element:" + count);

	}

}

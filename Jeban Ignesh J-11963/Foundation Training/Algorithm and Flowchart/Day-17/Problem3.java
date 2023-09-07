package com.jeban.Assignment;

//Java Program to Find Sum and Average of All Elements in an Array
//Java Program to Search Key Elements in an Array
//Java Program to Count the Number of Occurrence of an Element in an Array
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 34, 20, 50 };
		int temp = 0;
//		int temp1=0;
		for (int i = 0; i < arr.length; i++) {
			temp = temp + arr[i];
//			temp1=temp/arr.length;

		}
		System.out.println("sum:" + temp);
		System.out.println("Average:" + temp / arr.length);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Search Value:");
		int search = sc.nextInt();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (search == arr[i]) {
				count++;
				System.out.println("The Value is found:" + i);
			}
		}
		if (count == 0) {
			System.out.println("The Value is not Found");
		}

		System.out.println("Enter the number to find Occurrence:");
		int occ = sc.nextInt();
		int increase = 0;
		for (int i = 0; i < arr.length; i++) {
			if (occ == arr[i]) {
				increase++;
			}
		}
		System.out.println("The number " + occ + " is occurred " + increase + " times");
	}
}

package com.madhan.day17;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array value");
		 int n = sc.nextInt();
		System.out.println("Enter the array values");
		 int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
		 arr[i] = sc.nextInt();
		 }

		int sum = 0;
		 for (int i = 0; i < n; i++) {
		 sum = sum + arr[i];
		 }

		 System.out.println("sum=" + sum);
		int average = sum / n;
		 System.out.println("Average=" + average);

		 // searching
		System.out.println("Enter the vaue to be searched and count the occurrence");
		 int Searchvalue = sc.nextInt();

		int temp = 0;
		 int i, j;
		 for (i = 0; i < n ; i++) {
		 temp = 0;
		
		 if (arr[i] == Searchvalue) {
		 temp = 1;
	     break;
		}
	}
		 if (temp == 1) {
		 System.out.println("Search element is present at index=" + i);
		 }

		 else {
		 System.out.println("Search element is not  present");
		 }

		 // count the occurrence
		 int count=0;
		 for (i = 0; i < n ; i++) {
		 if (arr[i] == Searchvalue) {
		 count++;
		 }
		 }
		 System.out.println("Count="+count);
		}

}

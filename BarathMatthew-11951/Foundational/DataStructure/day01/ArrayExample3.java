package com.matthew.day01;
import java.util.Scanner;
public class ArrayExample3 {

	public static void main(String[] args) {
		//declaring an empty array
		int arr[] = new int[5];
		System.out.println("Initial array values (int) : ");
		for (int i=0;i<arr.length;i++ ) {
			System.out.println(arr[i]);
		}
		// getting input from user
		System.out.println("Enter "+ arr.length+"values :");
		Scanner sc = new Scanner(System.in);
		for (int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		// Displaying after updating		
		System.out.println("new array values (int) : ");
		for (int i=0;i<arr.length;i++ ) {
			System.out.println(arr[i]);
		}
	}
}

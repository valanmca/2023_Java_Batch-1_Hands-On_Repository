package com.muthu.day1;
import java.util.Scanner;
public class arrayExample3 {

	public static void main(String[] args) {
		
		int arr[] = new int[5];// updating or the Element

		System.out.println("initial Array Elements Are:");// printing the element
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter" + arr.length + "values");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) { // ++increment the value true and false condition
			arr[i] = sc.nextInt();
		}
		System.out.println("initial Array Elements Are:");// printing the element
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}

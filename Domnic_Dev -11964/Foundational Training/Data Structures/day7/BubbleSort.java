//Bubble sort in array
package com.domnic.day7;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Elements of array ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		//int arr[] = { 5, 3, 8, 9, 1 };

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}

	}

}



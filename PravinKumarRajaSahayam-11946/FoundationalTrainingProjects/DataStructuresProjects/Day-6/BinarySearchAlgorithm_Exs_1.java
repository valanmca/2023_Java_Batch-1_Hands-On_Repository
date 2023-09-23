package com.pravinkiumar.day6;

//Binary Search Algorithm - Array
import java.util.Scanner;

public class BinarySearchAlgorithm_Exs_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Number:");
		int size = sc.nextInt();
		System.out.println("Enter the List of the size:");
		int key = 0;
		for (int i = 0; i < size; i++) {

			key = sc.nextInt();
		}
		System.out.println("The size of the list : " + key);
		
		System.out.println("Enter the List for the Search:");
		int temp = sc.nextInt();
		int last = 0;
		int first = 0;
		int mid = (first + last) / 2;
		while (first <= last) {
			if (key < temp) {
				first = mid + 1;
			} else if (key == temp) {
				System.out.println("The Element is Found in the given Array : ");
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
			if (first > last) {
				System.out.println("The given Element is Not Found:");
			}
		}
	}

}

package com.pravinkiumar.day6;

import java.util.Scanner;

public class BinarySearchAlgorithm_Exs_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = { 10, 20, 30, 40, 50 };
		int first = 0;
		int last = 0;
		int key = 40;
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("The given Element is Found in the array:");
				break;
			} else {
				last = mid - 1;
			}
		}
		mid = (first + last) / 2;
		if (first > last) {
			System.out.println("The given Element is found:");
		}
	}

}

package com.pravinkiumar.day6;

public class BinarySearchAlgorithm_Exs_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		int beg = 0;
		int end = arr.length - 1;

		int k = 10;

		boolean isPresent = false;
		while (beg <= end) {
			int mid = (beg + end) / 2;
			if (arr[mid] == k) {
				System.out.println("The Element is Present in the Index:");
				isPresent = true;
				break;
			}
			if (arr[mid] < k) {
				beg = mid + 1;
			}
			if (arr[mid] > k) {
				end = mid - 1;
			}

			
			
			
			
		}
		if (isPresent == false) {
			System.out.println("The Element is Not Found : ");
		}
	}

}

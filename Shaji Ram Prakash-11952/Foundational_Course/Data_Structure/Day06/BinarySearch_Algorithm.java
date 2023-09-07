package com.shaji.Day06;

import java.util.Scanner;

public class BinarySearch_Algorithm {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int end = arr.length-1;
		int beg = 0;
		
		int s = 14;
		int count = 0;
		while(beg<=end) {
			
			int mid = (beg+end)/2;
			if(arr[mid]==s) {
				System.out.println("Element is present...");
				count++;
				break;
			}
			if (arr[mid]<s) {
				beg = mid + 1;
				mid = (beg+end)/2;
			}
			if (arr[mid]>s) {
				end = mid-1;
				mid = (beg+end)/2;
			}
		}
		if(count==0) {
			System.out.println("Element is Absent...");
		}
}
}

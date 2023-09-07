package com.shaji.Day07;

public class SelectionSort_Ascending {

	public static void main(String[] args) {
		int arr[] = {5, 1, 3, 2, 4};
				
		for (int i=0; i<arr.length; i++) {
			int min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp ;
		}
		
		for(int i : arr) {
			System.out.println(i);
		}

	}

}

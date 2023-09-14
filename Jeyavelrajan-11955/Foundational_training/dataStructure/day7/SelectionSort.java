

//Selection Sort Algorithm - Array
package com.jeyavel.day7;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {5,1,3,2,4};
		
		
		for(int i=0; i<arr.length;i++) {
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
		for(int i :arr) {
			System.out.println("The Sorted Value Order is  ->"+i);
		}

	}

}

package com.dharshu.day7;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= new int[]{12,5,0,-6,23,10};		
		int temp;
		
		System.out.println("The Ascending Bubble sort");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}System.out.print(" "+arr[i]);
		}
		
		System.out.println("\n\n\nThe Descending Bubble sort");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}System.out.print(" "+arr[i]);
		}
		
	}

}

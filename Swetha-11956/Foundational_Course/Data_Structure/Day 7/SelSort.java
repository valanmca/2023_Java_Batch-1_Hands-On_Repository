package com.swetha.day7;

public class SelSort {

	public static void main(String[] args) {
		
		//Selection sort
		int arr[]= {10,34,20,65,4};
		
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
		
		temp=arr[i];
		arr[i]=arr[min];
		arr[min]=temp;
		

	}
		for(int i:arr) {
			System.out.println(i);
		}

}
}

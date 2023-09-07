package com.dharshu.day7;

public class SelectionSort {
    //selection sort
	//set the first element as the min_value
	//Compare min_value with the second element.
	//If the second element is smaller than min_value, assign the second element as min_value.
	public static void main(String[] args) {
		int arr[]= new int[]{12,5,0,6,23,10};	
		
		int temp;
		for(int i=0;i<arr.length;i++) {
			int min_value=i;//default 1st element is the minimum value
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min_value]>arr[j]) {
					min_value=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min_value];
			arr[min_value]=temp;
		}
		for(int i :arr) { //this is "for each" loop used for traversing 
			//start from the begining and go to end with increment order(+1)
			System.out.print(" "+i);
		}
			
	}

}

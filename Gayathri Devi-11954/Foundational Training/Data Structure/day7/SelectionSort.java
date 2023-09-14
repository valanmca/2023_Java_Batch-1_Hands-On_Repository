package com.gayathri.day7;

public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 0, 5, 21, -8 };
		int temp;
		int min_value;
		for (int i = 0; i < arr.length; i++) {
			min_value=i;//1st element is the minimum
			for (int j = i + 1; j < arr.length; j++) {//0 //5
				if (arr[min_value]>arr[j]) { //1>0 //0>5
					min_value = j; //0
				}
			}
				temp = arr[i];//1
				arr[i] = arr[min_value];//1 =0
				arr[min_value] = temp;//0
			}
		for(int i:arr)//this is "for each" loop used for traversing 
			//start from the beginning and go to end with +1 increment order.
			System.out.print("  "+i);
			
		}
	}


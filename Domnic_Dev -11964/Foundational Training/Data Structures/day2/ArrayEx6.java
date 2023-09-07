package com.domnic.day2;

public class ArrayEx6 {

	public static void main(String[] args) {
		int arr[]=new int[] {10,20,30};
		int temp=0;
		for(int i=0;i<arr.length;i++) {	
			temp=temp+arr[i];
		}
		System.out.println(temp);

	}

}

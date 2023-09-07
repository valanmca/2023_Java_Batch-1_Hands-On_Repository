package com.matthew.day02;

public class ArrayMethod3 {

	public static void main(String[] args) {
		int arr[] = new int[] {20,30,10,40};
		int temp = 0;
		for (int i = 0;i<arr.length;i++) {
			temp+=arr[i];
		}
		System.out.println("The sum of elements in array : "+ temp);
	}

}

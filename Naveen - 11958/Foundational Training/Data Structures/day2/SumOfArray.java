package com.naveen.day2;

public class SumOfArray {

	public static void main(String[] args) {
		int arr[] = new int[] {10,20,30};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		System.out.println("The sum of the array :" +sum);
		

	}

}

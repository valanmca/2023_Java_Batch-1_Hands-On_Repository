package com.matthew.day01;

public class work {

	public static void main(String[] args) {
		int num = 123;
		int count = 0;
		int arr[] = new int[8];
		while (num >0) {
			arr[count] = num%10;
			count++;
			num/=10;
		}
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Length of number"+arr.length);
	}

}

package com.matthew.day01;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int temp = sc.nextInt();
		int arr[] = new int[temp];
		System.out.println("Enter the values : ");
		for (int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
// min max
		int min =arr[0],max = 0;
		for (int i = 0;i<arr.length;i++) {
			if (arr[i]<min) {
				min = arr[i];
			}
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("min :" +min);
		System.out.println("max :"+ max);
	}
}

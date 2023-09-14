package com.matthew.day01;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int temp = sc.nextInt();
		int arr[] = new int[temp];
		System.out.println("Enter the values : ");
		for (int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		// printing array
		for (int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + "| ");
		}
		for (int i=0;i<arr.length;i++) {
			for (int j = i;j<arr.length;j++) {
				
			}
		}
	}

}

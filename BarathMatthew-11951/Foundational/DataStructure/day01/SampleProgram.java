package com.matthew.day01;
import java.util.Scanner;
public class SampleProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter 5 numbers :");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter a number to search in the array : ");
		int temp = sc.nextInt();
		int count = -1;
		for(int i= 0;i<arr.length;i++) {
			if (temp == arr[i]) {
				System.out.println(i);
				count =0;
			}
		}
		if (count == -1) {
			System.out.println(count);
		}
	}

}

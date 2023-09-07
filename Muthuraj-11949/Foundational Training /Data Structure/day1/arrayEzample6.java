package com.muthu.day1;
import java.util.Scanner;

public class arrayEzample6 {

	public static void main(String[] args) {
	System.out.println("Enter the number");
	int  arr[]=new int[] {10,20,30, 40, 50};
	int sum = 0;
	for(int i=0; i<arr.length; i++) {
		sum = sum + arr[i];
	}
	System.out.println("Sum of Array : " + sum);
	

	}

}

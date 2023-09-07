package com.purushoth.day1;
import java.util.Scanner;
public class MaxMin {

	public static void main(String[] args) {
		int arr[]=new int[3];
		System.out.println("Enter "+arr.length+" values");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int max=0;
		int min=arr[0];
		for (int i=0;i<arr.length;i++) {
			if(max < arr[i]) {
				max=arr[i];
			}
			if(min > arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("Maximum value is: "+max);
        System.out.println("Minimum value is: "+min);
	}
}


package com.gayathri.assignment;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter array size : ");
		int arr_size = sc.nextInt();
		
		int arr[]=new int [arr_size];
		System.out.println("Enter array elements....");
		for(int i=0;i<arr_size;i++) {
			arr[i] = sc.nextInt();					
		}
		for(int i=0;i<arr_size;i++) {
			System.out.println(" "+arr[i]);					
		}
		int sum = 0;
		float average = 0;
		
		for (int i = 0; i <= arr.length; i++) {
			sum = sum + i;
		}		
		System.out.println("The Sum is : " + sum);
		
		for (int i = 0; i <= arr.length; i++) {
			average = sum / arr.length;
		}
		System.out.println("The Average is : " + average);
		
		System.out.println("Enter search element : ");
		int search = sc.nextInt();
		int store = 0;
		boolean isPresent = false;
		for (int i = 0; i <= arr.length; i++) {
			if (arr[i] == search) {
				store = i;
				isPresent = true;
				System.out.println("The Element is found in : " + store + " " + "index");
				break;
			}
		}
		if(isPresent==false)
			System.out.println("-1");
		
		for (int i = 0; i <arr.length; i++) {
			int count = 0;
			int number = arr[i];
			while (number != 0) {
				
				number = (number / 10);
				count++;
			}
			System.out.println("\n Total no.of.digits in " + arr[i] + "  : " + count);
		
	}
		sc.close();
	}
}

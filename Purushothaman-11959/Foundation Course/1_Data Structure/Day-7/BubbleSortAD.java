package com.purushoth.day7;
import java.util.Scanner;

public class BubbleSortAD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The elements are: ");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		int temp;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {//changing operator makes ascending to descending
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println("Sorted values in ascending order: ");
		for (int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
	}

}//Bubble sort from ascending to descending order.

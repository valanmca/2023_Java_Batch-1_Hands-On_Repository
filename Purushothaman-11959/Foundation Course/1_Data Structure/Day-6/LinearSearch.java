package com.purushoth.day6;
import java.util.Scanner;


public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int a=sc.nextInt();
		int arr[]=new int[a];
		System.out.println("The elements are: ");
		for (int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The elements are: ");	
		for (int i=0;i<a;i++) {
			System.out.println(arr[i]);
		}
		//int arr[]= {10,5,45,67,89,80,78};

		System.out.println("Enter the search element: ");
		int k=sc.nextInt();
		int search=0;
		for(int i=0;i<a;i++) {
			if(k==arr[i]) {
			System.out.println("Elements present in the index: "+ i);
			search=1;
			break;
			}
		}
		if(search==0) {
			System.out.println("The element is not present");
		}
		
	}
	

}//To search using linear search

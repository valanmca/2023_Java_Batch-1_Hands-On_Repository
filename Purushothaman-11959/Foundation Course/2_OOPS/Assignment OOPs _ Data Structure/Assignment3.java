package com.purushoth.Assignment;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// Sum and Average
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int a=sc.nextInt();
		int arr[]=new int[a];
		System.out.println("Enter the elements: ");
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for (int i=0;i<a;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		System.out.println("Average: "+(sum/a));
		// Search
		System.out.println("Enter the search element: ");
		int search=sc.nextInt();
		int count=0;
		for (int i=0;i<a;i++) {
			if(search==arr[i]) {
				count++;
				System.out.println("The element is found in "+arr[i]+" index "+i);
			}
		}
		if (count==0) {
				System.out.println("The element is not found");
			}
		//Number of occurence.
		System.out.println("Enter the number to find occurence: ");
		int occurence=sc.nextInt();
		int increase=0;
		for (int i=0;i<a;i++) {
			if(occurence==arr[i]) {
				increase++;
			}
		}
		System.out.println("The value "+occurence+" occured "+increase+" times.");

	}
}


